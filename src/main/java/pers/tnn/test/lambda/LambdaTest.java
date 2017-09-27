package pers.tnn.test.lambda;

import javax.swing.*;

public class LambdaTest {

    public void eat(Eatable e) {

        /*
        * 之前做法：
        * 1.首先将接口实现EatableImp
        * 2.通过实现类实现方法taste()
        * 3.在此实例话EatableImp调用其taste方法
        * */
        System.out.println(e);
        e.taste();
    }

    public void drive(Flyable f) {

        System.out.println(f);
        f.fly("飞翔");
    }

    public void test(Addable add) {

        System.out.println("5+3的和：" + add.add(5,3));
    }

    public static void main(String[] args) {

        LambdaTest lambdaTest = new LambdaTest();

        lambdaTest.eat(new Eatable() {

            public void taste() {

                System.out.println("good taste");
            }
        });

        // 只有一条语句省略{}的情况
        lambdaTest.eat(()->System.out.println("lambda test"));

        // 参数列表只有一个参数省略()的情况
        lambdaTest.drive(str ->System.out.println("在蓝天下" + str));

        // 省略return的情况
        lambdaTest.test((a,b) -> a+b);

        // 未省略return关键字的情况
        lambdaTest.test((a, b)-> {

            System.out.println("a:" + a);
            System.out.println("b:" + b);

            return a + b;
        });

        Runnable r = () -> {

            System.out.println("Runnable是只包含一个抽象方法，是函数式接口");
        };

        /*
        * Lambda表达式的几种引用方式
        * */

        /*
        * 1.引用类方法
        * */
        // Lambda表达式
        //Convert convert = (str) -> Integer.valueOf(str);
        // 引用类方法
        Convert convert1 = Integer::valueOf;

        Integer i = convert1.convert("12");

        System.out.println("引用类方法:" + convert1.convert("123"));

        /*
        * 2.引用特定对象的实例方法
        * */

        // Lambda表达式
       // Convert convert2 = str -> "siludoft.com".indexOf(str);
       Convert convert2 =  "siludoft.com"::indexOf;

        System.out.println("引用特定对象的实例方法:" + convert2.convert("silu"));

        /*
        * 3.引用某对象的实例方法
        * */
        //LambdaThree lambdaThree = (a, b, c) -> a.substring(b, c);
        LambdaThree lambdaThree = String :: substring;
        System.out.println("引用某类对象实例方法：" + lambdaThree.test("Java Lambda test", 5,11));

        /*
        * 4.引用构造器
        * */
        //LambdaConstructor lc = (str) -> new JFrame(str);
        LambdaConstructor lc = JFrame::new;
        System.out.println("引用构造器：" + lc.win("test 窗口").getTitle());
    }
}
