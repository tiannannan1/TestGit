package pers.tnn.test.calendarOrTime;

import java.text.DateFormat;
import java.time.*;
import java.util.Calendar;

/**
 * Description: 测试java8的日期，时间类
 * User: Tian nan nan
 * Date: 2017/8/5
 */
public class Test {

    public static void main(String[] args) {

        /*
        * calendar测试
        * */
        DateFormat dateFormat =DateFormat.getDateInstance();

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.MONTH,2);

        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(calendar.getTime());

        // MonthDay
        System.out.println( MonthDay.now()); // 当前月日
        System.out.println(Year.now()); // 当前年
        System.out.println(YearMonth.now()); // 当前年月
          YearMonth.now().minusYears(2);
          Year.now().minusYears(1);
          Year.now().plusYears(1);

        System.out.println(YearMonth.now().minusYears(2));
        YearMonth.now().minusMonths(1);
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(DayOfWeek.SUNDAY.getValue());// 获取周日的枚举值：7
        System.out.println(Month.AUGUST.getValue()); // 获取八月的枚举值：8

        String str = "assd";
        System.out.println(str.matches("asd")); // 判断字符串str是否匹配给定的正则表达式“asd”
        System.out.println(str.replaceAll("s","b"));
        System.out.println(str.replaceFirst("s", "b"));
    }
}
