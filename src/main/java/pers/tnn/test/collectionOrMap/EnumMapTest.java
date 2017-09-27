package pers.tnn.test.collectionOrMap;

import java.util.EnumMap;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/12
 */
public class EnumMapTest {

    public static void main(String[] args) {

        EnumMap em = new EnumMap(Color.class);
        em.put(Color.Black, "黑色");
        em.put(Color.Violet, "紫色");
        em.put(Color.Pink, "粉色");

        System.out.println(em); // {Black=黑色, Pink=粉色, Violet=紫色}s输出顺序与枚举类中定义的顺序一致
    }
}
