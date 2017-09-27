package pers.tnn.test.networkprogramming;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Description: url编码和解码
 * User: Tian nan nan
 * Date: 2017/9/8
 */
public class UrlEnOrDecodeTest {

    public static void main(String[] args) {

        try {
            // 将给定的字符串使用特定的方案转化为application/x-www-form-urlencoded格式
            System.out.println(URLEncoder.encode("百度", "UTF-8"));
            // 使用特定的编码方案解码 application/x-www-form-urlencoded字符串。
            // 如果解码时设定的编码方案和编码时的方案不一致将导致乱码
            System.out.println(URLDecoder.decode("%E7%99%BE%E5%BA%A6", "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
