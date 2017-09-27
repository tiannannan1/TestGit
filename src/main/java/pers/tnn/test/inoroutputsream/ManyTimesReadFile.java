package pers.tnn.test.inoroutputsream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * Description:
 * User: Tian nan nan
 * Date: 2017/8/31
 */
public class ManyTimesReadFile {

    public static void main(String[] args) {

        File file = new File("J:\\file\\out.txt");//12345
        int count = 1;

        try(
                FileChannel fileChannel = new FileInputStream(file).getChannel())
        {
            ByteBuffer byteBuffer = ByteBuffer.allocate(3);

            while(fileChannel.read(byteBuffer) != -1) {
                // 锁定空白区域，避免读出null
                byteBuffer.flip();

                Charset charset = Charset.forName("UTF-8");
                CharsetDecoder charsetDecoder = charset.newDecoder();
                CharBuffer charBuffer = charsetDecoder.decode(byteBuffer);

                System.out.println(count + ">>" + charBuffer);
                // 将buffer初始化，为下一次读取做准备
                byteBuffer.clear();
                count++;
            }

        }catch(IOException e) {

            e.printStackTrace();
        }
    }
}
