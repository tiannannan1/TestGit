import pers.tnn.test.user.SingletonClass;

public class SingletonTest {

    public static void main(String [] args) {

        // 'SingletonClass()' has private access in 'SingletonClass'
        //SingletonClass singletonClass = new SingletonClass();

        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        singletonClass.setName("singleton");
        singletonClass.setTelNum("12345");

        System.out.println(singletonClass.toString());

        singletonClass.setName("singleton test");
        singletonClass.setTelNum("12345");

        System.out.println(singletonClass.toString());
    }
}
