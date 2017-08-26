package pers.tnn.test.inoroutputsream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Description: 字符串作为物理节点的字符输入/输出测试。
 * User: Tian nan nan
 * Date: 2017/8/25
 */
public class StringNoteTest {

    public static void main(String[] args) throws IOException {

        String strR = "面朝大海，穿暖花开！";
        char [] str = new char[10];
        int hasReader = 0;

        try(
                // 创建一个新的字符串阅读器
                StringReader sr = new StringReader(strR);

                // 使用默认的初始字符串缓冲区大小创建一个新的字符串写入程序，也可指定大小
                // 实际上以StringBuilder为输出节点，因为String是不可变的。
                StringWriter sw = new StringWriter();
                ) {

            // 循环读取到的字符
            while((hasReader = sr.read(str)) > 0) {

                // 使用writer方法写字符串
                sw.write(new String(str, 0, hasReader));
                System.out.println(sw.toString());
            }
        }
    }
}
