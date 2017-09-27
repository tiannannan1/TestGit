package pers.tnn.test.exception;

/**
 * Description: 测试return在try,catch,finally不同位置时的作用
 * User: Tian nan nan
 * Date: 2017/8/18
 */
public class ReturnInDifWhereTest {

    public static int count() {

        int a = 1;

        try {
            a = 3;
            return a; // ①
        }catch (Exception e) {

            //e.getMessage();
            return 0; // ②
        }finally {
            a = 2;
            System.out.println("finally方法");
            //return a; // ③
        }

        //a = 4;
        //return a; // ④ unreachable statemnt
    }

    public static void main(String[] args) {

        System.out.println("输出count()方法中计算的值：" + count());
    }
}