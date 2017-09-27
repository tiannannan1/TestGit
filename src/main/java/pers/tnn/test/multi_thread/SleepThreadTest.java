package pers.tnn.test.multi_thread;

import java.util.Date;

/**
 * Description: sleep()
 * User: Tian nan nan
 * Date: 2017/9/6
 */
public class SleepThreadTest {

    public static void main(String[] args) throws Exception {

        for(int i = 0; i < 10; i++) {

            System.out.println("当前时间：" + new Date());
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
