package pers.tnn.test.multi_thread;

/**
 * Description: Daemon(后台)线程测试
 * User: Tian nan nan
 * Date: 2017/9/6
 */
public class DaemonThreadTest extends Thread {

    //重写run方法，线程执行体(后天线程的执行体也一样)
    @Override
    public void run() {

        for(int i = 0; i < 100; i++) {

            System.out.println(getName() + "- 后台线程 -" + i);
        }
    }

    public static void main(String[] args) {

        DaemonThreadTest dtt = new DaemonThreadTest();
        // 必须在start之前设置，否则引发illegalThreadStartException
        dtt.setDaemon(true);
        dtt.start();
        // 主线程是线程中唯一的前台线程
        for(int i = 0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName() + "- 前台线程 -" + i);
        }
        // 当前台线程(main线程)结束后，jvm自动退出，后台线程也随之结束
    }
}
