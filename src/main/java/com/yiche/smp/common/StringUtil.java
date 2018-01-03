package com.yiche.smp.common;

import com.yiche.smp.common.early.warning.ResultBrand;
import com.yiche.smp.common.euraka.data.Data;
import com.yiche.smp.common.linechart.BrandName;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Collator;
import java.util.*;

import static java.util.Collections.*;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/5
 */
public class StringUtil {

    private StringUtil() {
    }

    public static boolean notNull(String str) {
        return null != str && str.trim().length() > 0;
    }
    public static boolean ObjNotNull(Object obj){return null !=obj;}
    /**
     * 处理数据,转换为百分比格式 保留2位小数
     */
    public static String handleData(String str) {
        BigDecimal b = new BigDecimal(Double.valueOf(str) * 100);
        double f1 = b.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return f1 + "%";
    }

    /**
     * 处理数据,转换为百分比格式 保留2位小数
     */
    public static String handleData(Double str) {
        BigDecimal b = new BigDecimal(str * 100);
        double f1 = b.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return f1 + "%";
    }

    /**
     * 处理数据,四舍五入
     */
    public static String handletoRound(String str) {
        Double aDouble = Double.valueOf(str);
        long round = Math.round(aDouble);
        return String.valueOf(round);
    }

    /**
     * 处理数据,四舍五入
     */
    public static String handletoRound(Double str) {
        long round = Math.round(str);
        return String.valueOf(round);
    }


    /**
     * 中文拼音首字母排序
     */
    public static LinkedList <Data> chineseSort(LinkedList <Data> datas) {
        List <String> list = new ArrayList <>();
        Map <String, String> map = new LinkedHashMap <>();
        for (Data data : datas) {
            map.put(data.getId(), data.getName());
        }
        Set <Map.Entry <String, String>> entries = map.entrySet();
        for (Map.Entry <String, String> keyValue : entries) {
            list.add(keyValue.getValue());
        }
        Collections.sort(list, Collator.getInstance(Locale.CHINA));
        //重新组成map
        datas.clear();
        for (String s : list) {
            for (Map.Entry <String, String> keyValue : entries) {
                if (s.equals(keyValue.getValue())) {
                    datas.add(new Data(keyValue.getKey(), keyValue.getValue()));
                }
            }
        }
        return datas;
    }


    /**
     * 中文拼音首字母排序
     */
    public static List <BrandName> chineseLineChartSort(List <BrandName> datas) {
        List <BrandName> brandNames = new ArrayList <>();
        List <String> list = new ArrayList <>();
        for (BrandName brandName : datas) {
            list.add(brandName.getName());
        }
        Collections.sort(list, Collator.getInstance(Locale.CHINA));
        for (String s : list) {
            brandNames.add(new BrandName(s,null,null));
        }
        return brandNames;
    }
}
