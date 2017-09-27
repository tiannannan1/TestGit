package pers.tnn.test.inoroutputsream;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Description: RandomAccessFileTest
 * User: Tian nan nan
 * Date: 2017/8/29
 */
public class RandomAccessFileTest {

    public static void main(String[] args) {

        try(
                // 创建一个只有读写功能的RandomAccessFile
                RandomAccessFile raf = new RandomAccessFile("J:\\file\\out.txt", "r");
                // 创建一个具有读写和修改的RandomAccessFile
                RandomAccessFile raff = new RandomAccessFile("J:\\file\\TestFile.txt", "rws");
                ){

            byte[] b = new byte[90];

            int hasReade = 0;

            // 在原文件的最后添加读取的内容，如果不是在最后添加，则原文件的内容将会被覆盖
            raff.seek(raff.length());

            while((hasReade = raf.read(b)) > 0) {
                // 输出读取到的内容
                System.out.println( new String(b, 0, hasReade));

                // 将读到内容写到文件中去
                raff.write(b, 0, hasReade);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
