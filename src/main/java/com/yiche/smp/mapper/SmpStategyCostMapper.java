package com.yiche.smp.mapper;

import com.yiche.smp.domain.SmpStategyCost;
import com.yiche.smp.domain.SmpStategyCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmpStategyCostMapper {
    int countByExample(SmpStategyCostExample example);

    int deleteByExample(SmpStategyCostExample example);

    int deleteByPrimaryKey(Integer stategyCostId);

    int insert(SmpStategyCost record);

    int insertSelective(SmpStategyCost record);

    List<SmpStategyCost> selectByExample(SmpStategyCostExample example);

    SmpStategyCost selectByPrimaryKey(Integer stategyCostId);

    int updateByExampleSelective(@Param("record") SmpStategyCost record, @Param("example") SmpStategyCostExample example);

    int updateByExample(@Param("record") SmpStategyCost record, @Param("example") SmpStategyCostExample example);

    int updateByPrimaryKeySelective(SmpStategyCost record);

    int updateByPrimaryKey(SmpStategyCost record);
}