package pers.tnn.test.genericParadigm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Description: 泛型类型使用
 * User: Tian nan nan
 * Date: 2017/8/15
 */
public class Apple<T extends Collection> {

    public static void main(String[] args) {

        //  因为String不是Collection的子类，所以不支持
       /* Apple a = new Apple("苹果");
        Apple b = new Apple(1);
        System.out.println(a.getInfo());// 苹果
        System.out.println(b.getInfo());//  1
        */
       // List是Collection的子类，因此List可以
        List<Integer> list = new ArrayList();
        list.add(1);
        Apple apple = new Apple(list);

        System.out.println(apple.getInfo());
    }

    // cannot be referenced from a static context
   /* static {

        T t = a;
    }*/

    private T info;

    public Apple() {}

    public Apple(T info) {

        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
