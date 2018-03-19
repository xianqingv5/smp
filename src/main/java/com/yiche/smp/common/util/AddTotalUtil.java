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
            clueCnt+=yichePlatform1.getLeadsCnt();
            clueUserCnt+=yichePlatform1.getLeadsUserCnt();
            leadsCost+=yichePlatform1.getLeadsCost();
            newUserCnt+=yichePlatform1.getNewUserCnt();
            newUserCost+=yichePlatform1.getNewUserCost();
            consume+=200f;
        }
        if("0".equals(flag)){
            yichePlatform.setChannelName("安卓合计");
        }else {
            yichePlatform.setChannelName("IOS合计");
        }
        yichePlatform.setLeadsCnt(clueCnt);
        yichePlatform.setLeadsUserCnt(clueUserCnt);
        yichePlatform.setLeadsCost(leadsCost);
        yichePlatform.setNewUserCnt(newUserCnt);
        yichePlatform.setNewUserCost(newUserCost);
        yichePlatform.setActualConsume(consume);
        lists.add(yichePlatform);
    }
}
