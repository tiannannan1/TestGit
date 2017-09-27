package pers.tnn.test.networkprogramming;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description: 基于TCP协议的网络通信
 * User: Tian nan nan
 * Date: 2017/9/9
 */
public class Server {

    public static void main(String[] args) throws IOException {
        // 创建一个ServerSocket,用于监听客户端的Socket
        // 端口0表示端口号自动分配的
        ServerSocket ss = new ServerSocket(30000);

        // 使用循环不断接受来自客户端的请求
        while(true) {
            // 每当接收一个客户端Socket，服务器端就产生一个Socket
            Socket s = ss.accept();
            s.setSoTimeout(10000);
            System.out.println("socket:" + 1);
            PrintStream pw = new PrintStream(s.getOutputStream());

            System.out.println(pw);
            pw.println("test Server");
            //pw.flush();
            pw.close();
            s.close();
           // ss.close();
        }
    }
}
