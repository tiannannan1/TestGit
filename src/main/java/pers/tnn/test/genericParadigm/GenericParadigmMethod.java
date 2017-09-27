package pers.tnn.test.genericParadigm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Description: 泛型方法的使用
 * User: Tian nan nan
 * Date: 2017/8/17
 */
public class GenericParadigmMethod<E> {

    /*
    * 通配符下限
    * */
    public static <T> T copy1(Collection<? super T> dest, Collection<T> src) {

        T last = null;

        for(T t : src) {

            dest.add(t);
            last = t;
        }

        return last;
    }

    public static <T> T copy(Collection<T> dest, Collection<? extends T> src) {

        T last = null;

        for(T t : src) {

            dest.add(t);
            last = t;
        }

        return last;
    }



    public <T> GenericParadigmMethod(T t) {

        System.out.println(t);
    }

    public <T> void t(List<? extends T> list) { }

    /*
    * 将一个集合中的元素添加到另一个集合
    * */
    public static void testMethod(List<Object> o, List<Object> c) {

        for (Object ob : o) {

            c.add(ob);
        }
    }

    public static void testMethod1(List<String> o, List<String> c) {

        for (String ob : o) {

            c.add(ob);
        }
    }

    // 将以上方法修改为泛型方法
    public static <T> void testMethod2(List<T> o, List<T> c) {

        for (T ob : o) {

            c.add(ob);
        }
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        List<String>  list1 = new ArrayList();

        // 提示在（Object，Object）的方法中不能使用（String，String）
        // 验证：List<String> 不是 List<Object>的子类
        //testMethod(list, list1);

        testMethod1(list, list1);

        // 使用泛型方法
        testMethod2(list, list1);

        // 根据数据类型推断类型形参的类型
        /*new GenericParadigmMethod(1);
        new GenericParadigmMethod("test");

        // 显示指定类型形参的实际类型
        new <String> GenericParadigmMethod("1");*/

        GenericParadigmMethod gpm = new <Integer> GenericParadigmMethod<String>(1);
        GenericParadigmMethod<String> gpm1 = new GenericParadigmMethod("前");
        GenericParadigmMethod<String> gpm2 = new GenericParadigmMethod<String>("前后");
        GenericParadigmMethod<String> gpm3 = new <String> GenericParadigmMethod<String>("前中后");
        GenericParadigmMethod gpm4 = new <String> GenericParadigmMethod<Integer>("");
        // 如果显示指定类型形参就不能再使用“菱形语法”
        //GenericParadigmMethod gpm5 = new <String> GenericParadigmMethod<>("");
        GenericParadigmMethod gpm5 = new GenericParadigmMethod<>("");

        List<Number> ln = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(2);

        //
        Integer i = copy1(ln, li);

        System.out.println(copy(ln, li));
    }
}
