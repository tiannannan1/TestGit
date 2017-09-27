package pers.tnn.test.networkprogramming.multi_thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Description: 读取Socket输入流中的内容，并将这些内容打印在控制台上
 * User: Tian nan nan
 * Date: 2017/9/9
 */
public class ClientThread implements Runnable {
    // 该线程负责处理的Socket
    Socket s = null;
    // 该线程所处理的该Socket对应的输入流
    BufferedReader br = null;

    public ClientThread(Socket s)throws IOException {
        this.s = s;
         br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    @Override
    public void run() {
        try{
            String content = null;
            // 读取Socket输入流中的内容，并将内容打印
            while ((content = br.readLine()) != null) {

                System.out.println("Client:"+ content);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
