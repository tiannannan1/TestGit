package pers.tnn.test.networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/9/9
 */
public class Client {

    public static void main(String[] args) throws IOException {

        //Socket s = new Socket("192.168.1.213", 30000)
        Socket s = new Socket();
        s.connect(new InetSocketAddress("192.168.1.213", 30000), 100);
        // 将Socket对应的输入流包装成BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // 进行普通流的操作
        String line = br.readLine();
        System.out.println("来自服务器的数据：" + line);
        // 关闭输入流、socket
        br.close();
        s.close();
    }
}
