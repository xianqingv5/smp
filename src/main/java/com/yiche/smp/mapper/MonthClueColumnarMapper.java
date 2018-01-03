package com.yiche.smp.mapper;

import com.yiche.smp.domain.MonthClueColumnar;
import com.yiche.smp.domain.MonthClueColumnarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthClueColumnarMapper {
    int countByExample(MonthClueColumnarExample example);

    int deleteByExample(MonthClueColumnarExample example);

    int deleteByPrimaryKey(Integer clueColumnarId);

    int insert(MonthClueColumnar record);

    int insertSelective(MonthClueColumnar record);

    List<MonthClueColumnar> selectByExample(MonthClueColumnarExample example);

    MonthClueColumnar selectByPrimaryKey(Integer clueColumnarId);

    int updateByExampleSelective(@Param("record") MonthClueColumnar record, @Param("example") MonthClueColumnarExample example);

    int updateByExample(@Param("record") MonthClueColumnar record, @Param("example") MonthClueColumnarExample example);

    int updateByPrimaryKeySelective(MonthClueColumnar record);

    int updateByPrimaryKey(MonthClueColumnar record);
}