package pers.tnn.test.genericParadigm;

import java.util.*;

/**
 * Description: java泛型测试
 * User: Tian nan nan
 * Date: 2017/8/15
 */
public class GenericParadigmTest {

    /*
    * 使用类型通配符
    * */
    public static void test(List<? extends Integer> c) {

        for (int i = 0; i < c.size() ; i++) {

            System.out.println("通配符：" + c.get(i));
        }
    }

    /*
    * 泛型方法的使用
    * 泛型方法的使用
    * */
    public static <T> void testGeneracMethod(T[] a, Collection<T> c) {

        for(T t: a) {

            c.add(t);
        }

        c.forEach(s -> System.out.println("泛型方法：" +  s));
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        Collection collection = new ArrayList();

        testGeneracMethod(list.toArray(), collection);

        // 因为通配类型符的上限是 ? extends Interger,而传入的List是String类型，所以此处不支持
        //test(list);

        list.forEach(str -> System.out.println(str));

        // 因为List的默认类型是Object的，所以此时可以加入Integer类型
        //list.add(100);

        // 使用泛型的原因：当把元素是放入集合后，集合会忘记元素的数据类型，编译类型改变，运行时类型未改变
        for(Object str : list ) {

            // 当循环遍历的时候容易出现：ClassCastException
            String string  = (String)str;

            //System.out.println(string);
        }

        Map<String,Object> map = new HashMap<>();

        // 分别创建List<String>对象和List<Double>对象
        List<String> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        // 通过getCLass比较两个对象是否相等
        System.out.println(list1.getClass() == list2.getClass());// true

        /*
        *Integer[]数组可以直接给Number[]变量赋值
        * */
        Integer[] integers = new Integer[]{1,2,3};
        Number [] numbers  = new Number[]{2.3};

        // 不相容的类型：incompatible types
        //integers = numbers;

        numbers = integers;

        System.out.println("Number数组：" + integers);

        for(int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
    }
}
