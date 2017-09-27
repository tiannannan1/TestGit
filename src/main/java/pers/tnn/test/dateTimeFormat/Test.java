package pers.tnn.test.dateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * Description: java.utile.foramt 的相关应用
 * User: Tian nan nan
 * Date: 2017/8/7
 */
public class Test {

    public static void main(String[] args) {

        /*
        * 格式化时间
        * */
        Date nowDate = new Date();
        System.out.println("未处理的当前时间:" + nowDate);

        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("simpleDateFormat处理的当前时间：" + simpleDateFormat.format(nowDate));

        // 获取当前时间
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        DateTimeFormatter dateTimeFormatters [] = new DateTimeFormatter[] {

                DateTimeFormatter.ISO_LOCAL_DATE, // 2017-08-07
                DateTimeFormatter.ISO_DATE_TIME, // 2017-08-07T09:38:57.241
                DateTimeFormatter.ISO_DATE, // 2017-08-07
                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG), // 2017年8月7日
                DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM), // 2017-8-7
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT), // 17-8-7
                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL), // 2017年8月7日 星期一
                DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss") // 2017-08-07 09:38:57
        };

        for(int i = 0; i < dateTimeFormatters.length; i++) {

            System.out.println(dateTimeFormatters[i].toString() + ">>" + dateTimeFormatters[i].format(localDateTime));
        }

        /*
        * 将字符串解析成日期时间对象
        * */

        String strDate = "2017-08-07";
        LocalDate localDate = LocalDate.parse(strDate);
        LocalDate loDate = LocalDate.parse(strDate, DateTimeFormatter.ISO_DATE);
        System.out.println("字符串日期：" + localDate);
        System.out.println("字符串日期：" + loDate);
    }
}
