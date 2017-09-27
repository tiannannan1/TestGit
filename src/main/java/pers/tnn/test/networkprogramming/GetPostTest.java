package pers.tnn.test.networkprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Description: 向web发送GET，POST请求，并从web站点获得响应
 * User: Tian nan nan
 * Date: 2017/9/8
 */
public class GetPostTest {

    // 请求参数满足 name1=value1&name2=value2的形式
    public static String sendGet(String url, String param) {

        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置一般请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("connection", "Mozilla/4.0 (compatible; MISE 6.0; Windows NT 5.1; SV1)");
            // 建立实际连接
            conn.connect();
            // 获取所有响应的头字段
            Map<String, List<String>> map = conn.getHeaderFields();
            // 遍历所有响应的头字段
            for(String key : map.keySet()) {

                System.out.println(key + "--》" + map.get(key));
            }

            // 定义BufferReader输入流读取URL的响应
            try(
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(conn.getInputStream(), "UTF-8")))
            {
                String line;
                while((line = in.readLine()) != null) {

                    result += "\n" + line;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // 请求参数满足 name1=value1&name2=value2的形式
    public static String sendPost(String url, String param) {

        String result = "";
        String urlName = url + "?" + param;

        try {
            URL realUrl = new URL(urlName);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置一般请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("uer-agent", "Mozilla/4.0 (compatible; MISE 6.0; Windows NT 5.1; SV1)");
            //发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 建立实际连接
            conn.connect();

            try(
                    // 获取URLConnection的输出流
                    PrintWriter out = new PrintWriter(conn.getOutputStream()))
            {
                // 设置请求参数
                out.println(param);
                // flush输出流的缓冲
                out.flush();
            }

            // 定义BufferReader输入流读取URL的响应
            try(
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(conn.getInputStream(), "UTF-8")))
            {
                String line;
                while((line = in.readLine()) != null) {

                    result += "\n" + line;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String[] args) {

        // 发送Get请求
        String str = sendGet("http://localhost:8080/testGit/index.jsp", null);
        System.out.println(">>>>>>>Get>>>>>>>>>" + str);

        // 发送POST请求
        String string = sendPost("http://localhost:8080/testGit/index.jsp", "name=crazy&pass=lean");
        System.out.println("---------post----------" + string);
    }
}
