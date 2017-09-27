package pers.tnn.test.inoroutputsream;

import java.io.Serializable;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/29
 */
public class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {
        System.out.println("Person类的有参构造方法");

        this.age = age;
        this.name = name;
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
}
