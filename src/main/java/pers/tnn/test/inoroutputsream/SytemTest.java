package pers.tnn.test.inoroutputsream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Description: Sytstem相关测试
 * User: Tian nan nan
 * Date: 2017/8/28
 */
public class SytemTest {

    public static void main(String[] args) {

        try (

                // 一次性创建输出流
                PrintStream ps = new PrintStream(new FileOutputStream("J:\\file\\out.txt"));

                // 输入流
                FileInputStream fis = new FileInputStream("J:\\file\\out.txt");
                ){
            // 将输出重定向到ps输出流
            System.setOut(ps);

            System.out.println("普通的字符串");

            System.out.println(new SytemTest());
        }catch (IOException e) {

            e.printStackTrace();
        }
    }
}
