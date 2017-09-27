package pers.tnn.test.multi_thread;

/**
 * Description: 线程让步yield
 * User: Tian nan nan
 * Date: 2017/9/6
 */
public class YieldThreadTest extends Thread{

    //提供有参构造器，便于传递线程名称
    public YieldThreadTest(String name) {
        super(name);
    }

    // 重写run方法(执行体)
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {

            System.out.println(getName() + "-" + i);
            // 当 i == 2时，让该线程暂停
            if(i == 2) {

                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());

        YieldThreadTest ytt = new YieldThreadTest("高级");
        // 设置线程最高优先级
        ytt.setPriority(Thread.MAX_PRIORITY);// 10
        System.out.println("----MAX_PRIORITY------" + ytt.getPriority());
        ytt.start();
        YieldThreadTest ytt1 = new YieldThreadTest("低级");
        // 设置线程最低优先级
        ytt1.setPriority(Thread.MIN_PRIORITY);// 1
        System.out.println("----MIN_PRIORITY------" + ytt1.getPriority());
        ytt1.start();
        YieldThreadTest ytt2 = new YieldThreadTest("无级别");
        // 默认优先级
        ytt2.setPriority(Thread.NORM_PRIORITY);// 5
        System.out.println("----NORM_PRIORITY------" + ytt2.getPriority());
        ytt2.start();
    }
}
