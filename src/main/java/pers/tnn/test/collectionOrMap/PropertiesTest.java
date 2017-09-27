package pers.tnn.test.collectionOrMap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/11
 */
public class PropertiesTest {

    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.setProperty("user", "admin");
        properties.setProperty("password", "123456");

        System.out.println("properties：" + properties); // {user=admin, password=123456}
        System.out.println("get()方法获取user的属性值:" + properties.get("user"));// admin
        System.out.println("getProperty()方法获取user的属性值:" + properties.get("user"));// admin
        System.out.println("有默认值的getProperty()获取user对应的属性值：" + properties.getProperty("user", "test"));// admin
        System.out.println("有默认值的getProperty()获取test对应的属性值：" + properties.getProperty("test", "test"));// test

        // 往properties中添加新的key-value对
        System.out.println(properties.setProperty("test", "test")); // 返回值：null

        Properties properties2 = new Properties();

        try {
            // 将properties中的key-value对写入PropertiesXml.xml中
            properties.store(new FileOutputStream("PropertiesXml.xml"), "test");

            // 将PropertiesXml.xml中的信息读取到properties2中
            properties2.load(new FileInputStream("PropertiesXml.xml"));

            System.out.println("properties2：" + properties2);// 输出结果为：{user=admin, password=123456, test=test}

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
