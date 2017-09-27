package pers.tnn.test.networkprogramming.multi_thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Description: 负责接收客户端Socket的连接请求，每个Socket连接到该ServerSocket后，将对应的Socket加入集合中保存，并未该Socket
 * 启动一个线程，该线程负责处理该Socket所有的通信任务
 * User: Tian nan nan
 * Date: 2017/9/9
 */
public class MyServer {
    // 定义保存所有Socket的ArrayList，并将其包装成线程安全的
    public static List<Socket> socketList = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws IOException{

        ServerSocket ss = new ServerSocket(3000);
        while(true) {
            // 此行代码会阻塞，将一直等待别人的连接
            Socket s = ss.accept();
            socketList.add(s);
            // 每当客户端请求成功后，启动一条线程为该客户端服务
            new Thread(new ServerThread(s)).start();
        }
    }
}
