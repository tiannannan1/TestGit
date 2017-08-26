package pers.tnn.test.inoroutputsream;

import java.io.File;

/**
 * Description: java.io File 测试
 * User: Tian nan nan
 * Date: 2017/8/24
 */
public class FileTest {

    public static void main(String[] args) {

        //File file = new File("J:\\file\\TestFile.text");
        File file = new File("J:\\file");

        // 返回文件名中包含"File"的文件
        String[] strings = file.list((dir, name) -> name.contains("File"));
        for (String str: strings) {

            System.out.println(str);
        }

        /*// 测试此抽象路径名表示的文件是否为普通文件。
        System.out.println(file.isFile());
        // 返回file对象所对应的路径名
        System.out.println(file.getPath());
        // 返回file对象所对应的文件名或者路径名
        System.out.println(file.getName());
        // 返回file对象的绝对对径
        System.out.println(file.getAbsoluteFile());
        // 返回file对象对应的绝对对径名
        System.out.println(file.getAbsolutePath());*/
    }
}
