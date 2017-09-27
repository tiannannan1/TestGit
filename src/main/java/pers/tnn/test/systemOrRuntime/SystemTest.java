package pers.tnn.test.systemOrRuntime;

public class SystemTest {

    public static void main(String[] args) {

        // 输出系统变量
        System.out.println("Java_home:" + System.getenv("JAVA_HOME"));

        // 测试 identityHashCode(Object x)返回对象的hashCode值，判断是否为同一个对象
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1:" + System.identityHashCode(str1));
        System.out.println("str1的hashCode:" + str1.hashCode());
        System.out.println("str2:" + System.identityHashCode(str2));
        System.out.println("str2的hashCode:" + str2.hashCode());

        String str3 = "Hello";
        String str4 = "Hello";

        System.out.println("str3:" + System.identityHashCode(str1));
        System.out.println("str3的hashCode:" + str1.hashCode());
        System.out.println("str4:" + System.identityHashCode(str2));
        System.out.println("str4的hashCode:" + str2.hashCode());

        /*
        * 通过java运行环境信息
        * */
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Jvm内存剩余量：" + runtime.freeMemory());
    }
}
