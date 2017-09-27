package pers.tnn.test.networkprogramming;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Description: 半关闭Socket
 * User: Tian nan nan
 * Date: 2017/9/9
 */
public class HalfShutdown {

    public static void main(String[] args) {

        try(
                ServerSocket ss = new ServerSocket(30000);
                Socket s = ss.accept();
                PrintStream  ps = new PrintStream(s.getOutputStream());
                ) {

            System.out.println(ss.toString());
            ps.println("服务器的第一行数据");
            ps.println("服务器的第二行数据");
            // 关闭输出流，表示输出流已经结束
            //s.shutdownOutput();
            System.out.println("Socket是否关闭" + s.isClosed());
            System.out.println("Socket的输出流是否关闭" + s.isOutputShutdown());
            Scanner scanner = new Scanner(s.getInputStream());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
