/**
 * Created by khcm on 2017/7/25.
 */
public class TestGitController {

    public static void main(String [] args) {

        /*
        * == 和equals的比较
        * */
        String a = "a";
        String d = "a";
        String b= new String("a");
        String c = new String("a");

        System.out.println(a == d); // true
        System.out.println(a.equals(d)); // true
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
        System.out.println(b == c); // false
        System.out.println(b.equals(c)); // true
    }
}
