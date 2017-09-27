package pers.tnn.test.bigdecimal;

import java.math.BigDecimal;

/**
 * Description: BigDecimal类应用
 * User: Tian nan nan
 * Date: 2017/8/5
 */
public class BigDecimalUtil {

    private static int roundindMode = 2; // 要应用的舍入模式

    // 私有化构造器，从而不能随便实例化
    private BigDecimalUtil(){};

    // 将数值转化为BigDecimal类型mn
    /**
     * @Description：返回两double类型的和
     * @Params:$ $
     * @Author: Tian nan nan
     * @Date:  2017/8/5
     */
    public static double add(double d1, double d2) {

        BigDecimal bigDecimal = BigDecimal.valueOf(d1);
        BigDecimal bigDecima2 = BigDecimal.valueOf(d2);

        return bigDecimal.add(bigDecima2).doubleValue();
    }

    /**
     * @Description：a返回两个double类型相减后的结果
     * @Params:$ $
     * @Author: Tian nan nan
     * @Date:  2017/8/5
     */
    public static double sub(double d1, double d2) {

        BigDecimal bigDecimal = BigDecimal.valueOf(d1);
        BigDecimal bigDecima2 = BigDecimal.valueOf(d2);

        return  bigDecimal.subtract(bigDecima2).doubleValue();
    }

    /**
     * @Description：返回两double类型值得乘积
     * @Params:$ $
     * @Author: Tian nan nan
     * @Date:  2017/8/5
     */
    public static double mul(double d1, double d2) {

        BigDecimal bigDecimal = BigDecimal.valueOf(d1);
        BigDecimal bigDecima2 = BigDecimal.valueOf(d2);

        return  bigDecimal.multiply(bigDecima2).doubleValue();
    }

    /**
     * @Description：返回两double类型的商，若除不尽则按标的
     * @Params:$ $
     * @Author: Tian nan nan
     * @Date:  2017/8/5
     */
    public static double divide(double d1, double d2) {

        BigDecimal bigDecimal1 = BigDecimal.valueOf(d1);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(d2);

        return bigDecimal1.divide(bigDecimal2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
