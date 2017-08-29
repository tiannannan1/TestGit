package pers.tnn.test.inoroutputsream;

import java.io.*;

/**
 * Description: 推回输入流测试
 * User: Tian nan nan
 * Date: 2017/8/25
 */
public class PushbackInputStreamTest {

    public static void main(String[] args) throws IOException {

        try(
                // 创建一个推回缓冲区大小为10的推回输入流
                //PushbackInputStream pushbackInputStream = new PushbackInputStream(new FileInputStream("J:\\file\\TestFile.txt"), 10);
                PushbackReader pushbackReader = new PushbackReader(new FileReader("J:\\file\\TestFile.txt"), 10);
                ) {
            //byte[] pushB = new byte[2];
            //byte[] read = new byte[12];
            // 如果推回内容长度大于推回缓冲区的长度(> 10)，则会引发Pushback buffer overflow
            char[] chars = new char[5];

            pushbackReader.unread(chars);

            //pis.unread(pushB);
            String lastContent = "";

            int hasRead = 0;
            //int hasReadP = 0;

            while ((hasRead = pushbackReader.read(chars)) > 0) {

                System.out.println(new String(chars, 0 , hasRead));
            }

           /* while((hasRead = pushbackInputStream.read(chars)) > 0) {

                String content = new String(chars, 0, hasRead);

                System.out.println("content:" + content);

                int targetIndex = 0;

                //
                if((targetIndex = (lastContent + content).indexOf("1")) > 0) {

                    pushbackInputStream.unread((lastContent + content).toCharArray());
                    if(targetIndex > 5) {

                        chars = new char[targetIndex];
                    }

                    pushbackInputStream.read(chars, 0, targetIndex);

                    System.out.println("if:" + new String(chars, 0, targetIndex));

                    System.exit(1);

                }else {

                    System.out.println("else:" + lastContent);
                }
            }*/
        }
    }
}
