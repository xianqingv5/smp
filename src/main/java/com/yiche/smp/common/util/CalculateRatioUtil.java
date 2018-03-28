package com.yiche.smp.common.util;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Ratio;
import com.yiche.smp.common.StringUtil;
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
                    if (yichePlatform.getChannelId().equals(yichePlatform1.getChannelId())) {
                        yichePlatform.setClueRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsCnt(), yichePlatform1.getLeadsCnt()));
                        yichePlatform.setUserRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsUserCnt(), yichePlatform1.getLeadsUserCnt()));
                        yichePlatform.setLeadsCostRatio(CalculateRatioUtil.calculateRatio(yichePlatform.getLeadsCost(), yichePlatform1.getLeadsCost()));
                        yichePlatform.setNewUserCntRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getNewUserCnt(), yichePlatform1.getNewUserCnt()));
                        yichePlatform.setConsumeRatio(CalculateRatioUtil.calculateRatioFloat(yichePlatform.getActualConsume(), yichePlatform1.getActualConsume()));
                        break;
                    } else {
                        yichePlatform.setClueRatio("100%");
                        yichePlatform.setUserRatio("100%");
                        yichePlatform.setLeadsCostRatio("100%");
                        yichePlatform.setNewUserCntRatio("100%");
                        yichePlatform.setConsumeRatio("100%");
                    }
                }

            }

        }
        return channelDataDayPre;
    }

    public static List<YichePlatform> addCalculateRatioWeek(List<YichePlatform> channelDataDayPre, List<YichePlatform> channelDataDayPre2) {
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
                        break;
                    } else {
                        yichePlatform.setClueRatio("100%");
                        yichePlatform.setUserRatio("100%");
                        yichePlatform.setLeadsCostRatio("100%");
                        yichePlatform.setNewUserCntRatio("100%");
                        yichePlatform.setConsumeRatio("100%");
                    }
                }

            }

        }
        return channelDataDayPre;
    }

    public static List<YichePlatform> addCalculateRatioPcwap(List<YichePlatform> channelDataDayPre, List<YichePlatform> channelDataDayPre2) {
        for (int i = 0; i <= channelDataDayPre.size() - 1; i++) {
            YichePlatform yichePlatform = channelDataDayPre.get(i);
            if(channelDataDayPre2==null||channelDataDayPre2.size()==0){
                yichePlatform.setClueRatio("100%");
                yichePlatform.setUserRatio("100%");
                yichePlatform.setLeadsCostRatio("100%");
                yichePlatform.setConsumeRatio("100%");
            }
            for (int j = 0; j <= channelDataDayPre2.size() - 1; j++) {
                YichePlatform yichePlatform1 = channelDataDayPre2.get(j);
                if (yichePlatform.getChannelId().equals(yichePlatform1.getChannelId())) {
                    yichePlatform.setClueRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsCnt(), yichePlatform1.getLeadsCnt()));
                    yichePlatform.setUserRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsUserCnt(), yichePlatform1.getLeadsUserCnt()));
                    yichePlatform.setLeadsCostRatio(CalculateRatioUtil.calculateRatio(yichePlatform.getLeadsCost(), yichePlatform1.getLeadsCost()));
                    yichePlatform.setConsumeRatio(CalculateRatioUtil.calculateRatioFloat(yichePlatform.getActualConsume(), yichePlatform1.getActualConsume()));
                    break;
                } else {
                    yichePlatform.setClueRatio("100%");
                    yichePlatform.setUserRatio("100%");
                    yichePlatform.setLeadsCostRatio("100%");
                    yichePlatform.setConsumeRatio("100%");
                }
            }
        }
        return channelDataDayPre;
    }

    public static List<YichePlatform> addCalculateRatioPcwapWeek(List<YichePlatform> channelDataDayPre, List<YichePlatform> channelDataDayPre2) {
        for (int i = 0; i <= channelDataDayPre.size() - 1; i++) {
            YichePlatform yichePlatform = channelDataDayPre.get(i);
            if(channelDataDayPre2==null){
                yichePlatform.setClueRatio("100%");
                yichePlatform.setUserRatio("100%");
                yichePlatform.setLeadsCostRatio("100%");
                yichePlatform.setConsumeRatio("100%");
            }
            for (int j = 0; j <= channelDataDayPre2.size() - 1; j++) {
                YichePlatform yichePlatform1 = channelDataDayPre2.get(j);
                if (yichePlatform.getChannelName().equals(yichePlatform1.getChannelName())) {
                    yichePlatform.setClueRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsCnt(), yichePlatform1.getLeadsCnt()));
                    yichePlatform.setUserRatio(CalculateRatioUtil.calculateRatioLong(yichePlatform.getLeadsUserCnt(), yichePlatform1.getLeadsUserCnt()));
                    yichePlatform.setLeadsCostRatio(CalculateRatioUtil.calculateRatio(yichePlatform.getLeadsCost(), yichePlatform1.getLeadsCost()));
                    yichePlatform.setConsumeRatio(CalculateRatioUtil.calculateRatioFloat(yichePlatform.getActualConsume(), yichePlatform1.getActualConsume()));
                    break;
                } else {
                    yichePlatform.setClueRatio("100%");
                    yichePlatform.setUserRatio("100%");
                    yichePlatform.setLeadsCostRatio("100%");
                    yichePlatform.setConsumeRatio("100%");
                }

            }

        }
        return channelDataDayPre;
    }

    public static Ratio calculateRatioSum(Ratio ratio, GatherYicheAPP yichePlatform, GatherYicheAPP yichePlatform2) {
        if (yichePlatform != null) {
            if (yichePlatform2 != null) {
                Long leadsCnt = yichePlatform.getLeadsCnt();
                Long leadsCnt1 = yichePlatform2.getLeadsCnt();
                if (leadsCnt == null) {
                    leadsCnt = 0l;
                }
                if (leadsCnt1 == null) {
                    leadsCnt1 = 0l;
                }
                ratio.setClueRatio(calculateRatioLong(leadsCnt, leadsCnt1));
                Long leadsUserCnt = yichePlatform.getLeadsUserCnt();
                Long leadsUserCnt1 = yichePlatform2.getLeadsUserCnt();
                if (leadsUserCnt == null) {
                    leadsUserCnt = 0l;
                }
                if (leadsUserCnt1 == null) {
                    leadsUserCnt1 = 0l;
                }
                ratio.setUserRatio(calculateRatioLong(leadsUserCnt, leadsUserCnt1));
                Float actualConsume = yichePlatform.getActualConsume();
                Float actualConsume1 = yichePlatform2.getActualConsume();
                if (actualConsume == null) {
                    actualConsume = 0.0f;
                }
                if (actualConsume1 == null) {
                    actualConsume1 = 0.0f;
                }
                ratio.setConsumeRatio(calculateRatioFloat(actualConsume, actualConsume1));
                Double leadsCost = yichePlatform.getLeadsCost();
                Double leadsCost1 = yichePlatform2.getLeadsCost();
                if (leadsCost == null) {
                    leadsCost = 0.0;
                }
                if (leadsCost1 == null) {
                    leadsCost1 = 0.0;
                }
                ratio.setLeadsCostRatio(calculateRatio(leadsCost, leadsCost1));
                return ratio;
            }
            ratio.setClueRatio("100%");
            ratio.setUserRatio("100%");
            ratio.setConsumeRatio("100%");
            ratio.setLeadsCostRatio("100%");
            return ratio;
        } else {
            if (yichePlatform2 != null) {
                ratio.setClueRatio("-100%");
                ratio.setUserRatio("-100%");
                ratio.setConsumeRatio("-100%");
                ratio.setLeadsCostRatio("-100%");
                return ratio;
            }
            ratio.setClueRatio("0.0%");
            ratio.setUserRatio("0.0%");
            ratio.setConsumeRatio("0.0%");
            ratio.setLeadsCostRatio("0.0%");
            return ratio;
        }
    }

    public static String calculateRatio(Double data, Double data2) {
        if (data==0.0 && data2==0.0) {
            return "0.0%";
        }
        if (data2 != null && data2 != 0) {
            double v = (data - data2) / data2;
            String s = StringUtil.handleData(v);
            return s;
        }
        return "100%";

    }

    public static String calculateRatioLong(Long data, Long data2) {
        if (data==0l && data2==0l) {
            return "0.0%";
        }
        if (data2 != null && data2 != 0) {
            double v = ((double) (data - data2)) / data2;
            String s = StringUtil.handleData(v);
            return s;
        }
        return "100%";
    }

    public static String calculateRatioFloat(Float data, Float data2) {
        if (data==0.0f && data2==0.0f) {
            return "0.0%";
        }
        if (data2 != null && data2 != 0) {
            double v = ((double) (data - data2)) / data2;
            String s = StringUtil.handleData(v);
            return s;
        }
        return "100%";
    }
}
