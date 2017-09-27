package pers.tnn.test.exception;

/**
 * Description: 自定义异常
 * User: Tian nan nan
 * Date: 2017/8/18
 */
public class CustomException extends RuntimeException {

    // 无参构造器
    public CustomException(){}

    // 带一个字符串参数的参构造器，该字符串将作为异常的表述信息
    public CustomException(String msg) {

         super(msg);
    }
}
