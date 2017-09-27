package pers.tnn.test.collectionOrMap;

import java.util.TreeSet;

/**
 * Description: TreeSet相关方法测试
 * User: Tian nan nan
 * Date: 2017/8/8
 */
public class TreeSetTest {

    //private static UserTestComparator imm

    public static void main(String[] args) {

        // 无参构造函数式根据元素的自然排序进行排序的：此时TreeSet调用的是加入元素的compareTo()方法
        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("B");
        treeSet.add("F");
        treeSet.add("A");
        treeSet.add("1");
        treeSet.add("ABF");
        treeSet.add("2");
        treeSet.add("1");
        treeSet.addAll(treeSet);
        // System.out.println("clear前：" + treeSet);
        // treeSet.clear(); 清除此set中的所有元素
        // System.out.println("clear后：" + treeSet);
        System.out.println(treeSet);
        System.out.println("返回大于等于指定元素的子集：" + treeSet.tailSet("A"));
        System.out.println("返回小于指定元素的子集：" + treeSet.headSet("A"));
        System.out.println("返回指定区间内的子集：" + treeSet.subSet("A", "B"));
        System.out.println("返回当前集合的一个元素：" + treeSet.first()); // A
        System.out.println("返回当前集合的最后一个元素：" + treeSet.last()); // F
        System.out.println("返回指定元素之前的一个元素：" + treeSet.lower("A"));
        System.out.println("返回指定元素之后的一个元素：" + treeSet.higher("ABF"));
        System.out.println("返回set中大于等于给定元素的最小元素：" + treeSet.ceiling("AB"));
        System.out.println("返回此set所用的比较器，如果是使用的元素的自然排序则返回null：" + treeSet.comparator());


        System.out.println( treeSet.comparator()); // null

        TreeSet ts = new TreeSet();
        /*ts.add(new UserTest(0));
        ts.add(new UserTest(0));
        System.out.println("添加未实现Comparable的User的TreeSet:" + ts);*/

        UserTest user1 = new UserTest(10);
        UserTest user2 = new UserTest(10);

        ts.add(user1);
        ts.add(user2);

        ((UserTest)ts.first()).setAge(11);

        System.out.println("equals比较方法：" + user1.equals(user1));
        System.out.println("compareTo比较方法：" + user1.compareTo(user1));
        System.out.println("ts：" + ts);



        /*
        * 定制排序：Comparator
        * */
        TreeSet<UserTest> tests = new TreeSet<UserTest>((o1, o2) -> {

            UserTest u1 = (UserTest) o1;
            UserTest u2 = (UserTest) o2;

            //System.out.println("u1""");
            System.out.println("定制排序：" + (u1.getAge() > u2.getAge()? 1:u1.getAge() < u2.getAge() ? -1:0));

            return u1.getAge() > u2.getAge()? 1:u1.getAge() < u2.getAge() ? -1:0;
        });

        tests.add(new UserTest(5));
        tests.add(new UserTest(7));

       System.out.println(tests);
       System.out.println("" + tests.comparator());

       // TreeSet<UserTest> tests1 = new TreeSet<UserTest>(UserTestComparator u);


    }
}
