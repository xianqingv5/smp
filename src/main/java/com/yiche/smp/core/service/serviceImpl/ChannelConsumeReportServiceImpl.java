package com.yiche.smp.core.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.core.service.ChannelConsumeReportService;
import com.yiche.smp.mapper.ChannelConsumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/8
 */
@Service
public class ChannelConsumeReportServiceImpl implements ChannelConsumeReportService {

    @Autowired
    private ChannelConsumeMapper channelConsumeMapper;

    @Override
    public PageInfo<GatherYicheAPP> getChannelConsumeReport(String platformId, String channelName, String startTime, String endTime, int isDetail, Integer pageno, Integer pagesize) {
        Map<String, Object> map = new HashMap<>();
        PageInfo<GatherYicheAPP> gatherYicheAPPPageInfo;
        //如果是全部的话，将他赋值为空
        if ("5".equals(platformId)) {
            platformId = null;
        }
        //如果是全部的话，将他赋值为空
        if ("全部".equals(channelName)) {
            channelName = null;
        }
        //将所有参数放到map中。
        map.put("platformName", platformId);
        map.put("channelName", channelName);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        if (isDetail == 0) {//明细的情况
            PageHelper.startPage(pageno, pagesize);
            List<GatherYicheAPP> channelDetailConsume = channelConsumeMapper.getChannelDetailConsume(map);
            gatherYicheAPPPageInfo = new PageInfo<>(channelDetailConsume);
            List<GatherYicheAPP> list = gatherYicheAPPPageInfo.getList();
            addPrice(list);//用于封装单价
            gatherYicheAPPPageInfo.setList(list);
        } else {//汇总的情况
            PageHelper.startPage(pageno, pagesize);
            List<GatherYicheAPP> channelSumConsume = channelConsumeMapper.getChannelSumConsume(map);
            gatherYicheAPPPageInfo = new PageInfo<>(channelSumConsume);
            List<GatherYicheAPP> list = gatherYicheAPPPageInfo.getList();
            addPrice(list);//用于封装单价
            gatherYicheAPPPageInfo.setList(list);
        }
        return gatherYicheAPPPageInfo;
    }


    /**
     *
     * 将单价封装到对象里
     * @param list
     */
    public void addPrice(List<GatherYicheAPP> list){
        for (GatherYicheAPP gatherYicheAPP:list){
            if(gatherYicheAPP.getLeadsCnt()==null||gatherYicheAPP.getActualConsume()==null){
                gatherYicheAPP.setCluePrice(0.0);
            }else{
                gatherYicheAPP.setCluePrice((double) (gatherYicheAPP.getActualConsume()/gatherYicheAPP.getLeadsCnt()));
            }
            if(gatherYicheAPP.getLeadsUserCnt()==null||gatherYicheAPP.getActualConsume()==null){
                gatherYicheAPP.setUserPrice(0.0);
            }else{
                gatherYicheAPP.setUserPrice((double) (gatherYicheAPP.getActualConsume()/gatherYicheAPP.getLeadsUserCnt()));
            }
        }
    }
}
