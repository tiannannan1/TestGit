package pers.tnn.test.collectionOrMap.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Description: List(接口)集合相关方法测试
 * User: Tian nan nan
 * Date: 2017/8/14
 */
public class ListTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        /*
        * ListIterator在Iterator基础上增加的方法：
        * add(),
        * hasPrevious()： 返回迭代器的集合是否还有上一个元素
        * previous(): 返回迭代器的上一个元素
        * */
        ListIterator listIterator = list.listIterator();

        while(listIterator.hasNext()) {

            System.out.println("hasNext()遍历：" + listIterator.next());
            // 在指定位置插入元素
            listIterator.add("add new");
        }

        while(listIterator.hasPrevious()) {

            System.out.println("hasPrevious()遍历：" + listIterator.previous());
        }


/*

        System.out.println("原List：" + list); // [a, b, c, d]

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("A");

        // 将一个集合所有的插入到List的指定位置处，如果插入的位置在原list中不存在，则报IndexOutOfBoundsException
        //list.addAll(4,list1);
        System.out.println(list.addAll(4,list1));// true

        //System.out.println("返回迭代器关联的集合是否还有上一个元素：" + list.listIterator().hasPrevious());//  false
        //System.out.println("返回迭代器的上一个元素：" + list.listIterator().previous());//  false


        System.out.println("经过addAll()方法处理的List:" + list); // [a, b, c, d, A, B, C, D，A]

        System.out.println("返回指定元素在集合中第一次出现的位置：" + list.indexOf("A")); // 4

        System.out.println("返回指定元素在集合中最后一次出现的位置：" + list.lastIndexOf("A"));// 8

        //System.out.println("将指定位置的元素替换成新的元素，返回旧的元素：" + list.set(0, "A")); // a

        */
/*
        * java8 为List新增的两个默认方法：
        * *//*

        // void sort(Comparator comparator)：根据comparator对List集合元素排序
        //list.sort((s1, s2) -> ((String)s1).hashCode() > ((String)s2).hashCode() ? 1 : 0);
        List list2 = new ArrayList();
        list2.add("今天天气阴，好像有雨");
        list2.add("昨天天气好");
        list2.add("明天天气待定");
        //  输出的结果：[今天天气阴，好像有雨, 昨天天气好, 明天天气待定]
        System.out.println("未处理的list：" + list2);
        //
        list2.sort((s1, s2) -> ((String)s1).length() - ((String)s2).length());
        //输出的结果：[昨天天气好, 明天天气待定, 今天天气阴，好像有雨]
        System.out.println("sort()方法处理后的List:" + list2);

        // void replaceAll(); 根据重新指定的规则，重新设置List中所有的元素
        // List中的元素排序：[a, b, c, d, A, B, C, D, A]
        list.replaceAll(s -> s.equals("A") ? "test" : "t");

        // 处理后输出的结果：[test, t, t, t, test, t, t, t, test]
        System.out.println("replaceAll()方法处理后的List:" + list);
*/
    }
}
