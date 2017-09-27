package pers.tnn.test.interface8;

public interface TestInterfa {

    default int methodA() {

        int num = 1;

        return num;
    }

    default void methodB() {

        System.out.println("无返回值测试");
    }

    // extension method should have a body
    //default void methodC();
}
