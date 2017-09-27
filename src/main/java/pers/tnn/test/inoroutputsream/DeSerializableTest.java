package pers.tnn.test.inoroutputsream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Description: 反序列化
 * User: Tian nan nan
 * Date: 2017/8/29
 */
public class DeSerializableTest {

    public static void main(String[] args) throws IOException {

        try(
                // 创建ObjectInputStream输入流，并且指定目标文件的序列化文件
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("J:\\file\\object.txt")))
        {
            // 获取反序列化的对象
            Teacher t1 = (Teacher) ois.readObject();
            Teacher t2 = (Teacher) ois.readObject();
            Person per = (Person)ois.readObject();

            System.out.println("teacher1信息：" + t1.getName() + ";student:" + t1.getStudent().getName());
            System.out.println("teacher2信息：" + t2.getName() + ";student:" + t2.getStudent().getName());
            System.out.println("persom信息：" + per.getAge() + ";name:" + per.getName());

            System.out.println(t2.getStudent() == t1.getStudent());
        }catch (ClassNotFoundException cfe) {

            cfe.getMessage();
        }
    }
}
