package pers.tnn.test.networkprogramming;

import java.net.InetAddress;

/**
 * Description: Internet协议IP
 * User: Tian nan nan
 * Date: 2017/9/8
 */
public class InetAddressTest {

    public static void main(String[] args) {

        try {
            // 获取本机IP对应的InetAddress实例
            //InetAddress inetAddress = InetAddress.getLocalHost();
            // 根据主机名称获取IP地址
            InetAddress inetAddress = InetAddress.getByName("192.168.1.213");
            // 判断是否可以到达
            System.out.println(inetAddress.isReachable(2000));
            // 返回回送地址，此处为本机IP
            System.out.println(inetAddress.getHostAddress());
            // 获取IP地址的主机名
            System.out.println(inetAddress.getHostName());
            // 获取此IP的全限定域名
            System.out.println(inetAddress.getCanonicalHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
