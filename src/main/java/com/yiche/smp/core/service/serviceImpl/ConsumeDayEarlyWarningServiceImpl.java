package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.EarlyWarningData;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.util.DataCalculationUtils;
import com.yiche.smp.core.service.ConsumeDayEarlyWarningService;
import com.yiche.smp.mapper.ChannelConsumeMapper;
import com.yiche.smp.mapper.ConsumeDayEarlyWarningMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/15
 */
@Service
public class ConsumeDayEarlyWarningServiceImpl implements ConsumeDayEarlyWarningService {

    @Autowired
    private ConsumeDayEarlyWarningMapper consumeDayEarlyWarningMapper;

    @Autowired
    private ChannelConsumeMapper channelConsumeMapper;

    @Override
    public List<EarlyWarningData> getEarlyWarningData(String platformName, String startTime, String endTime,String month) {
        List<EarlyWarningData> earlyWarningDataList = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("platformName",platformName);
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        map.put("month",month);
        List<EarlyWarningData> earlyWarningDatas = consumeDayEarlyWarningMapper.selectEarlyWarning(map);
        if (earlyWarningDatas!=null){
            Double baseNumber = earlyWarningDatas.get(0).getBaseNumber();
            Float dayBudget = earlyWarningDatas.get(0).getDayBudget();
            Long monthDayAvgclueCnt = earlyWarningDatas.get(0).getMonthDayAvgclueCnt();
            double expectPrice= DataCalculationUtils.doubleDeal(monthDayAvgclueCnt/dayBudget);
            for (EarlyWarningData earlyWarningData:earlyWarningDatas){
                Float actualConsume = earlyWarningData.getActualConsume();
                actualConsume=20000f;
                Long leadsCnt = earlyWarningData.getLeadsCnt();
                double actualPrice=DataCalculationUtils.doubleDeal(leadsCnt/actualConsume);
                String warningMsg = getEarlyWarningMsg(leadsCnt, monthDayAvgclueCnt, actualConsume, dayBudget, actualPrice, expectPrice, baseNumber);
                if (warningMsg!=null){
                    earlyWarningData.setActualPrice(actualPrice);
                    earlyWarningData.setExpectPrice(expectPrice);
                    earlyWarningData.setEarlyWarningMsg(warningMsg);
                    earlyWarningDataList.add(earlyWarningData);
                }
            }
        }
        return earlyWarningDataList;
    }

    @Override
    public List<GatherYicheAPP> getChannelConsumeData(String platformName, String startTime, String endTime) {
        Map<String,Object> map = new HashMap<>();
        map.put("platformName",platformName);
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        List<GatherYicheAPP> channelDetailConsume = channelConsumeMapper.getChannelDetailConsume(map);
        return channelDetailConsume;
    }

    @Override
    public EarlyWarningData getMonthChannelConsumeData(String platformName, String startTime, String endTime, String month,int num) {
        Map<String, String> map = new HashMap<>();
        map.put("platformName",platformName);
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        map.put("month",month);
        EarlyWarningData earlyWarningData = consumeDayEarlyWarningMapper.selectMonthChannelConsumeData(map);
        earlyWarningData.setDayBudget(earlyWarningData.getDayBudget()*num);
        earlyWarningData.setMonthDayAvgclueCnt(earlyWarningData.getMonthDayAvgclueCnt()*num);
        return earlyWarningData;
    }

    public String getEarlyWarningMsg(Long leadsCnt,Long monthDayAvgclueCnt,Float actualConsume,Float dayBudget,Double actualPrice,Double expectPrice,Double baseNumber){

        if (actualConsume>dayBudget){
            if (leadsCnt>monthDayAvgclueCnt){
                if (actualPrice>expectPrice*baseNumber){
                    return "花超（实际线索单价成本>预期线索单价成本）";
                }
                else {
                    return null;
                }
            }else {
                if (actualPrice>expectPrice*baseNumber){
                    return "花超（当天线索量<去年当月日均线索量，且实际线索单价成本>预期线索单价成本）";
                }
                else {
                    return null;
                }
            }
        }else{
            if (leadsCnt>monthDayAvgclueCnt){
                if (actualPrice>expectPrice*baseNumber){
                    return null;
                }
                else {
                    return null;
                }
            }else {
                if (actualPrice>expectPrice*baseNumber){
                    return "未花超（线索量不达标，且实际线索单价成本>预期线索单价成本)";
                }
                else {
                    return "未花超（线索量不达标）";
                }
            }
        }
    }
}
