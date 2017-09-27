package pers.tnn.test.inoroutputsream;

import java.io.*;

/**
 * Description: 在指定文件指定位置中插入内容
 * User: Tian nan nan
 * Date: 2017/8/29
 */
public class InsertContentTest {

    public static void main(String[] args) throws IOException {

        /*
        * 1.创建临时文件存储将要插入内容文件的信息
        * 2.将原文件的内容读到临时文件中
        * 3.把要插入的内容插入到原文件
        * 4.再把原来读取出来的内容放回去
        * */
        // 在默认临时文件目录中创建一个空文件，有指定的前缀和后缀生成其名称
        File temp = File.createTempFile("temp", "File");
        // 请求在虚拟机终止时删除该抽象路径表示的文件或目录
        temp.deleteOnExit();

        try(
                RandomAccessFile raf = new RandomAccessFile("J:\\file\\out.txt", "rws");
                // 使用临时文件保存插入点后的数据
                FileInputStream fis = new FileInputStream(temp);
                FileOutputStream fos = new FileOutputStream(temp))
        {

            //设置插入点，从此插入点开始读取
            raf.seek(20);
            // 将插入点后的内容保存到临时文件中
            byte[] bytes = new byte[1024];

            int hasRead = 0;

            while((hasRead = raf.read(bytes)) > 0) {

                fos.write(bytes, 0, hasRead);
            }

            // 将文件指针重新定位到pos位置，执行插入
            raf.seek(20);

            // 插入新的内容
            raf.write("我是插入的内容\r\n".getBytes());

            // 将原来的内容重新放入
            while((hasRead = fis.read(bytes)) > 0) {

                raf.write(bytes, 0, hasRead);
            }
        }
    }
}
