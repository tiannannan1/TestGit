package pers.tnn.test.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Description: java7中try块自动关闭资源
 * User: Tian nan nan
 * Date: 2017/8/18
 */
public class AutoCloseTest {

    public static void main(String[] args) throws IOException {

        try (
                // 声明初始化可自动关闭的资源
                BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest.java"));
                ) {
            // 使用可自动关闭的资源
            System.out.println(br.readLine());
        }
    }
}
