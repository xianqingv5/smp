package com.yiche.smp.common.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 数据进行【加减乘除的运算】
 */
public class DataCalculationUtils {
    //默认除法运算精度
    private static final int DEF_DIV_SCALE = 2;

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 设置double数字格式
     *
     * @param val
     * @return
     */
    public static double doubleDeal(double val) {
        double number = 0.0;
        DecimalFormat df = new DecimalFormat("#.0000");
//java默认的格式是HALF_EVEN   根据如果第二位为偶数第三位为5则五舍六入
        df.setRoundingMode(RoundingMode.HALF_UP);
        number = Double.parseDouble(df.format(val));
        return number;
    }

    public static double doubleDeal2(double val) {
        double number = 0.0;
        DecimalFormat df = new DecimalFormat("#.00");
//java默认的格式是HALF_EVEN   根据如果第二位为偶数第三位为5则五舍六入
        df.setRoundingMode(RoundingMode.HALF_UP);
        number = Double.parseDouble(df.format(val));
        return number;
    }

    public static float floatDeal(double val) {
        float number = 0.0f;
        DecimalFormat df = new DecimalFormat("#.00");
//java默认的格式是HALF_EVEN   根据如果第二位为偶数第三位为5则五舍六入
        df.setRoundingMode(RoundingMode.HALF_UP);
        number = Float.parseFloat(df.format(val));
        return number;
    }

    public static void main(String[] args) {
        // System.out.println(div(118822851.29,1000000.0,2));
        System.out.println(doubleDeal(-0.66));
        System.out.println(doubleDeal2(1235.235));
        double floatDeal = floatDeal(1000.45/3);
        System.out.println(floatDeal);
        System.out.println(floatDeal(1000.45/3));

    }

}
