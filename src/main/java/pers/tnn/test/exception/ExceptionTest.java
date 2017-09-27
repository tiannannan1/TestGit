package pers.tnn.test.exception;

/**
 * Description: 异常相关测试
 * User: Tian nan nan
 * Date: 2017/8/17
 */
public class ExceptionTest {

    public static void main(String[] args) {

        try {

            String str = "test";
            // NumberFormatException
            System.out.println(Integer.valueOf(str));

            String str1 = null;
            // NullPointerException
            //System.out.println(str1.trim());

            int a = 2;
            int b = 0;
            // ArithmeticException
            //System.out.println(2/0);

        }catch (CustomException ce){

            ce.getMessage();
        }

        catch (NumberFormatException e) {

            //System.out.println("异常getMessage：" + e.getMessage());
            //e.printStackTrace();
            System.out.println("异常getStackTrace:" + e.getStackTrace());

            // 此处有默认final修饰，所以不允许修改变量值
            // e = new NumberFormatException();

            //System.err.println("数字转化异常,空指针异常，数学算术异常之一");
        }/*catch (NullPointerException e) {
            System.err.println("空指针异常");
        }catch (ArithmeticException e) {
            System.err.println("数学运算异常：0不能作除数");
        }*/catch (Exception e) { //父类异常不允许和子类异常在一个catch块

            // 捕获一个异常时，异常变量没有final修饰，异常变量可以改变
            e = new Exception("test");

            System.err.println("其他异常");
        }
    }
}
