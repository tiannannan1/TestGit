package pers.tnn.test.inoroutputsream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Description: 对象序列化
 * User: Tian nan nan
 * Date: 2017/8/29
 */
public class SerializableTset {

    public static void main(String[] args) throws IOException {

        try(
                // 创建一个ObjectOutputStream流，指定输入到磁盘的位置
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("J:\\file\\object.txt")))
        {

            Person per = new Person("孙悟空", 500);
            Teacher t1 = new Teacher("唐僧", per);
            Teacher t2 = new Teacher("菩提老祖", per);

            // 将对象写入输出流，实现per对象的序列化
            oos.writeObject(t1);
            oos.writeObject(t2);
            oos.writeObject(per);
        }catch(IOException e) {

            e.printStackTrace();
        }
    }
}
