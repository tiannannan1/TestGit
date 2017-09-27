package pers.tnn.test.innerclass;

public class Test {

    public static void main(String[] args) {

        //在外部类外使用非静态内部类内部类
        Outer.Inner inner = new Outer().new Inner();

        System.out.println("=============================");

        // 在外部类外使用静态内部类
        Outer.StaticInner staticInner = new Outer.StaticInner("静态内部类测试");
        staticInner.test();
        System.out.println(Outer.StaticInner.str);
    }
}
