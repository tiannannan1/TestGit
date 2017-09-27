package pers.tnn.test.anonymousClass;

public class Test {

    public static void main(String[] args) {

        // 匿名内部类实现接口
        Person person = new Person() {

            public void eat() {

                System.out.println("人每天需要吃饭！");
            }

            public void play() {

                System.out.println("人需要适量的运动");
            }

            public void motion() {

                System.out.println("需要适量的运动");
            }
        };

        person.eat();
        person.motion();
       //  person.play(); cannot resolve method

        // 多次实现
        Person per = new Person() {
            @Override
            public void eat() {

                System.out.println("测试多继承");
            }

            @Override
            public void motion() {

                System.out.println("test");
            }
        };

        per.motion();
        per.eat();
    }
}