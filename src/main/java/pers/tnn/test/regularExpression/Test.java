package pers.tnn.test.regularExpression;

import java.util.Locale;

/**
 * Description: 正则表达式相关应用
 * User: Tian nan nan
 * Date: 2017/8/5
 */
public class Test {

    public static void main(String[] args) {

        /*String str = "我的手机号码：15731046235"
                    + "你的手机号码：13531046235"
                    +"他的手机号码：18331046235" ;

        Matcher matcher = Pattern.compile("((15\\d)|(13\\d)|(18\\d))\\d{8}").matcher(str);
        while (matcher.find()) {

            System.out.println(matcher.group() + ",起始位置：" + matcher.start() + ";结束位置：" + matcher.end());

        }*/

        // java 国际化
        Locale[] l = Locale.getAvailableLocales();

        System.out.println(Locale.getAvailableLocales().length);


    }
}
