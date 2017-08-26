package pers.tnn.test.inoroutputsream;

import java.io.FileReader;
import java.io.IOException;

/**
 * Description: 字符流FileReader test
 * User: Tian nan nan
 * Date: 2017/8/24
 */
public class FileReaderTest {

    public static void main(String[] args) throws IOException{

        try(
                // 使用try关闭资源
                FileReader fileReader = new FileReader("J:\\Users\\khcm\\IdeaProjects\\TestGit\\src\\main\\java\\pers\\tnn\\test\\inoroutputsream\\FileReaderTest.java");
                ) {

            char[] chars = new char[1024];
            int hasRead =0;

            while((hasRead = fileReader.read(chars)) > 0) {

                System.out.println(new String(chars, 0, hasRead));
            }
        }
    }
}
