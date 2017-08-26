package pers.tnn.test.inoroutputsream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description: 输出字符流 FileWriter test
 * User: Tian nan nan
 * Date: 2017/8/25
 */
public class FileWriterTest {

    public static void main(String[] args) throws IOException {

        try(
                FileReader fr = new FileReader("J:\\file\\TestFile.txt");
                FileWriter fw = new FileWriter("J:\\file\\newFileByWriter.txt");


                ) {
            char [] c = new char[1024];
            int hasReader = 0;

            // 将读取到的内容输出到文件中
            while((hasReader = fr.read(c)) > 0) {

                fw.write(c, 0, hasReader);
            }
            // 将指定的文件输出到文件中
            fw.write("带不走的\r\n");
            fw.write("留不下的\r\n");
            fw.write("就让大雨冲刷吧！\n");

            fw.flush();
        }
    }
}
