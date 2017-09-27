package pers.tnn.test.object;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 该类主要是测试Object，Objects,ThreadLocalRandom，StringBuilder，StringBuffer类的相关内容
 * User: Tian nan nan
 * Date: 2017/8/5
 */

public class Test {

    /**
     * @Description：
     * @Author: Tian nan nan
     * @Date:  2017/8/5
     */
    public static void main(String[] args) throws CloneNotSupportedException {

        User user1 = new User("张三", 23);
        User user2 = user1.clone();

        System.out.println(user1 == user2);
        System.out.println(user1.getAge() == user2.getAge());

        // hashCode不相同，不是同一个对象
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(user1.getAddress() == user2.getAddress());
        System.out.println(user1.getAddress().equals(user2.getAddress()));

        /*
        * Objects对空指针的处理，当变量为null时不会报异常会直接输出null
        * */
        String str = null;
        System.out.println(Objects.toString(str));
        // System.out.println(str.toString()); NullPointerException

        // 使用ThreadLocalRandom 获取随机数
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        System.out.println("10以内的随机数:" + threadLocalRandom.nextInt(1,13));

        /*
        * StringBuilder，StringBuffer测试
        * */

        StringBuilder stringBuilder = new StringBuilder()
                .append("a")
                .append("b");
        StringBuffer stringBuffer = new StringBuffer()
                .append("a")
                .append("b");
        System.out.println("stringBuilder的值：" + stringBuilder.hashCode());
        System.out.println("stringBuffer的值：" + stringBuffer.hashCode());
        System.out.println(stringBuilder.toString().equals(stringBuffer.toString()));
    }
}
