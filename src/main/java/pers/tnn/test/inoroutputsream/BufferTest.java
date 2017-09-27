package pers.tnn.test.inoroutputsream;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * Description: NIO之Buffer
 * User: Tian nan nan
 * Date: 2017/8/30
 */
public class BufferTest {

    public static void main(String[] args) {

        // 创建直接的buffer，如果其他类型需要直接的Buffer，可以通过转化类型获得
        Buffer buffer = ByteBuffer.allocateDirect(8);
        //FloatBuffer floatBuffer = (FloatBuffer)buffer;

        // 创建capacity为8的CharBuffer
        CharBuffer charBuffer = CharBuffer.allocate(8);
        // 生成直接的Buffer
        //CharBuffer charBuffer = (CharBuffer)buffer;
        // 分别获得CharBuffer的position，limit,capacity(创建时指定，且不变)
        System.out.println("初始时capacity：" + charBuffer.capacity());// 8
        System.out.println("初始时limit：" + charBuffer.limit()); // 8
        System.out.println("初始时position：" + charBuffer.position()); // 0
        //System.out.println("初始时mark：" + charBuffer.mark()); // 不存在值
        // 放入元素
        System.out.println("---------放入元素--------");
        charBuffer.put("a");
        charBuffer.put("b");
        charBuffer.put("c"); //
        System.out.println("放入元素后limit：" + charBuffer.limit()); // 8
        System.out.println("放入元素后position：" + charBuffer.position()); // 3
        System.out.println("放入元素后mark：" + charBuffer.mark()); // 不存在值
        // 调用flip方法，为读取数据做准备
        System.out.println("--------调用flip方法--------");
        charBuffer.flip();
        System.out.println("flip后limit：" + charBuffer.limit()); // 3
        System.out.println("flip后position：" + charBuffer.position()); // 0
        System.out.println("flip后mark：" + charBuffer.mark()); // abc
        // 相对-读取数据
        System.out.println("--------相对-读取数据--------");
        System.out.println("相对方法读取数据：" + charBuffer.get());// a
        System.out.println("get()后limit：" + charBuffer.limit()); // 3
        System.out.println("get()后position：" + charBuffer.position()); // 1
        System.out.println("get()后mark：" + charBuffer.mark()); // bc
        // clear()
        System.out.println("--------clear() One--------");
        charBuffer.clear();
        System.out.println("clear()后limit：" + charBuffer.limit()); // 8
        System.out.println("clear()后position：" + charBuffer.position()); // 0
        System.out.println("clear()后mark：" + charBuffer.mark()); // abc
        // reset()
        System.out.println("--------reset()--------");
        System.out.println("reset返回值：" + charBuffer.reset());// abc
        System.out.println("reset()后limit：" + charBuffer.limit()); // 8
        System.out.println("reset()后position：" + charBuffer.position()); // 0
        System.out.println("reset()后mark：" + charBuffer.mark()); // abc
        //再次插入数据
        System.out.println("--------再次插入数据--------");
        charBuffer.put("d");
        System.out.println("再次插入数据后limit：" + charBuffer.limit()); // 8
        System.out.println("再次插入数据后position：" + charBuffer.position()); // 1
        System.out.println("再次插入数据后mark：" + charBuffer.mark()); // bc
        // clear()
        System.out.println("--------clear()--------");
        charBuffer.clear();
        System.out.println("clear()后limit：" + charBuffer.limit()); // 8
        System.out.println("clear()后position：" + charBuffer.position()); // 0
        System.out.println("clear()后mark：" + charBuffer.mark()); // dbc
        // 绝对-读取数据
        System.out.println("--------绝对-读取数据--------");
        System.out.println(charBuffer.get(0));// d
        System.out.println("get(1)后limit：" + charBuffer.limit()); // 8
        System.out.println("get(1)后position：" + charBuffer.position()); // 0
        System.out.println("get(1)后mark：" + charBuffer.mark()); // dbc
        // 第三次插入数据
        charBuffer.put("e");
        System.out.println("--------第三次插入数据--------");
        System.out.println("第三次插入数据后limit：" + charBuffer.limit()); // 8
        System.out.println("第三次插入数据后position：" + charBuffer.position()); // 1
        System.out.println("第三次插入数据后mark：" + charBuffer.mark()); // bc
        charBuffer.clear();
        System.out.println("0:" + charBuffer.get(0));// e
        System.out.println("1:" + charBuffer.get(1));// b
        System.out.println("2:" + charBuffer.get(2));// c
        // 没有值，以为在该Buffer中只有3个元素
        System.out.println("3:" + charBuffer.get(3));
        System.out.println("4:" + charBuffer.get(4));

        System.out.println("查看是不是直接的Buffer：" + charBuffer.isDirect());

    }
}
