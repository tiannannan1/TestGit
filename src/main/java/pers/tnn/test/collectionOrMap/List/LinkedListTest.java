package pers.tnn.test.collectionOrMap.List;

import java.util.LinkedList;

/**
 * Description: LinkedList相关测试
 * User: Tian nan nan
 * Date: 2017/8/14
 */
public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList ldl = new LinkedList();
        ldl.add("A");
        ldl.add("B");
        ldl.add("C");

        ldl.add(1,"b");
        ldl.addFirst("a");

        System.out.println(ldl);

        // 以List形式按索引遍历list
        for(int i = 0; i < ldl.size(); i++) {

            System.out.println("LinkedList第" + i +"个元素为：" + ldl.get(i));
        }

        System.out.println("返回此列表的第一个元素：" + ldl.getFirst());
        // 将指定元素添加到此列表的末尾
        ldl.offer("tail");
        System.out.println("offer操作后的LinkedList：" + ldl);
        // 在此列表的开头插入指定元素
        System.out.println("" + ldl.offerFirst("head"));

        System.out.println("获取但不移除此列表的头(第一个元素：)" + ldl.peek());
        System.out.println("获取但不移除此列表的头(第一个元素：)，如果此列表为空，则返回null：" + ldl.peekFirst());
    }
}
