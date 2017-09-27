package pers.tnn.test.collectionOrMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/10
 */
public class MapComputerIfAbsentTest {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("a", null);
        map.put("b", "B");
        map.put("c", "C");

        map.computeIfAbsent("a", k -> ((String)k).length());

        map.computeIfAbsent("b", k -> ((String)k).length());

        map.computeIfAbsent("d", k -> k.hashCode()); // d的Unicode编码为100

        System.out.println(map);// 输出结果{a=1, b=B, c=C, d=100}
    }
}
