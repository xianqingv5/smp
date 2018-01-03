package com.yiche.smp.mapper;

import com.yiche.smp.domain.ClueCost;
import com.yiche.smp.domain.ClueCostExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ClueCostMapper {
    //批量添加
    int insertClueCostList(@Param("clueCostList")List<ClueCost> clueCostList);
    //查询合计单价的所有数据
    List<ClueCost> selectTotalClueCostList();
    //查询某平台和某统计时间之前的所有单价
    List<ClueCost> selectByPlantAndCountTime(@Param("plantName")String plantName,@Param("countTime")String countTime);

    int countByExample(ClueCostExample example);

    int deleteByExample(ClueCostExample example);

    int deleteByPrimaryKey(Integer costid);

    int insert(ClueCost record);

    int insertSelective(ClueCost record);

    List<ClueCost> selectByExample(ClueCostExample example);

    ClueCost selectByPrimaryKey(Integer costid);

    int updateByExampleSelective(@Param("record") ClueCost record, @Param("example") ClueCostExample example);

    int updateByExample(@Param("record") ClueCost record, @Param("example") ClueCostExample example);

    int updateByPrimaryKeySelective(ClueCost record);

    int updateByPrimaryKey(ClueCost record);
}