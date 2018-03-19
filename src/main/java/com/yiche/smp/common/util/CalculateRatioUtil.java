package com.yiche.smp.common.util;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Ratio;
import com.yiche.smp.common.YichePlatform;

import java.util.List;

/**
 * 计算环比的工具类
 * Created by xuhaiqiang on 2018/3/13
 */
public class CalculateRatioUtil {

    public static List<YichePlatform> addCalculateRatio(List<YichePlatform> channelDataDayPre, List<YichePlatform> channelDataDayPre2) {
        for (int i = 0; i <= channelDataDayPre.size() - 1; i++) {
            YichePlatform yichePlatform = channelDataDayPre.get(i);
            for (int j = 0; j <= channelDataDayPre2.size() - 1; j++) {
                YichePlatform yichePlatform1 = channelDataDayPre2.get(j);
                if (yichePlatform == null || yichePlatform1 == null) {
                    return null;
                } else {
                    if (yichePlatform.getChannelName().equals(yichePlatform1.getChannelName())) {
                        yichePlatform.setClueRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsCnt(), yichePlatform1.getLeadsCnt()));
                        yichePlatform.setUserRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsUserCnt(), yichePlatform1.getLeadsUserCnt()));
                        yichePlatform.setLeadsCostRatio(CalculateRatioUtil.calculateRatio(yichePlatform.getLeadsCost(), yichePlatform1.getLeadsCost()));
                        yichePlatform.setNewUserCntRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getNewUserCnt(), yichePlatform1.getNewUserCnt()));
                        yichePlatform.setConsumeRatio(CalculateRatioUtil.calculateRatioFloat(yichePlatform.getActualConsume(), yichePlatform1.getActualConsume()));
                        continue;
                    }
                    yichePlatform.setClueRatio("100%");
                    yichePlatform.setUserRatio("100%");
                    yichePlatform.setLeadsCostRatio("100%");
                    yichePlatform.setNewUserCntRatio("100%");
                    yichePlatform.setConsumeRatio("100%");
                }

            }

        }
        return channelDataDayPre;
    }

    public static List<YichePlatform> addCalculateRatioPcwap(List<YichePlatform> channelDataDayPre, List<YichePlatform> channelDataDayPre2) {
        for (int i = 0; i <= channelDataDayPre.size() - 1; i++) {
            YichePlatform yichePlatform = channelDataDayPre.get(i);
            for (int j = 0; j <= channelDataDayPre2.size() - 1; j++) {
                YichePlatform yichePlatform1 = channelDataDayPre2.get(j);
                if (yichePlatform.getChannelName().equals(yichePlatform1.getChannelName())) {
                    yichePlatform.setClueRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsCnt(), yichePlatform1.getLeadsCnt()));
                    yichePlatform.setUserRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsUserCnt(), yichePlatform1.getLeadsUserCnt()));
                    yichePlatform.setLeadsCostRatio(CalculateRatioUtil.calculateRatio(yichePlatform.getLeadsCost(), yichePlatform1.getLeadsCost()));
                    yichePlatform.setConsumeRatio(CalculateRatioUtil.calculateRatioFloat(yichePlatform.getActualConsume(), yichePlatform1.getActualConsume()));
                    continue;
                }
                yichePlatform.setClueRatio("100%");
                yichePlatform.setUserRatio("100%");
                yichePlatform.setLeadsCostRatio("100%");
                yichePlatform.setConsumeRatio("100%");
            }
        }
        return channelDataDayPre;
    }

    public static Ratio calculateRatioSum(Ratio ratio, GatherYicheAPP yichePlatform, GatherYicheAPP yichePlatform2) {
        ratio.setClueRatio(calculateRatioLong(yichePlatform.getLeadsCnt(), yichePlatform2.getLeadsCnt()));
        ratio.setUserRatio(calculateRatioLong(yichePlatform.getLeadsUserCnt(), yichePlatform2.getLeadsUserCnt()));
        ratio.setConsumeRatio(calculateRatioFloat(yichePlatform.getActualConsume(), yichePlatform2.getActualConsume()));
        ratio.setLeadsCostRatio(calculateRatio(yichePlatform.getLeadsCost(), yichePlatform2.getLeadsCost()));
        return ratio;
    }

    public static String calculateRatio(Double data, Double data2) {
        if (data2 != null && data2 != 0) {
            double v = (data - data2) / data2;
            double v1 = DataCalculationUtils.doubleDeal(v);
            return v1 * 100 + "%";
        }
        return "100%";

    }

    public static String calculateRatioLong(Long data, Long data2) {
        if (data2 != null && data2 != 0) {
            double v = (data - data2) / data2;
            double v1 = DataCalculationUtils.doubleDeal(v);
            return v1 * 100 + "%";
        }
        return "100%";
    }

    public static String calculateRatioFloat(Float data, Float data2) {
        if (data2 != null && data2 != 0) {
            double v = (data - data2) / data2;
            double v1 = DataCalculationUtils.doubleDeal(v);
            return v1 * 100 + "%";
        }
        return "100%";
    }
}
