package com.yiche.smp.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 日期格式化工具类
 */
public class DateParseUtil {
    public static Date dateTodate(Date date, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        String str = sdf.format(date);
        try {
            date = sdf.parse(str);
        } catch (Exception e) {
            return null;
        }
        return date;
    }

    public static String dateTostring(Date date, String formatStr) {
        String strDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        strDate = sdf.format(date);
        return strDate;
    }


    /**
     * @param dateString Thu May 18 2017 00:00:00 GMT+0800 (中国标准时间)
     * @return "2017-10";
     */
    public static String parseTimeMonth(String dateString) {
        Date date = StrintParseToDate(dateString);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        return sdf.format(date);

    }

    /**
     * @param dateString Thu May 18 2017 00:00:00 GMT+0800 (CST)
     * @return "2017-10-11";
     */
    public static String parseTime(String dateString) {
        Date date = StrintParseToDate(dateString);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);

    }

    /**
     * @param dateString "Thu May 18 2017 00:00:00 GMT+0800 (CST)";
     * @return "2017/10/12"
     */
    public static String parseDate(String dateString) {
        Date date = StrintParseToDate(dateString);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(date);
    }

    private static Date StrintParseToDate(String dateString) {
        dateString = dateString.replace("GMT", "").replaceAll("\\(.*\\)", "");
        //将字符串转化为date类型，格式2016-10-12
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss z", Locale.ENGLISH);
        Date dateTrans = null;
        try {
            dateTrans = format.parse(dateString);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = sdf.format(dateTrans);
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    //获取当前系统前一天日期
    public static Date getNextDay1(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        return date;
    }
    //  获取当前系统当天日期
    public static Date getNextDay2(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 0);
        date = calendar.getTime();
        return date;
    }

    //获取当前系统下一天日期
    public static Date getNextDay3(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        date = calendar.getTime();
        return date;
    }

    public static void main(String[] args) throws ParseException {
        /*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dateString="2000-03-01";
        Date date = df.parse(dateString);
        Date preDay = getPreDay(date);
        System.out.println(dateTostring(preDay,"yyyy-MM-dd"));*/
    }

}
