package com.yiche.smp.mapper;

import com.yiche.smp.domain.SellTrend;
import com.yiche.smp.domain.SellTrendExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SellTrendMapper {
    int countByExample(SellTrendExample example);

    int deleteByExample(SellTrendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SellTrend record);

    int insertSelective(SellTrend record);

    List<SellTrend> selectByExample(SellTrendExample example);

    SellTrend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SellTrend record, @Param("example") SellTrendExample example);

    int updateByExample(@Param("record") SellTrend record, @Param("example") SellTrendExample example);

    int updateByPrimaryKeySelective(SellTrend record);

    int updateByPrimaryKey(SellTrend record);

    SellTrend getSelltrendsByNameAndMonthData(Map<String, String> map);
}