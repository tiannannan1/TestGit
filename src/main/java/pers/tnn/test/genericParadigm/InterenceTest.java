package pers.tnn.test.genericParadigm;

/**
 * Description: java8改进的类型推断
 * User: Tian nan nan
 * Date: 2017/8/17
 */
public class InterenceTest<E> {

    public static <Z> InterenceTest<Z> ini(){
        return null;
    }

    public static <Z> InterenceTest<Z> cons(Z head, InterenceTest<Z> tail) {
        return null;
    }

    E head() {
        return null;
    }

    public static void main(String[] args) {

        // 通过方法赋值的目标参数来推断类型参数为String
        InterenceTest<String> it = ini();

        // 通过调用的方法所需的参数类型推断类型参数为Integer
        InterenceTest it1 = cons(1, ini());

        // 直接在调用方法时指明类型参数的类型
        InterenceTest it2 = InterenceTest.<String>ini();
    }
}
