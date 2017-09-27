package pers.tnn.test.collectionOrMap;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/12
 */
public class WeakHashMapTest {

    public static void main(String[] args) {

        String c = new String("c");

        WeakHashMap whm = new WeakHashMap();
        whm.put(new String("a"),"A"); // ①
        whm.put(new String("b"),"B");// ②
        whm.put(c,"C");// ③
        //whm.put(new String("c"),"C");// ③
        whm.put("d", "D"); // ④

        System.out.println("系统未进行垃圾回收前的WeekHashMap：" + whm);// {a=A, c=C, b=B, d=D}
        // 通知系统进行垃圾回收
        System.gc();
        System.out.println("系统进行垃圾回收后的WeekHashMap：" + whm); // {c=C, d=D}

        HashMap hashMap = new HashMap();
        hashMap.put(new String("a"), "A");
        hashMap.put(new String("b"), "B");
        hashMap.put(new String("c"), "C");
        hashMap.put(new String("d"), "D");

        System.out.println("回收前的hashMap:" + hashMap); // {a=A, b=B, c=C, d=D}

        System.gc();

        System.out.println("回收后的hashMap:" + hashMap); // {a=A, b=B, c=C, d=D}
    }
}
