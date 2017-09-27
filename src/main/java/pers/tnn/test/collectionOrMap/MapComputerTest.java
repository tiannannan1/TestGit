package pers.tnn.test.collectionOrMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/10
 */
public class MapComputerTest {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("A","a");
        map.put("B","b");
        map.put("C",null);
        map.put("D",null);

        System.out.println("原map：" + map); // 输出结果：{A=a, B=b, C=null, D=null}

        // key存在
        System.out.println("value不为null，new value不为null返回值:" +  map.compute("A", (k, v) -> v == null ? null : "new value")); // new value
        System.out.println("value不为null，new value为null返回值:" +  map.compute("B", (k, v) -> v == null ? null : null)); // 删除原key-value对，返回 null
        System.out.println("value为null，new value不为null返回值:" +  map.compute("C", (k, v) -> v == null ? "new value" : null)); // new value
        System.out.println("value为null，new value为null返回值:" +  map.compute("D", (k, v) -> v == null ? null : null)); // 删除原key-value对，返回null
        // key 不存在
        System.out.println("value为null，new value不为null返回值:" +  map.compute("E", (k, v) -> v == null ? "new value" : null)); // 新增一组key-value对，返回new value
        System.out.println("value为null，new value为null返回值:" +  map.compute("F", (k, v) -> v == null ? null : null)); // 直接返回null

        System.out.println("操作后的map：" + map);// 输出结果：{A=new value, C=new value, E=new value}


        /*map.compute("E", (k,v) -> v == null ? null : null);

        System.out.println("value不为null，compute返回值:" +  map.compute("A", (k, v) -> v == null ? null : "new value")); //
        System.out.println("compute返回值:" +  map.compute("C", (k,v) -> v == null ? null : null));*/

        //System.out.println(map);


        /*map.compute("A", (k, v) -> v == null ? "a" : "aa");// 新value不为null，新value覆盖原value。
        map.compute("B", (k, v) -> v == null ? "" : null); // 原value为不null，新value为null，删除key-value对。
        map.compute("C", (k, v) -> v == null ? null : v); // 原/新value均为null，删除key-value对。
        map.compute("E", (k, v) -> v == null ? "e" : v); // key不存在：新value不为null，新增一组key-value对。
        map.compute("F", (k, v) -> v == null ? null  : v); // key不存在：新value为null，不新增key-value对。*/

        //System.out.println(map);// 输出结果：{A=a, D=d, E=e}
    }
}
