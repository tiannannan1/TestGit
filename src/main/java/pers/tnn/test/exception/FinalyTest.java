package pers.tnn.test.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Description: finally资源回收
 * User: Tian nan nan
 * Date: 2017/8/18
 */
public class FinalyTest {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {

            int num = count();

            System.out.println("count方法输出：" + num);

            fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("catch块输出的信息：" + e.getMessage());
            return; // 强制方法返回，finally()方法仍可执行
           // System.exit(1);// 退出虚拟机，导致finally()方法无法执行。
        }finally {
            // 关闭磁盘文件，回收资源
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("执行finally的资源回收");

            // return;
        }
    }

    public static int count() {

        int a = 1;

        try {
            a = 3;
            return a;
        }catch (Exception e) {

            //e.getMessage();
            //return 0;
        }finally {
            a = 2;
            //return a;
        }

        a = 4;
        return a; // unreachable statemnt
    }
}
