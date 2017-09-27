package pers.tnn.test.multi_thread;

import java.util.concurrent.FutureTask;

/**
 * Description: 使用Callable，future，FutureTask创建并启动线程
 * User: Tian nan nan
 * Date: 2017/9/5
 */
public class CallableFutureTest {

    public static void main(String[] args) {

        // 使用FutureTask包装Callable对象
        // 使用Lambda表达式创建Callable对象
        FutureTask<Integer> futureTask = new FutureTask<Integer>(()-> {

            int i = 0;
            for(;i < 100; i++) {

                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            // call()方法的返回值
            return i;
        });

        for(int i=0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName() + "::" + i);

            if(i == 20) {

               // 实际上还是以Callable创建、启动线程
                new Thread(futureTask, "线程1：").start();
                new Thread(futureTask, "线程2：").start();
            }
        }

        try {
            // 获取线程返回值
            System.out.println("返回call()方法中的返回值：" + futureTask.get());
            System.out.println("任务是否完成" + futureTask.isDone());
        }catch (Exception e) {

            e.printStackTrace();
        }
    }
}
