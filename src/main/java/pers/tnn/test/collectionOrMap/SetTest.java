package pers.tnn.test.collectionOrMap;

import java.util.HashSet;
import java.util.Set;

/**
 * Description: Set集合相关
 * User: Tian nan nan
 * Date: 2017/8/8
 */
public class SetTest {

    public static void main(String[] args) {

        Set<String> srtSet = new HashSet<>();
        srtSet.add("A");
        /*srtSet.add("B");
        srtSet.add(null);
        srtSet.add("A");*/

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");

        System.out.println(srtSet.equals(hashSet));

        String str1 = "A";
        String str2 = "A";

        str1.equals(str2);
        str1.compareTo(str2);
    }
}
