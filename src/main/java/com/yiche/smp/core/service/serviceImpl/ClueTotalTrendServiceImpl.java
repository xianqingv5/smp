package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.cluecost.CluePlantDataParam;
import com.yiche.smp.core.service.ClueTotalTrendService;
import com.yiche.smp.domain.*;
import com.yiche.smp.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ClueTotalTrendServiceImpl implements ClueTotalTrendService {
    @Autowired
    private ClueServiceConsumeMapper clueServiceConsumeMapper;
    @Autowired
    private ClueCostMapper clueCostMapper;
    @Autowired
    private ClueNumberMapper clueNumberMapper;

    public Map<String, Object> selectAllClueNumberAndClueSerConsume() {
        Map<String, Object> map = new HashMap<>();
        //查询每月的总线索量
        List<ClueNumber> clueNumbers = clueNumberMapper.selectTotalClueNumList();
        //查询每月总消费
        List<ClueServiceConsume> clueServiceConsumes = clueServiceConsumeMapper.selectTotalCostList();
        map.put("clueNumber", clueNumbers);
        map.put("clueSerConsume", clueServiceConsumes);
        return map;
    }

    @Override
    public List<ClueCost> selectAllClueCost() {
        //查询总体线索单价
        return clueCostMapper.selectTotalClueCostList();
    }

    @Override
    public Map<String, Object> selectAllCluePlantData(CluePlantDataParam cluePlantDataParam) {
        String monthData = cluePlantDataParam.getMonthData();
        String[] split = monthData.split("-");
        String year = split[0].substring(2);
        if (split[1].length() == 1) {
            cluePlantDataParam.setMonthData(year + "-0" + split[1]);
        } else {
            cluePlantDataParam.setMonthData(year + "-" + split[1]);
        }
        Map<String, Object> map = new HashMap<>();
        List<ClueServiceConsume> clueServiceConsumes = clueServiceConsumeMapper.selectByPlantAndCountTime(cluePlantDataParam.getPlatName(), cluePlantDataParam.getMonthData());
        List<ClueNumber> clueNumbers = clueNumberMapper.selectByPlantAndCountTime(cluePlantDataParam.getPlatName(), cluePlantDataParam.getMonthData());
        List<ClueCost> clueCosts = clueCostMapper.selectByPlantAndCountTime(cluePlantDataParam.getPlatName(), cluePlantDataParam.getMonthData());
        map.put("clueSerConsume", clueServiceConsumes);
        map.put("clueNumber", clueNumbers);
        map.put("clueCost", clueCosts);
        return map;
    }

}
