package com.yiche.smp.common.util;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.Portion;

/**
 *
 * 计算份额的工具类
 * Created by xuhaiqiang on 2018/3/13
 */
public class CalculatePortionUtil {

    public static Portion calculatePortionSum(Portion portion, GatherYicheAPP gatherYicheAPP, GatherYicheAPP gatherYicheAPP2){
        portion.setCluePortion(calculatePortionLong(gatherYicheAPP.getLeadsCnt(),gatherYicheAPP2.getLeadsCnt()));
        portion.setUserPortion(calculatePortionLong(gatherYicheAPP.getLeadsUserCnt(),gatherYicheAPP2.getLeadsUserCnt()));
        portion.setConsumePortion(calculatePortionFloat(gatherYicheAPP.getActualConsume(),gatherYicheAPP2.getActualConsume()));
        portion.setLeadsCostPortion(calculatePortion(gatherYicheAPP.getLeadsCost(),gatherYicheAPP2.getLeadsCost()));
        return portion;
    }

    public static String  calculatePortion(Double data,Double data2){
        if (data2!=null&&data2!=0){
            double v = data / data2;
            double v1 = DataCalculationUtils.doubleDeal(v);
            return v1*100+"%";
        }
        return "100%";

    }

    public static String calculatePortionLong(Long data,Long data2){
        if (data2!=null&&data2!=0){
            double v = data / data2;
            double v1 = DataCalculationUtils.doubleDeal(v);
            return v1*100+"%";
        }
        return "100%";
    }

    public static String calculatePortionFloat(Float data,Float data2){
        if (data2!=null&&data2!=0){
            double v = data / data2;
            double v1 = DataCalculationUtils.doubleDeal(v);
            return v1*100+"%";
        }
        return "100%";
    }
}
