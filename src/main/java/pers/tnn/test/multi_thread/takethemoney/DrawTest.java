package pers.tnn.test.multi_thread.takethemoney;

/**
 * Description: 启动线程类
 * User: Tian nan nan
 * Date: 2017/9/6
 */
public class DrawTest {

    public static void main(String[] args) {

        // 创建一个账户
        Account account = new Account("test", 1000);

        // 模拟两个线程对同一个账户取钱
        new DrawThread("Amy", account, 800).start();
        new DrawThread("Sun", account, 700).start();

        /*
        输出结果：
        1.Amy取钱成功,取款金额为:800.0
        Sun取钱成功,取款金额为:800.0
        余额为：200.0
        余额为：200.0

        2.Sun取钱成功,取款金额为:700.0
        Amy取钱成功,取款金额为:800.0
        余额为：300.0
        余额为：300.0

        3.Sun取钱成功,取款金额为:700.0
        Amy取钱成功,取款金额为:800.0
        余额为：300.0
        余额为：-500.0
        */
    }
}
