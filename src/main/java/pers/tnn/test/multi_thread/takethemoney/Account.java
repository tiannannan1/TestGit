package pers.tnn.test.multi_thread.takethemoney;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Description: 账户类
 * User: Tian nan nan
 * Date: 2017/9/6
 */
public class Account {

    private String accountNo;
    private double balance;
    // 获得锁对象
    private final ReentrantLock lock = new ReentrantLock();

    public Account() { }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    // 将此方法修改为线程同步方法
    /*public void setBalance(double balance) {
        this.balance = balance;
    }*/

    /*public synchronized void drawBalance(double drawAmount) {

        if(drawAmount <= balance) {

            System.out.println(Thread.currentThread().getName() + "取款成功，取款金额为：" + drawAmount);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= drawAmount;
            System.out.println(Thread.currentThread().getName() + "取款后余额：" + balance);
        }else {

            System.out.println(Thread.currentThread().getName() + "余额不足，取款失败");
        }
    }*/

    public void drawBalance(double drawAmount) {

        // 加锁
        lock.lock();
        try {

            if(drawAmount <= balance) {

                System.out.println(Thread.currentThread().getName() + "取款成功，取款金额为：" + drawAmount);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= drawAmount;
                System.out.println(Thread.currentThread().getName() + "取款后余额：" + balance);
            }else {

                System.out.println(Thread.currentThread().getName() + "余额不足，取款失败");
            }
        }finally {

            lock.unlock();// 释放锁
        }
    }


    // 根据accountNo重写hashCode()和equals()方法
    @Override
    public int hashCode() {

        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(this == o) {

            return true;
        }

        if(o != null && o.getClass() == Account.class) {

            Account target = (Account)o;

            return target.accountNo.equals(accountNo);
        }

        return false;
    }
}
