package pers.tnn.test.inoroutputsream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Description: FileOutputStream test
 * User: Tian nan nan
 * Date: 2017/8/25
 */
public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {

        /*
        * 输出内容首先应该读取到内容
        * 然后将读取到的内容输出
        * */
        try(
                // 读取文件
                FileInputStream fis = new FileInputStream("J:\\file\\TestFile.txt");

                // 将读取到的文件输出到指定的文件
                FileOutputStream fos = new FileOutputStream("J:\\file\\newFile.txt");

                PrintStream ps = new PrintStream(fos);
                ) {

            byte b[] = new byte[1024];
           // System.out.println();

            ps.println(new FileOutputStreamTest());
            ps.println("tesing");

            System.out.println();
           /* byte b[] = new byte[1024];
            int hasRead = 0;

            while ((hasRead = fis.read(b)) > 0) {

                fos.write(b,0, hasRead);
            }*/
        }
    }
}
