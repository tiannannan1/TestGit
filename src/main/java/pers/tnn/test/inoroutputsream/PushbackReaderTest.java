package pers.tnn.test.inoroutputsream;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/**
 * Description: 测试PushbackReader
 * User: Tian nan nan
 * Date: 2017/8/28
 */
public class PushbackReaderTest {

    public static void main(String[] args) {

        try(

                FileReader fileReader = new FileReader("J:\\file\\TestFile.txt");

                PushbackReader pushbackReader = new PushbackReader(fileReader)
        ) {
            char[] c = new char[10];

            int hasReader = 0;

            while ((hasReader = fileReader.read(c)) > 0) {

               // System.out.println(hasReader);
                System.out.println(new String(c, 0, hasReader));
            }

        }catch (IOException e) {

            e.printStackTrace();
        }
    }
}
