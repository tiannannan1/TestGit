package pers.tnn.test.inoroutputsream;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * Description: 文件锁应用
 * User: Tian nan nan
 * Date: 2017/9/1
 */
public class FileLockTest {

    public static void main(String[] args) throws Exception {

        File file = new File("J:\\file\\out.txt");

        try(
                // 获取文件
                FileChannel fileChannel = new FileInputStream(file).getChannel();

                //
                //FileChannel outFileChannel = new FileOutputStream(file).getChannel();

                // 使用阻塞方式对文件加锁,如果未设置“锁”的类型，会报NonWritableChannelException
                FileLock fileLock = fileChannel.lock(0, 4, true)
                ) {

            ByteBuffer byteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            // 避免读出null
            byteBuffer.flip();
            // 为读数据做准备，不然position不为0读不出数据
            byteBuffer.clear();

            Charset charset = Charset.forName("UTF-8");
            // 解码器对象
            CharsetDecoder charsetDecoder = charset.newDecoder();
            // 使用解码器将ByteBuffer转化为CharBuffer
            CharBuffer charBuffer =  charsetDecoder.decode(byteBuffer);
            // 调用toString()方法输出对应的字符串
            System.out.println(charBuffer.toString());
            // 释放文件锁
            fileLock.release();
            // 验证文件锁是否还有效
            System.out.println(fileLock.isValid());
        }
    }
}
