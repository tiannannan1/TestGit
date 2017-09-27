package pers.tnn.test.inoroutputsream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Description: Files
 * User: Tian nan nan
 * Date: 2017/9/1
 */
public class FilesTest {

    public static void main(String[] args) {

        try {

            // 直接将new.txt中的文件复制到out.txt中
            Files.copy(Paths.get("J:\\file\\new.txt"), new FileOutputStream("J:\\file\\out.txt"));
            // 返回文件上次修改时间
            System.out.println(Files.getLastModifiedTime(Paths.get("J:\\file\\new.txt")));
            // 返回文件的所有者
            System.out.println(Files.getOwner(Paths.get("J:\\file\\new.txt")));
            // 一次读取文件的所有行,并将所有的行遍历出来
            Files.readAllLines(Paths.get("J:\\file\\new.txt"))
                    .forEach(str -> System.out.println(str));
            // 使用java8 新增的 Stream API读取文件内容
            Files.lines(Paths.get("J:\\file\\new.txt"))
                    .forEach(str -> System.out.println("stream读出的：" + str));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
