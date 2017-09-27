package pers.tnn.test.annotation;

import com.sun.istack.internal.NotNull;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/23
 */
@TypeAnnotation
public class TypeAnnotationTest implements @TypeAnnotation TestInterface {

    public static void main(String[] args) throws @TypeAnnotation Exception {

        // new 关键字创建对象
        TypeAnnotationTest typeAnnotationTest = new @TypeAnnotation TypeAnnotationTest();
        // 类型转换
        Object o = "test";
        String str = (@TypeAnnotation String)  o;

        @NotNull
        String string = null;

    }
}
