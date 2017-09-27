package pers.tnn.test.enumClass;

public enum EnumClass implements EnumInterface {

    // 在一行列出所有实例，默认使用 public static final修饰
    VIDEO(1) /*{
        @Override
        public void run() {
            System.out.println("视频资料有动态效果");
        }

    }*/,AUDIO(2) {
        @Override
        public void run() {
            System.out.println("音频资料没有动态效果");
        }
    },TEST(3);


    int value;

    public int getValue() {
        return value;
    }

    EnumClass(int value) {
        this.value = value;
    }

    @Override
    public void run() {

        System.out.println("Enum类实现的接口");
    }

    // public 修饰的便量
   // private final String name = "枚举类实现类";

}
