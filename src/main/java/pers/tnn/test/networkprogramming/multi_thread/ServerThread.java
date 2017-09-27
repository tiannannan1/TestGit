package pers.tnn.test.networkprogramming.multi_thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Description: 负责处理每个线程通信的线程类
 * User: Tian nan nan
 * Date: 2017/9/9
 */
public class ServerThread implements Runnable {

    // 定义当前线程处理的Socket
    Socket s = null;
    // 该线程所处理的该Socket对应的输入流
    BufferedReader br = null;

    public ServerThread(Socket s) throws IOException {
        this.s = s;
        // 初始化该Socket对应的输入流
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    @Override
    public void run() {
        try{
            String content = null;
            // 采用循环不短从Socket中读取客户端发送来的数据
            while ((content = readFromClient()) != null) {

                // 遍历每个Socket，将读到的内容向每个Socket发送一遍
                for(Socket s : MyServer.socketList) {
                    PrintStream ps = new PrintStream(s.getOutputStream());
                    ps.println(content);
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    // 定义从客户端读取的数据的方法
    public String readFromClient() {

        try {
            return br.readLine();
        } catch (IOException e) {// 如果捕捉到异常，则Socket所对应的客户端已经关闭
            // 删除该Socket
            MyServer.socketList.remove(s);
        }
        return  null;
    }
}
