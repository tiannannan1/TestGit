package pers.tnn.test.inoroutputsream;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.SortedMap;

/**
 * Description: charset test
 * User: Tian nan nan
 * Date: 2017/8/31
 */
public class CharsetTest {

    public static void main(String[] args) throws Exception {

        Charset c = Charset.defaultCharset();
        // 获取Charset所支持的全部字符集
        SortedMap<String, Charset> sortedMap = Charset.availableCharsets();

        for(String str : sortedMap.keySet()) {

            //System.out.println(str + "：" + sortedMap.get(str));
        }

        // 获得简体中文的Charset
        Charset charset = Charset.forName("GBK");

        // 分别获得解码器和编码器
        CharsetDecoder charsetDecoder = charset.newDecoder();
        CharsetEncoder charsetEncoder = charset.newEncoder();

        CharBuffer charBuffer = CharBuffer.allocate(9);
        charBuffer.put("一");
        charBuffer.put("二");
        charBuffer.put("三");
        // 避免读出null
        charBuffer.flip();

        // 将CharBuffer转成ByteBuffer >编码
        ByteBuffer byteBuffer = charset.encode(charBuffer);
        System.out.println(byteBuffer.toString());
        //
        for(int i = 0; i < byteBuffer.capacity(); i++) {

            System.out.println(byteBuffer.get());
        }

        // 读取之后必须将重置Buffer，否则读取不到数据
        byteBuffer.clear();
        // 将ByteBuffer转成CharBuffer > 解码
        CharBuffer charBuffer1 = charsetDecoder.decode(byteBuffer);
        System.out.println(charBuffer1);
    }
}
