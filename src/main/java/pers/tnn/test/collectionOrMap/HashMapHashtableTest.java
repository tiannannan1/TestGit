package pers.tnn.test.collectionOrMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/11
 */
public class HashMapHashtableTest {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("a", "A" );
        hashMap.put("b", "B" );
        hashMap.put("e", "E" );
        hashMap.put("c", "C" );

        System.out.println("HashMap:" + hashMap);// 输出结果为：{a=A, b=B, c=C, e=E}
        System.out.println("forEacha输出HashMap：");
        hashMap.forEach((k,v) -> System.out.println("key:" + k + "; value:" + v));

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aa", "AA");
        linkedHashMap.put("ee", "EE");
        linkedHashMap.put("bb", "BB");
        linkedHashMap.put("cc", "CC");

        System.out.println("LinkedHashMap:" + linkedHashMap); // {aa=AA, ee=EE, bb=BB, cc=CC}
        System.out.println("forEacha输出LinkedHashMap：");
        linkedHashMap.forEach((k,v) -> System.out.println("key:" + k + "; value:" + v));
    }
}
