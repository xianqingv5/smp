package com.yiche.smp.mapper;

import com.yiche.smp.domain.ShopAvgClues;
import com.yiche.smp.domain.ShopAvgCluesExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ShopAvgCluesMapper {
    int countByExample(ShopAvgCluesExample example);

    int deleteByExample(ShopAvgCluesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopAvgClues record);

    int insertSelective(ShopAvgClues record);

    List <ShopAvgClues> selectByExample(ShopAvgCluesExample example);

    ShopAvgClues selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopAvgClues record, @Param("example") ShopAvgCluesExample example);

    int updateByExample(@Param("record") ShopAvgClues record, @Param("example") ShopAvgCluesExample example);

    int updateByPrimaryKeySelective(ShopAvgClues record);

    int updateByPrimaryKey(ShopAvgClues record);
    //预警品牌查询
    List <ShopAvgClues> findBrandNameByMonth(String monthData);
    //预警列表查询
    List <ShopAvgClues> earlyWarningList(Map map);
}