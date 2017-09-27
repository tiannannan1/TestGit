package pers.tnn.test.networkprogramming.multi_thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Description: 负责读取用户键盘输入的线程
 * User: Tian nan nan
 * Date: 2017/9/9
 */
public class MyClient {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.1.213", 3000);
        // 客户端启动线程，不短读取来自服务器的数据
        new Thread(new ClientThread(s)).start();
        // 获取Socket对应的输出流
        PrintStream ps = new PrintStream(s.getOutputStream());
        String line = null;

        // 不短获取键盘输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((line = br.readLine()) != null) {
            // 将读取的内容写入Socket对应的输出流
            ps.println(line);
        }
    }
}
