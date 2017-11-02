package pers.tnn.test;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/10/27
 */
public class AbstractClass {

    public static void main(String[] args) {

        String a = "a";
        String b = new String("a");

        System.out.println(a.equals(b));
        System.out.println(a == b);

        Integer c = 100;
        Integer d = 100;

        Integer cc = 1000;
        Integer dd = 1000;

        System.out.println(c == d);// true
        System.out.println(cc == dd);// false
        System.out.println(cc == dd);// false
        System.out.println(cc == dd);// false
        System.out.println(cc == dd);// false
    }
}
