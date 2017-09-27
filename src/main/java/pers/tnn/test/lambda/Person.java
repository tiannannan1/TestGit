package pers.tnn.test.lambda;

public class Person implements Animal{

    public void eat() {


    }

    public static void main(String[] args) {

        Animal animal = () -> System.out.println("动物通过吃来获取能量");

        animal.run();
        animal.eat();
    }
}
