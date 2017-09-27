package pers.tnn.test.enumClass;

public class EnumTest {

    public static void main(String[] args) {

        //EnumClass enumClass = Enum.valueOf(EnumClass.class,"MALE");

        //enumClass.name = "Enum类";
        //System.out.println(enumClass.toString() + "。name值：" + enumClass.name);
        //System.out.println(EnumClass.valueOf("VIDEO"));

       /* System.out.println(EnumClassFirst.AUDIO.getValue());
        System.out.println(EnumClassFirst.AUDIO.getName());

        EnumClassFirst.AUDIO.setName("音频测试");
        System.out.println(EnumClassFirst.AUDIO.getName());*/

       System.out.println(EnumClassFirst.VIDEO.name); // 视频
       System.out.println(EnumClassFirst.VIDEO.value); // 1

        EnumClass ec = Enum.valueOf(EnumClass.class,"VIDEO");
        //System.out.println(ec.run());
        ec.run();

        //Runtime.getRuntime().g

        // 局部变量不能使用public修饰
        // public String str = "q";

       // Transient String  = "a";
    }
}
