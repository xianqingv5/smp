package com.yiche.smp.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/21
 */
public class DateUtil {


    private DateUtil() {
    }

    /**
     * 获取前五个月
     *
     * @param date
     * @return
     */
    public static List <String> DisposeDateData(String date) {
        List <String> strings = new ArrayList <>();
        String monthData = date;
        //获取月份
        Integer month = Integer.parseInt(monthData.substring(monthData.lastIndexOf("-") + 1));
        Integer year = Integer.parseInt(monthData.substring(0, monthData.lastIndexOf("-")));
        //判断月份大于5的情况
        if (month >= 5) {
            for (int i = 4; i >= 0; i--) {
                strings.add(year + "-" + (month - i));
            }
        } else {
            //若月份没有大于5
            Integer flag = 12;
            for (int i = 4; i >= 0; i--) {
                Integer currentmonth = month--;
                if (currentmonth > 0) {
                    strings.add(year + "-" + currentmonth);
                } else {
                    strings.add((year - 1) + "-" + flag--);
                }
            }
            Collections.reverse(strings);
        }
        return strings;
    }

    /**
     * 获取月份
     *
     * @param value
     * @return
     */
    public static List <String> DisposeDateMonth(List <String> value, String pattern) {
        List <String> strings = new ArrayList <>();
        for (String s : value) {
            strings.add(s.substring(s.lastIndexOf("-") + 1) + pattern);
        }
        return strings;
    }


    /**
     * 获取年
     *
     * @param monthData
     * @return
     * @throws ParseException
     */
    public static Integer getYear(String monthData) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Date date = simpleDateFormat.parse(monthData);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(Calendar.YEAR);
        return i;
    }

    /**
     * 获取月
     *
     * @param monthData
     * @return
     * @throws ParseException
     */
    public static Integer getMonth(String monthData) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Date date = simpleDateFormat.parse(monthData);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(Calendar.MONTH);
        return i + 1;
    }

    /**
     * 拼接日期
     *
     * @param monthData
     * @return
     */
    public static String jointDate(String monthData) throws ParseException {
        //获取年
        Integer year = getYear(monthData);
        Integer month = getMonth(monthData);
        if (month < 10) {
            monthData = year + "-" + "0" + month;
        }
        return monthData;
    }
}
