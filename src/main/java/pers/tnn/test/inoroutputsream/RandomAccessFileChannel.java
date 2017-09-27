package pers.tnn.test.inoroutputsream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Description: RandomAccessFile产生的Channel是只读还读写取决于RandomAccessFile的访问模式
 * User: Tian nan nan
 * Date: 2017/8/31
 */
public class RandomAccessFileChannel {

    public static void main(String[] args) {

        File file = new File("J:\\file\\out.txt");

        try(
                // 创建一个可以读写的RandomAccessFile，而FileChannel的模式取决于RandomAccessFile
                // 所以FileChannel具有读写功能
                RandomAccessFile accessFile = new RandomAccessFile(file, "rw");
                FileChannel fileChannel = accessFile.getChannel())

        {
            // 将Channel里面的数据全部映射到ByteBuffer中
            ByteBuffer byteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY,0, file.length());
            // 将记录指针移到该Channel的最后,会把buffer中的内容追加到文件的最后=每次执行程序会把文件的内容复制一份追加到文件的最后
            fileChannel.position(file.length());
            // 将buffer中的内容全部输出
            fileChannel.write(byteBuffer);

        }catch(IOException e) {

            e.printStackTrace();
        }
    }
}
