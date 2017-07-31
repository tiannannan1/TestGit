package per.tnn.test.user;

public class User extends People {

    private String sex;

    public User(String name, int age) {

        super(name, age);
    }

    public void test() {

        System.out.println("User重写的父类test方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
