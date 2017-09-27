package pers.tnn.test.bigdecimal;

import java.math.BigDecimal;

/**
 * Description: 测试BigDecimalUtil
 * User: Tian nan nan
 * Date: 2017/8/5
 */
public class BigDecimalTest {

    public static void main(String[] args) {

        double d1 = 8;
        double d2 = 3;

        System.out.println(d1 + d2);

        System.out.println(BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue());

        // 加
        System.out.println("和：" + BigDecimalUtil.add(d1, d2));

        // 减
        System.out.println("差：" + BigDecimalUtil.sub(d1, d2));

        // 乘
        System.out.println("积" + BigDecimalUtil.mul(d1, d2));

        //除
        System.out.println("商" + BigDecimalUtil.divide(d1, d2));
    }
}
