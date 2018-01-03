package com.yiche.smp.core.service;


import com.yiche.smp.common.cluecost.CluePlantDataParam;
import com.yiche.smp.domain.ClueCost;

import java.util.List;
import java.util.Map;

public interface ClueTotalTrendService {

    //查询整体合计线索量与总消费
    Map <String, Object> selectAllClueNumberAndClueSerConsume();

    //查询整体成本
    List <ClueCost> selectAllClueCost();

    //查询平台模块整体数据
    Map <String, Object> selectAllCluePlantData(CluePlantDataParam cluePlantDataParam);
}
