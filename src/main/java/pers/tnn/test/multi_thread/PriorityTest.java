package pers.tnn.test.multi_thread;

/**
 * Description: 测试优先级高的将获得较多的执行机会
 * User: Tian nan nan
 * Date: 2017/9/6
 */
public class PriorityTest extends Thread {

    public PriorityTest(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            System.out.println(getName() + "-优先级：" + getPriority() + "-变量值：" + i);
        }
    }

    public static void main(String[] args) {
        // 修改main线程的优先级
        Thread.currentThread().setPriority(6);
        System.out.println("main优先级:" + Thread.currentThread().getPriority());

        for (int i = 0; i < 10; i++) {

            if(i == 2) {

                PriorityTest p1 = new PriorityTest("低级");
                System.out.println("低级-原始优先级：" + p1.getPriority());
                p1.start();
                // 改变原始优先级
                p1.setPriority(Thread.MIN_PRIORITY);
            }

            if(i == 8) {

                PriorityTest p2 = new PriorityTest("高级");
                System.out.println("高级-原始优先级：" + p2.getPriority());
                p2.start();
                // 改变原始优先级
                p2.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
