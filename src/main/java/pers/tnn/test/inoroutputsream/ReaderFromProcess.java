package pers.tnn.test.inoroutputsream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description: 读取进程的输入信息
 * User: Tian nan nan
 * Date: 2017/8/28
 */
public class ReaderFromProcess {

    public static void main(String[] args) throws IOException {

        // 运行javac命令，返回该命令的子进程
        Process p = Runtime.getRuntime().exec("javac");

        try(
                // 以p进程的错误流创建
                // 错误流相对于程序为输入流，对于p进程是输出流
                //BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                ) {
            String buffer = null;

            // 将读取的内容输出
            while((buffer = br.readLine()) != null) {

                System.out.println(buffer);
            }
        }
    }
}
