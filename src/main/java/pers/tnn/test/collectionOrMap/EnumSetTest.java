package pers.tnn.test.collectionOrMap;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Description: EnumSet相关方法测试
 * User: Tian nan nan
 * Date: 2017/8/9
 */
public class EnumSetTest {

    public static void main(String[] args) {

        // 创建一个包括枚举类里所有枚举值的EnumSet
        EnumSet enumSet = EnumSet.allOf(EnumClass.class);
        System.out.println("包括枚举类里所有枚举值的EnumSet：" + enumSet);// 输出[Yesterday, Today, Tomorrow]

        EnumSet enumSet1 = EnumSet.noneOf(EnumClass.class);
        System.out.println("创建一个具有指定元素类型的空枚举EnumSet:" + enumSet1);// 输出[]

        enumSet1.add(EnumClass.Today);
        System.out.println("添加一个元素后的EnumSet：" + enumSet1);// 输出[Today]

        EnumSet enumSet2 = EnumSet.copyOf(enumSet1);
        System.out.println("通过copyOf创建的EnumSet：" + enumSet2);// 输出[Today]

        List<String> list = new LinkedList<>();
        list.add("A");

        //EnumSet enumSet3 = EnumSet.copyOf(list.getClass());
        //System.out.println(enumSet3);

        EnumSet enumSet4 = EnumSet.of(EnumClass.Today, EnumClass.Yesterday);
        System.out.println("创建包含一个或多个元素的EnumSet：" + enumSet4); // 输出[Yesterday, Today]

        EnumSet enumSet5 = EnumSet.range(EnumClass.Yesterday, EnumClass.Tomorrow);
        System.out.println("创建包含从from到to枚举值的EnumSe:" + enumSet5);// 输出[Yesterday, Today, Tomorrow]

        EnumSet enumSet6 = EnumSet.complementOf(enumSet1); // enumSet1里只有[Today]
        // enumSet6里的元素 + enumSet1里的元素 = EnumClass枚举类里面所有的枚举值[Yesterday, Today, Tomorrow]
        System.out.println("新的EnumSet和原来的EnumSet元素加起来包括枚举类里的所有枚举值:" +  enumSet6); // 输出[Yesterday, Tomorrow]

    }
}
