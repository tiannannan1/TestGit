package pers.tnn.test.collectionOrMap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Description: java集合类测试
 * User: Tian nan nan
 * Date: 2017/8/7
 */
public class Test {

    private int hash;

    public static void main(String[] args) {

        String a = new String("ABF");
        System.out.println(a.hashCode());

        List<String> strList = new LinkedList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        strList.add("D");

        // Lambda表达式
        strList.forEach(str -> System.out.println("Lambda表达式：" + str));

        // 匿名内部类
        strList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {

                System.out.println("匿名内部类：" + s);
            }
        });

        // 普通for循环
        for(String str : strList) {

            System.out.println("for循环：" + str);
        }

        // Iterator遍历
        Iterator iterator = strList.iterator();

        /*
        * Iterator类的forEachRemaining
        * */
        //iterator.forEachRemaining(str -> System.out.println("iterator的foreach：" + str));

        while (iterator.hasNext()) {

            String str  = (String )iterator.next();

            System.out.println("iterator遍历：" + str);

            if(str.equals("B")) {

                System.out.println("remove");

                iterator.remove();// 删除上一次next()返回来的值
            }
        }

        System.out.println(strList.size());

        /*
        * java8新增的Predicate
        * */
        List<String> strings = new LinkedList<>();
        strings.add("abcdefg");
        strings.add("abcdef");
        strings.add("abcde");
        strings.add("abcd");
        strings.add("abc");

        strings.removeIf(str -> str.length() < 4); // Predicate

        strings.forEach(str -> System.out.println(str)); // Consumer

        System.out.println(countNub(strings,str -> ((String) str).contains("abcd")));
        System.out.println(countNub(strings,str -> ((String) str).contains("abcdefg")));
        System.out.println("stream distinct count:" + strings.stream().distinct().count());
        //strings.stream().mapToInt()

        // TreeSet相关测试
        TreeSet ts = new TreeSet();
        ts.add("abc");
        ts.add("xyz");
        ts.add("efg");

        System.out.println("TreeSet排序测试：" + ts);

        String str1 = "A";
        System.out.println("String 的默认比较方法：" + str1.compareTo("C"));

       // System.out.println("A".hashCode());

        Properties properties = new Properties();
        properties.setProperty("test", "test");
        try {
            properties.store(new FileOutputStream("c.properties"), "test");
            properties.load(new FileInputStream("c.properties"));

            Properties properties1 = new Properties();
            properties1.load(new FileInputStream("PropertiesXml.xml"));


            System.out.println("properties1:" + properties1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    * 使用Predicate的test()方法判断是否满足predicate指定的条件
    * */
    public static int countNub(List<String> list, Predicate p) {

        int total = 0;

        for(String str : list) {

            // 使用Predicate的test()方法判断是否满足predicate指定的条件
            if(p.test(str)) {

                total++;
            }
        }

        return total;
    };
}
