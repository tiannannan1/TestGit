package pers.tnn.test.user;

public class People {

    private  String name;
    private  int age;

    // 初始化块测试
    /*{
        name = "初始化块";
        age = 1;
        System.out .println("初始化块测试");
    }*/
    public  People(String name, int age) {

        this.age = age;
        this.name = name;

        //System.out.println("peopleInfo:" + name);
        //test();
    }

    public void test() {

        System.out.println("将被子类重写的类");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
