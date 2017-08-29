package pers.tnn.test.inoroutputsream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Description: 重定向输入
 * User: Tian nan nan
 * Date: 2017/8/28
 */
@SuppressWarnings("unchecked")
public class SystemInTest {

    public static void main(String[] args) {

        //  标准输入，接收键盘输入的内容
        /*Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            System.out.println(scanner.next());
        }*/

        // 使用重定向输入
        try(
                FileInputStream fis = new FileInputStream("J:\\file\\newFileByWriter.txt")
        ) {
            // 将标准输入重定向到fis输入流，程序将不会等待键盘输入，而是直接输出指定文件的内容
            System.setIn(fis);

            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {

                System.out.println(sc.next());
            }

            System.out.println(Runtime.getRuntime());
        }catch (IOException i) {

            i.printStackTrace();
        }
    }
}
