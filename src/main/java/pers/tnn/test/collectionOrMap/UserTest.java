package pers.tnn.test.collectionOrMap;

/**
 * Description: 测试自然排序
 * User: Tian nan nan
 * Date: 2017/8/8
 */
public class UserTest implements Comparable {

    private int age;

    public UserTest(int age) {

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        //System.out.println("User.Age:" + this.age);
        UserTest u = (UserTest)o;

       /* if(this.age == u.age) {

            return 0;
        }
        else {


        }*/
        //return this.age - u.age;

        System.out.println("this.age:" + this.age + "; Object.age:" + ((UserTest)o).age) ;
        return this.age;
    }

    @Override
    public boolean equals(Object o) {

        return true;
    }
}
