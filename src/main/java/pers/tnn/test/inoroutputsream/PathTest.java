package pers.tnn.test.inoroutputsream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * Description: Path和Paths应用
 * User: Tian nan nan
 * Date: 2017/9/1
 */
public class PathTest {

    public static void main(String[] args) {

        // 将给定的URI转换为Path对象。
        Path path = Paths.get("J:\\file\\a\\");
        // 将路径字符串或连接到路径字符串的字符串序列转换为 Path 。
        Path path1 = Paths.get("J", "file");
        System.out.println(path);
        // 将此路径表示的文件或目录的名称返回为 Path对象。
        System.out.println(path.getFileName());
        // 返回此路径的名称元素作为 Path对象。
        System.out.println(path.getName(0));
        // 返回路径中的名称元素的数量。
        System.out.println(path.getNameCount());
        //这条路径是否是绝对的。
        System.out.println(path.isAbsolute());
        // 返回此路径的名称元素的迭代器。
        Iterator<Path> pathIterator = path.iterator();
        while (pathIterator.hasNext()) {

            System.out.println("遍历路径名称元素：" + pathIterator.next());
        }
    }
}
