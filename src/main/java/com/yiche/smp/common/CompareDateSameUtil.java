package com.yiche.smp.common;

import java.util.Date;

/**
 * 比较日期是否相等
 */
public class CompareDateSameUtil {

    public static boolean compareToDateSame(Date dt1, Date dt2) {
        if (dt1 == null || dt2 == null) {
            return false;
        }
        String s1 = DateParseUtil.dateTostring(dt1, "yyyy-MM-dd");
        String s2 = DateParseUtil.dateTostring(dt2, "yyyy-MM-dd");
        return s1.equals(s2);
    }
}
