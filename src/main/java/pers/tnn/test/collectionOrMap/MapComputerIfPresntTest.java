package pers.tnn.test.collectionOrMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/10
 */
public class MapComputerIfPresntTest {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", null );

        System.out.println("刚初始化的map" + map); // 输出结果为：{a=A, b=B, c=null}

        System.out.println(map.remove("b", "B")); // true
        System.out.println(map.remove("c", null)); // true
        System.out.println(map.remove("c", "")); // false
        System.out.println(map.remove("d", "")); // false

        System.out.println("remove处理后的Map：" + map); // 输出结果为：{a=A}

        map.replaceAll((k,v) -> (k.toString() + "-" +  v.toString()));

        System.out.println("replaceAll处理后的Map：" + map); // 输出结果为：{a=a-A, b=b-B, c=c-C}

        /*map.replace("b","B", "new value");
        map.replace("c",null, "new value");
        map.replace("d",null, "new value");*/

        System.out.println("value值存在：" + map.replace("b","B", "new value")); // true
        System.out.println("value值为null：" + map.replace("c",null, "new value")); // true
        System.out.println("value值不存在：" + map.replace("d",null, "new value")); // false

        System.out.println("replace处理后的Map：" + map); // 输出结果为：{a=A, b=new value, c=new value}

        map.replace("b","new value");
        map.replace("c","new value");
        map.replace("d","new value");

        System.out.println("replace处理后的Map：" + map);// 输出结果为：{a=A, b=new value, c=new value}

        map.putIfAbsent("a", "new value");
        map.putIfAbsent("c", "new value");
        map.putIfAbsent("d", "new value");

        System.out.println("putIfAbsent处理后的Map：" + map); // 输出结果为：{a=A, b=B, c=new value, d=new value}

        map.merge("b", "new value", (oldVal, paramVal) ->  oldVal.toString() + "-" +paramVal.toString());
        map.merge("c", "new value", (oldVal, paramVal) ->  oldVal.toString() + "-" +paramVal.toString());
        map.merge("d", "new value", (oldVal, paramVal) ->  oldVal.toString() + "-" +paramVal.toString());

        System.out.println("merge处理后的Map：" + map); // 输出结果为：{a=A, b=B-new value, c=new value, d=new value}

        System.out.println(map.getOrDefault("c", "defaultValue")); // 输出结果为：null
        System.out.println(map.getOrDefault("d", "defaultValue")); // 输出结果为：defaultValue

        map.forEach((k, v) ->{

            System.out.println("forEach遍历：key:" + k + ";value:" + v);

            // variable used in lambda expression should be final or effectively final
            /*if (v.equals("C")) {

                name = v;
            }*/

            // incompatible parameter types in Lambda expression wrong number of parameters:expected 1 but found 2
            /*if(v.equals("C")) {

                map.computeIfAbsent(k, (key1, val) -> val != null ? "CC" : "c");
            }*/

            /*
            // 如果迭代期间条目数发生改变，则报ConcurrentModificationException
            if(v.equals("C")) {

                map.remove(k);
            }*/
        });

        System.out.println("操作后的map：" + map);

        /*map.computeIfPresent("a", (k,v) -> v == null ? "" : null);// 计算结果为null

        map.computeIfPresent("b", (k,v) -> v == null ? null : "BB"); // 计算结果不为null

        System.out.println("computeIfPresent方法操作后的map：" + map); // 输出结果为：{b=BB, c=C}*/
    }
}
