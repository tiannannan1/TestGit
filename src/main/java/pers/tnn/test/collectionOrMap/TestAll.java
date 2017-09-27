package pers.tnn.test.collectionOrMap;

import java.util.*;

/**
 * Description: 测试集合所有相关的知识
 * User: Tian nan nan
 * Date: 2017/8/16
 */
public class TestAll {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.putIfAbsent("a","A");
        linkedHashMap.putIfAbsent("b","B");
        linkedHashMap.putIfAbsent("c","C");

        linkedHashMap.forEach((key,val) -> System.out.println("linkedHashMap遍历:" + key));

        Set set = new HashSet();
        set.add("a");
        set.add("A");

        set.forEach(s -> System.out.println("set遍历：" + s));

        System.out.println(set);

    }
}
