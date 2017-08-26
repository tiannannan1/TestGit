package pers.tnn.test.inoroutputsream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Description: 字节流测试
 * User: Tian nan nan
 * Date: 2017/8/24
 */
public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {

        try(
                //创建字节输入流
                FileInputStream fis = new FileInputStream("J:\\Users\\khcm\\IdeaProjects\\TestGit\\src\\main\\java\\pers\\tnn\\test\\inoroutputsream\\FileInputStreamTest.java");

                //FileInputStream fis = new FileInputStream(""FileInputStreamTest.java); // 系统找不到指定的文件

                ) {

            //创建一个长度为1024的竹筒
            byte[] bbuf = new byte[1024];
            //用于保存实际读取的字节数
            int hasRead = 0;
            //使用循环来重复“取水”的过程
            while((hasRead = fis.read(bbuf))>0)
            {
                //取出"竹筒"中(字节),将字节数组转成字符串输入
                System.out.println(new String(bbuf,0,hasRead));
            }
        }
    }
}
