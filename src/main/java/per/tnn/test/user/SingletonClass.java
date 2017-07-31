package per.tnn.test.user;

public class SingletonClass {

    // 构造方法私有化防止随意实例化
    private SingletonClass() {};
    // 使用static修饰是让伴随类的创建便提供初始化
    private static SingletonClass singletonClass = new SingletonClass();
    private String name;
    private String telNum;

    public static SingletonClass getSingletonClass() {

        return singletonClass;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SingletonClass{" +
                "name='" + name + '\'' +
                ", telNum='" + telNum + '\'' +
                '}';
    }
}
