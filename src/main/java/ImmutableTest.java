import pers.tnn.test.user.ImmutableClass;

public class ImmutableTest {

    public static void main(String [] args) {

        ImmutableClass immutableClass = new ImmutableClass("immutable", "157");
        ImmutableClass immutableClassOne = new ImmutableClass("immutable", "157");

        System.out.println(immutableClass);

        String str1 = new String ("immutable");
        System.out.println(str1.hashCode());
        str1 = "immutable test";
        System.out.println(str1.hashCode());



    }
}
