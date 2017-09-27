package pers.tnn.test.multi_thread;

/**
 * Description: 继承Thread的多线程实现实例
 * User: Tian nan nan
 * Date: 2017/9/4
 */
public class ThreadTest extends Thread{

    @Override
    public void run() {// run方法就是线程执行体

        for(int i = 0; i < 100; i++) {

            // 返回当前线程的名称
            System.out.println(getName() + ":" + i);
        }
    }


    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {

            // 返回当前执行线程对象的引用
            System.out.println(Thread.currentThread().getName() + "::" + i);

            if(i == 20) {
                // 创建启动两条线程
                new ThreadTest().start();
                new ThreadTest().start();
            }
        }
    }
}
