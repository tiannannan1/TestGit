package pers.tnn.test.multi_thread;

/**
 * Description: join进程
 * User: Tian nan nan
 * Date: 2017/9/5
 */
public class JoinThreadTest extends Thread{

    // 提供有参构造方法，方面给线程命名
    public JoinThreadTest(String threadName) {

        super(threadName);
    }

    @Override
    public void run() {

        for(int i = 0; i < 100; i++) {

            System.out.println(getName() + "-" + i);
        }
    }

    public static void main(String[] args) throws Exception {
        // 子线程
        new JoinThreadTest("新线程").start();

        for(int i = 0; i < 5; i++) {

            if(i == 2) {
                JoinThreadTest jtt = new JoinThreadTest("被join的线程");
                jtt.start();
                // main线程调用了jtt的join()方法，必须等jtt线程执行完后才能继续往下执行
                jtt.join();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
