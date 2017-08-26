package pers.tnn.test.inoroutputsream;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description: 转换流测试
 * User: Tian nan nan
 * Date: 2017/8/25
 */
public class InputStreamReaderTest {

    public static void main(String[] args) throws IOException {

        try(
                // 将字节输入流转化为字符流输入流(System.in是InputStream的实例)
                InputStreamReader isr = new InputStreamReader(System.in);

                // 将普通的reader包装成具有缓冲功能的BufferedReader
                BufferedReader bufferedReader = new BufferedReader(isr);
                ) {
            String str = null;
            // 只有读到换行符时才打印之前输入的内容，即在输入完按下回车时
            while (StringUtils.isNotBlank(str = bufferedReader.readLine())) {

                System.out.println("输出输入的内容：" + str);
            }
        }
    }
}
