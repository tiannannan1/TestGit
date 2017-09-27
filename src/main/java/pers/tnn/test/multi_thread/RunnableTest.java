package pers.tnn.test.multi_thread;

/**
 * Description: 实现接口Runnable，创建并启动线程对象
 * User: Tian nan nan
 * Date: 2017/9/4
 */
public class RunnableTest implements Runnable {

    private int i;

    @Override
    public void run() {// 仍然是线程执行体

        for(; i < 100; i++) {
            //实现Runnable接口，只能通过Thread.currentThread()方法获得当前线程
            System.out.println(Thread.currentThread().getName() +" ：" + i);
        }
    }

    public static void main(String[] args) {

        for(int i =0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName() +" ：：" + i);
            if(i == 20) {

                RunnableTest rt = new RunnableTest();

                new Thread(rt, "线程1").start();
                new Thread(rt, "线程2").start();
                // 使用Lambda表达式创建Runnable对象
                new Thread(()-> {

                    for(int j = 0; j < 100; j++) {
                        //实现Runnable接口，只能通过Thread.currentThread()方法获得当前线程
                        System.out.println(Thread.currentThread().getName() +" ：" + j);
                    }

                }, "线程3").start();

            }
        }
    }
}
