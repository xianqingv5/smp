package com.yiche.smp.common.util;

import com.yiche.smp.common.YichePlatform;

import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/16
 */
public class AddTotalUtil {

    public static void addTotal(List<YichePlatform> lists, String flag){
        YichePlatform yichePlatform = new YichePlatform();
        long clueCnt=0;
        long clueUserCnt=0;
        double leadsCost=0;
        long newUserCnt=0;
        double newUserCost=0;
        float consume=0f;
        for (int i=0;i<=lists.size()-1;i++){
            YichePlatform yichePlatform1 = lists.get(i);
            if (yichePlatform1.getLeadsCnt()==null){
                clueCnt+=0;
            }else{
                clueCnt+=yichePlatform1.getLeadsCnt();
            }
            if (yichePlatform1.getLeadsUserCnt()==null){
                clueUserCnt+=0;
            }else {
                clueUserCnt+=yichePlatform1.getLeadsUserCnt();
            }
            if (yichePlatform1.getActualConsume()==null){
                consume+=0f;
            }else {
                consume+=yichePlatform1.getActualConsume();
            }
            if (yichePlatform1.getLeadsCost()==null){
                leadsCost+=0;
            }else {
                leadsCost+=yichePlatform1.getLeadsCost();
            }
            if (yichePlatform1.getNewUserCnt()==null){
                newUserCnt+=0;
            }else {
                newUserCnt+=yichePlatform1.getNewUserCnt();
            }
            if (yichePlatform1.getNewUserCost()==null){
                newUserCost+=0;
            }else {
                newUserCost+=yichePlatform1.getNewUserCost();
            }

        }
        if("0".equals(flag)){
            yichePlatform.setChannelName("安卓合计");
            yichePlatform.setChannelId("android");
        }else {
            yichePlatform.setChannelName("IOS合计");
            yichePlatform.setChannelId("ios");
        }
        yichePlatform.setLeadsCnt(clueCnt);
        yichePlatform.setLeadsUserCnt(clueUserCnt);
        yichePlatform.setLeadsCost(leadsCost);
        yichePlatform.setNewUserCnt(newUserCnt);
        yichePlatform.setNewUserCost(newUserCost);
        yichePlatform.setActualConsume(consume);
        yichePlatform.setQfLeadsCnt(DataCalculationUtils.fmtMicrometer(clueCnt));
        yichePlatform.setQfLeadsUserCnt(DataCalculationUtils.fmtMicrometer(clueUserCnt));
        yichePlatform.setQfLeadsCost(DataCalculationUtils.fmtMicrometer2(DataCalculationUtils.doubleDeal2(leadsCost)));
        yichePlatform.setQfNewUserCnt(DataCalculationUtils.fmtMicrometer(newUserCnt));
        yichePlatform.setQfNewUserCost(DataCalculationUtils.fmtMicrometer2(DataCalculationUtils.doubleDeal2(newUserCost)));
        yichePlatform.setQfActualConsume(DataCalculationUtils.fmtMicrometer1(DataCalculationUtils.floatDeal(consume)));
        lists.add(yichePlatform);
    }
}
