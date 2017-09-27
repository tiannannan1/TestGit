package pers.tnn.test.lambda;

public interface Animal {

    default void run() {

        System.out.println("default method run");
    }

    void eat();
}
