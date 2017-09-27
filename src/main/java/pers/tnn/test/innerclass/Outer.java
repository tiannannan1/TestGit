package pers.tnn.test.innerclass;
/*
* 内部类测试
* */
public class Outer {

    private int num = 1;
    private static String strOuter = "外部类静态变量";

    // 非静态内部类：Inner
    class Inner extends InertClassTest {

        private int num = 2;
        private String  innVara = "内部类变量";

        // static String str = ""; 非静态内部类不能有静态变量

        public Inner() {

            System.out.println("内部类的num:" + this.num);
            System.out.println("外部类的num:" + Outer.this.num);
            System.out.println("外部类静态变量:" + strOuter);
        }
    }

    // 在外部类方法中返回内部类
    public Inner getInner() {

        // cannot resove symbol "innvara"
       // System.out.println("直接引用内部类私有变量：" + innVara);

        Inner inner = new Inner();

        return inner;
    }

    // 静态内部类：StaticInner
    public static class StaticInner extends InertClassTest {

        static String str;
        private int i = 1;

        StaticInner(String test) {

            this.str = test;
        }

        public void test() {

            //System.out.println("外部类的num:" + Outer.num);
            System.out.println("外部类静态变量:" + strOuter);
        }

    }

    public static void main(String [] args) {

        Outer outer = new Outer();

        // 非静态内部类的操作
        Inner inner = outer.getInner();

        System.out.println(inner.num);
        System.out.println(outer.num);

        // 静态内部类的操作
        StaticInner staticInner = new StaticInner("静态内部类");

        System.out.println(staticInner.i);
        System.out.println(StaticInner.str);

    }
}
