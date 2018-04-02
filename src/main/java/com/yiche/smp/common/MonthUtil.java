package com.yiche.smp.common;

/**
 * Created by Lenovo on 2017/12/21.
 */
public class MonthUtil {
    public static String getPrevMonthDate(String monthdata) {
        //获取上月月份
        String[] split = monthdata.split("-");
        String year = split[0];
        String mongth = split[1];
        String monthData1 = null;
        if (Integer.parseInt(mongth) == 1) {
            Integer year1 = Integer.parseInt(year) - 1;
            monthData1 = year1 + "-" + 12;
            return monthData1;
        }
        Integer month1 = Integer.parseInt(mongth) - 1;
        monthData1 = year + "-" + month1;
        return monthData1;
    }

}
