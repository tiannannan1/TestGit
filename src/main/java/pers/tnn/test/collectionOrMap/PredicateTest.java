package pers.tnn.test.collectionOrMap;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Description: Predicate test
 * User: Tian nan nan
 * Date: 2017/8/7
 */
public class PredicateTest {

    public static void main(String[] args) {

        List<String> strings = new LinkedList<>();
        strings.add("abcdefg");
        strings.add("abcdef");
        strings.add("abcde");
        strings.add("abcd");
        strings.add("abc");

        System.out.println(countNub(strings, str -> ((String)str).contains("cd"))); // 统计字符串中含有“cd”子串的字符串个数
        System.out.println(strings.stream().filter(str -> ((String)str).contains("cd")).count());
        //System.out.println(strings.stream().filter());
        System.out.println(countNub(strings, str -> ((String)str).length() > 4));  // 统计字符串长度超过4的字符串个数
    }

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
