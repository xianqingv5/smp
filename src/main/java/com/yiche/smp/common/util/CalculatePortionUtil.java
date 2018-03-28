package com.yiche.smp.common.util;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Portion;
import com.yiche.smp.common.StringUtil;

/**
 * 计算份额的工具类
 * Created by xuhaiqiang on 2018/3/13
 */
public class CalculatePortionUtil {

    public static Portion calculatePortionSum(Portion portion, GatherYicheAPP gatherYicheAPP, GatherYicheAPP gatherYicheAPP2) {
        if (gatherYicheAPP != null) {
            if (gatherYicheAPP2 != null) {
                Long leadsCnt = gatherYicheAPP.getLeadsCnt();
                Long leadsCnt1 = gatherYicheAPP2.getLeadsCnt();
                if (leadsCnt == null) {
                    leadsCnt = 0l;
                }
                if (leadsCnt1 == null) {
                    leadsCnt1 = 0l;
                }
                portion.setCluePortion(calculatePortionLong(leadsCnt, leadsCnt1));
                Long leadsUserCnt = gatherYicheAPP.getLeadsUserCnt();
                Long leadsUserCnt1 = gatherYicheAPP2.getLeadsUserCnt();
                if (leadsUserCnt == null) {
                    leadsUserCnt = 0l;
                }
                if (leadsUserCnt1 == null) {
                    leadsUserCnt1 = 0l;
                }
                portion.setUserPortion(calculatePortionLong(leadsUserCnt, leadsUserCnt1));
                Float actualConsume = gatherYicheAPP.getActualConsume();
                Float actualConsume1 = gatherYicheAPP2.getActualConsume();
                if (actualConsume == null) {
                    actualConsume = 0.0f;
                }
                if (actualConsume1 == null) {
                    actualConsume1 = 0.0f;
                }
                portion.setConsumePortion(calculatePortionFloat(actualConsume, actualConsume1));
                Double leadsCost = gatherYicheAPP.getLeadsCost();
                Double leadsCost1 = gatherYicheAPP2.getLeadsCost();
                if (leadsCost == null) {
                    leadsCost = 0d;
                }
                if (leadsCost1 == null) {
                    leadsCost1 = 0d;
                }
                portion.setLeadsCostPortion(calculatePortion(leadsCost, leadsCost1));
                return portion;
            }
            portion.setCluePortion("0.0%");
            portion.setLeadsCostPortion("0.0%");
            portion.setUserPortion("0.0%");
            portion.setConsumePortion("0.0%");
            return portion;
        }
        portion.setCluePortion("0.0%");
        portion.setLeadsCostPortion("0.0%");
        portion.setUserPortion("0.0%");
        portion.setConsumePortion("0.0%");
        return portion;
    }

    private static String calculatePortion(Double data, Double data2) {
        if (data==0.0&&data2==0.0){
            return "0.0%";
        }
        if (data2 != null && data2 != 0) {
            double v = data / data2;
            String s = StringUtil.handleData(v);
            return s;
        }
        return "100%";

    }

    private static String calculatePortionLong(Long data, Long data2) {
        if (data==0l&&data2==0l){
            return "0.0%";
        }
        if (data2 != null && data2 != 0) {
            double v = ((double) data) / data2;
            String s = StringUtil.handleData(v);
            return s;
        }
        return "100%";
    }

    private static String calculatePortionFloat(Float data, Float data2) {
        if (data==0.0f&&data2==0.0f){
            return "0.0%";
        }
        if (data2 != null && data2 != 0) {
            double v = ((double) data) / data2;
            String s = StringUtil.handleData(v);
            return s;
        }
        return "100%";
    }
}
