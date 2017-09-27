package pers.tnn.test.collectionOrMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Description: Map接口及其子接口和实现类的相关测试
 * User: Tian nan nan
 * Date: 2017/8/10
 */
public class MapTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("A",null);
        map.put("B","b");
        map.put("C","c");
        map.put("D","y");

        // 有返回true，否则返回false。
        System.out.println("map是否包含指定键的映射：" + map.containsKey("A"));

        // 有则返回true，否则返回false
        System.out.println("如果此映射将一个或多个键映射到指定值：" + map.containsValue("c"));

        System.out.println("返回指定键的所映射的值:" + map.get("A")); // a

        System.out.println("返回该映射的hashCode值：" + map.hashCode());

        // 无返回true，有返回false
        System.out.println("映射是否包含键值映射关系：" + map.isEmpty());

        System.out.println("map toSting方法：" + map.toString()); // 输出{A=a, B=b, C=c, D=y}

        Map map1 =  new HashMap();
        map1.put("AA","a");
        map1.put("BB","b");
        map1.put("CC","c");
        map1.put("D","d");

        // 从指定映射中将所有的映射关系复制到本映射中，如果可key相同，取指定Map中的值
        map.putAll(map1);
        System.out.println("执行putAll后的Map：" + map);

        System.out.println("返回此映射中包含的值的 Collection 视图:" + map.values());

        Set set = map.entrySet();
        System.out.println("此映射中包含的映射关系的 set 视图:" + set); // 输出[A=a, B=b, C=c, D=c]
        System.out.println("set试图的remove A：" + set.remove("A"));
        //java.lang.UnsupportedOperationException是指请求的方法不被支持的异常
        //System.out.println("set试图的add：" + set.add("AA"));

        HashMap hashMap  = new HashMap();
        hashMap.put("A","a");
        hashMap.put("B","b");
        hashMap.put("C","c");
        map.put("D","c");

        System.out.println("map的equals比较方法：" + map.equals(hashMap));

        Set set1 = new HashSet();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        System.out.println("自定义的Set：" + set1);

        // 返回一个由Map所有key组成的Set集合
        System.out.println("Map key 组成的Set集合：" + map.keySet());

        //map.clear();
        //System.out.println("map" + map);

        /*
        * java8新增方法
        * */
        map.compute("A", (k, v) -> v == null ? "": v);
        System.out.println(map);
        System.out.println( map.compute("A", (k, v) -> v == null ? "null": "new value"));
        System.out.println(map);
        System.out.println(map.get("A"));
    }
}
