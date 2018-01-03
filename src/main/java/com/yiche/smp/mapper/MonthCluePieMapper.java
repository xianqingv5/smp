package com.yiche.smp.mapper;

import com.yiche.smp.domain.MonthCluePie;
import com.yiche.smp.domain.MonthCluePieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthCluePieMapper {
    int countByExample(MonthCluePieExample example);

    int deleteByExample(MonthCluePieExample example);

    int deleteByPrimaryKey(Integer cluePieId);

    int insert(MonthCluePie record);

    int insertSelective(MonthCluePie record);

    List<MonthCluePie> selectByExample(MonthCluePieExample example);

    MonthCluePie selectByPrimaryKey(Integer cluePieId);

    int updateByExampleSelective(@Param("record") MonthCluePie record, @Param("example") MonthCluePieExample example);

    int updateByExample(@Param("record") MonthCluePie record, @Param("example") MonthCluePieExample example);

    int updateByPrimaryKeySelective(MonthCluePie record);

    int updateByPrimaryKey(MonthCluePie record);
}