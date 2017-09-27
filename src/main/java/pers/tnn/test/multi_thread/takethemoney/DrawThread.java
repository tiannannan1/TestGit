package pers.tnn.test.multi_thread.takethemoney;

/**
 * Description: 取钱线程
 * User: Tian nan nan
 * Date: 2017/9/6
 */
public class DrawThread extends Thread{

    // 模拟取钱账户
    private Account account;
    // 当前线程希望取得的钱数
    private double drawAmount;

    public DrawThread(String name,Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    // 多条线程修改同一数据时，将涉及数据安全问题
    @Override
    public void run() {

        // 使用同步方法解决多线程问题
        account.drawBalance(drawAmount);

        // 使用同步代码块解决多线程问题
        /*synchronized (account) {

            if(account.getBalance() >= drawAmount) {

                System.out.println(getName() + "取钱成功,取款金额为:" + drawAmount);
                try {
                    // 强制线程调度切换
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 修改余额
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("余额为：" + account.getBalance());
            }else {

                System.out.println(getName() + "余额不足！！！");
            }
        }*/

        /*if(account.getBalance() >= drawAmount) {

            System.out.println(getName() + "取钱成功,取款金额为:" + drawAmount);
            try {
                // 强制线程调度切换
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 修改余额
            account.setBalance(account.getBalance() - drawAmount);
            System.out.println("余额为：" + account.getBalance());
        }else {

            System.out.println(getName() + "余额不足！！！");
        }*/
    }
}
