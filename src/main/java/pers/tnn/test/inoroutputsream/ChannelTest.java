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
 * Description: channel相关测试
 * User: Tian nan nan
 * Date: 2017/8/31
 */
public class ChannelTest {

    public static void main(String[] args) {

        File file = new File("J:\\file\\out.txt");

        try(
                // 虽然Channel既可以读，也可以写，但是FileInputStream或得的FileChannel只能读，
                // 所以FileOutputStream获得的FileChannel只能写。
                FileChannel inFileChannel = new FileInputStream(file).getChannel();
                //FileChannel outFileChannel = new FileOutputStream("J:\\file\\new.txt").getChannel()
        ) {
            // 将FileChannel里面的数据全部映射成ByteBuffer
            ByteBuffer byteBuffer = inFileChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());

            // 将ByteBuffer中的数据全部读到文件中
            //outFileChannel.write(byteBuffer);

            // clear()方法不是清空数据，而是将limit = position，position设置为0，为读数据做准备。
            byteBuffer.clear();

            /*
            * 将ByteBuffer转化为CharBuffer
            * */
            // 使用UTF-8的字符集创建解码器
            Charset charset = Charset.forName("UTF-8");
            // 解码器对象
            CharsetDecoder charsetDecoder = charset.newDecoder();
            // 使用解码器将ByteBuffer转化为CharBuffer
            CharBuffer charBuffer =  charsetDecoder.decode(byteBuffer);
            // 调用toString()方法输出对应的字符串
            System.out.println(charBuffer.toString());

        }catch(IOException e) {

            e.printStackTrace();
        }
    }
}
