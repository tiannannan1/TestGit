import per.tnn.test.user.People;

public class FinalTest {

    final int a = 0;
    final People people = new People("final", 1);

    public static void main(String [] args) {

        FinalTest finalTest = new FinalTest();

        // 因为final修饰的基本类型不可重复赋值。
        //finalTest.a = 3; 执行错误（cannot assign a value to final variable ‘a’）
        System.out.println(finalTest.a);

        // final修饰的引用类型，引用对象不可变，但这个对象可以变
        //finalTest.people = new People("final test", 1); 执行错误
        finalTest.people.setName("final test");
        System.out.println(finalTest.people.toString());

        final String str = "test";
        final String str2 = "final";

        final String str3 = str + str2;

        // final变量被附的表达式只是基本的运算表达式或者字符串连接，没有访问变量，调用方法，java编译器也会将这种final常量当成‘宏变量’处理。
        final String str4 = "test" + "final";
        //  str3 = "str";

        final String str5 = "testfinal";

        String s1 = "test";
        String s2 = "final";
        String s = s1 + s2;

        /*
        *  str3 == str5 和 str3 == str5是因为执行了宏替换的结果
        * */
        System.out.println(str3 == str4); // true
        System.out.println(str3.equals(str4)); // true
        System.out.println(str3 == str5); // true
        System.out.println(str3.equals(str5)); // true
        System.out.println(str4 == str5); // true
        System.out.println(str4.equals(str5)); // true
        /*
        * str3 == s 为false的原因是s1和s2为普通变量，在编译的时候无法执行宏替换，s值无法指向缓冲池的“testfinal”,所以str3 == s 为false。
        * */
        System.out.println(str3 == s); // false
        System.out.println(str3.equals(s)); // true

        Double d = new Double(4.5);
        Double d1 = new Double(4.5);
        System.out.println(d.hashCode() == d1.hashCode());

        String str1 = new String("Test");

    }
}
