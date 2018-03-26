package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.CollectionUtil;
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
    public Map<String, Object> getEarlyWarningData(String platformName, String startTime, String endTime,String month) {
        List<EarlyWarningData> earlyWarningDataList = new ArrayList<>();
        List<Long> cluearr = new ArrayList<>();//用于封装数据，将clue封装成一个集合
        List<Float> comsumearr= new ArrayList<>();//用于封装数据，将消耗封装成一个集合
        List<Float> budgetarr= new ArrayList<>();//用于封装数据，将预算封装成一个集合
        List<String> datearr = new ArrayList<>();//用于封装数据，将日期封装成一个集合
        Map<String, String> map = new HashMap<>();
        Map<String, Object> map1 = new HashMap<>();
        map.put("platformName",platformName);
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        map.put("month",month);
        List<EarlyWarningData> earlyWarningDatas = consumeDayEarlyWarningMapper.selectEarlyWarning(map);
        if (CollectionUtil.listNotNull(earlyWarningDatas)){
            Double baseNumber = earlyWarningDatas.get(0).getBaseNumber();//基数
            Float dayBudget = earlyWarningDatas.get(0).getDayBudget();//日均预算
            Long monthDayAvgclueCnt = earlyWarningDatas.get(0).getMonthDayAvgclueCnt();//去年当月日均线索量
            float expectPrice1=dayBudget/monthDayAvgclueCnt;//预期希望单价
            double expectPrice= DataCalculationUtils.floatDeal(expectPrice1);
            for (EarlyWarningData earlyWarningData:earlyWarningDatas){
                double actualPrice=0;
                earlyWarningData.setActualConsume(20000f);
                Float actualConsume = earlyWarningData.getActualConsume();
                Long leadsCnt = earlyWarningData.getLeadsCnt();
                if (leadsCnt!=0&&leadsCnt!=null){
                    actualPrice=DataCalculationUtils.floatDeal(actualConsume/leadsCnt);
                }
                String warningMsg = getEarlyWarningMsg(leadsCnt, monthDayAvgclueCnt, actualConsume, dayBudget, actualPrice, expectPrice, baseNumber);
                if (warningMsg!=null){
                    earlyWarningData.setActualPrice(actualPrice);
                    earlyWarningData.setExpectPrice(expectPrice);
                    earlyWarningData.setEarlyWarningMsg(warningMsg);
                    earlyWarningDataList.add(earlyWarningData);
                }
            }
            for(EarlyWarningData earlyWarningData:earlyWarningDataList){
                datearr.add(earlyWarningData.getBt());
                cluearr.add(earlyWarningData.getLeadsCnt());
                comsumearr.add(earlyWarningData.getActualConsume());
                budgetarr.add(earlyWarningData.getDayBudget());
            }
            map1.put("data",earlyWarningDataList);
            map1.put("datearr",datearr);
            map1.put("cluearr",cluearr);
            map1.put("consumearr",comsumearr);
            map1.put("budgetarr",budgetarr);
        }
        return map1;
    }

    @Override
    public List<GatherYicheAPP> getChannelConsumeData(String platformName, String startTime, String endTime) {
        Map<String,Object> map = new HashMap<>();
        map.put("platformName",platformName);
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        List<GatherYicheAPP> channelDetailConsume = channelConsumeMapper.getChannelDetailConsume(map);
        for(GatherYicheAPP gatherYicheAPP:channelDetailConsume){
            if(gatherYicheAPP.getLeadsCnt()==null||gatherYicheAPP.getActualConsume()==null){
                gatherYicheAPP.setCluePrice(0.0);
            }else {
                gatherYicheAPP.setCluePrice((double) (gatherYicheAPP.getActualConsume()/gatherYicheAPP.getLeadsCnt()));
            }
            if (gatherYicheAPP.getActualConsume()==null||gatherYicheAPP.getLeadsUserCnt()==null){
                gatherYicheAPP.setUserPrice(0.0);
            }else {
                gatherYicheAPP.setUserPrice((double) (gatherYicheAPP.getActualConsume()/gatherYicheAPP.getLeadsUserCnt()));
            }
        }
        return channelDetailConsume;
    }

    @Override
    public Map<String, Object> getMonthChannelConsumeData(String platformName, String startTime, String endTime, String month,int num) {
        Map<String, String> map = new HashMap<>();
        Map<String, Object> map1 = new HashMap<>();
        List<Object> arr = new ArrayList<>();
        map.put("platformName",platformName);
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        map.put("month",month);
        EarlyWarningData earlyWarningData = consumeDayEarlyWarningMapper.selectMonthChannelConsumeData(map);
        earlyWarningData.setDayBudget(earlyWarningData.getDayBudget()*num);
        earlyWarningData.setMonthDayAvgclueCnt(earlyWarningData.getMonthDayAvgclueCnt()*num);
        arr.add(earlyWarningData.getDayBudget());
        arr.add(earlyWarningData.getActualConsume());
        arr.add(earlyWarningData.getLeadsCnt());
        arr.add(earlyWarningData.getMonthDayAvgclueCnt());
        map1.put("data",earlyWarningData);
        map1.put("arr",arr);
        return map1;
    }

    /**
     * 通过下面规则计算出预警数据和预警提示
     * @param leadsCnt
     * @param monthDayAvgclueCnt
     * @param actualConsume
     * @param dayBudget
     * @param actualPrice
     * @param expectPrice
     * @param baseNumber
     * @return
     */
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
