package pers.tnn.test.collectionOrMap;

import java.util.IdentityHashMap;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/12
 */
public class IdentityHashMapTest {

    public static void main(String[] args) {

        IdentityHashMap ihm = new IdentityHashMap();
        // new String("语文")创建的key通过 == 比较不相等，所以下面会往IdentityHashMap中添加两个key-value对
        ihm.put(new String("语文"), 89);
        ihm.put(new String("语文"), 90);

        // 字符串直接常量，java使用字符串常量池管理字符串直接常量，它们通过==比较返回true，所以下面为添加一个key-value对
        ihm.put("数学", 100);
        ihm.put("数学", 99);

        // 不保证key-value对的顺序
        System.out.println("IdentityHashMap初始：" + ihm);// {数学=99, 语文=90, 语文=89}
    }
}
