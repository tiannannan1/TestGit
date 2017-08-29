package pers.tnn.test.inoroutputsream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Description: 读取其他进程的程序
 * User: Tian nan nan
 * Date: 2017/8/28
 */
public class WriterToProcess {

    public static void main(String[] args) throws IOException {

        //
        Process process = Runtime.getRuntime().exec("java TestWriter.java");

        try(

                PrintStream ps = new PrintStream(process.getOutputStream())
        ) {
            ps.println("测试");
            ps.println(new WriterToProcess());
        }
    }
}
class TestWriter {

    public static void main(String[] args) {

        try(
                Scanner sc = new Scanner(System.in);
                PrintStream ps = new PrintStream(new FileOutputStream("J:\\file\\out.txt"))
                ) {

            while(sc.hasNext()) {

                // 将输入的内容输出到out.txt文件中
                ps.println("输入的内容：" + sc.next());
            }
        }catch (IOException io) {
            io.printStackTrace();
        }
    }
}