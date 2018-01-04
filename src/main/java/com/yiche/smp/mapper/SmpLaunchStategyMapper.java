package com.yiche.smp.mapper;

import com.yiche.smp.domain.SmpLaunchStategy;
import com.yiche.smp.domain.SmpLaunchStategyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmpLaunchStategyMapper {
    /**
     * 根据年份和季度查询对应的数据
     * @param smpLaunchStategy
     * @return
     */
    List<SmpLaunchStategy> selectByYearAndQuarter(SmpLaunchStategy smpLaunchStategy);
    int countByExample(SmpLaunchStategyExample example);

    int deleteByExample(SmpLaunchStategyExample example);

    int deleteByPrimaryKey(Integer launchStategyId);

    int insert(SmpLaunchStategy record);

    int insertSelective(SmpLaunchStategy record);

    List<SmpLaunchStategy> selectByExample(SmpLaunchStategyExample example);

    SmpLaunchStategy selectByPrimaryKey(Integer launchStategyId);

    int updateByExampleSelective(@Param("record") SmpLaunchStategy record, @Param("example") SmpLaunchStategyExample example);

    int updateByExample(@Param("record") SmpLaunchStategy record, @Param("example") SmpLaunchStategyExample example);

    int updateByPrimaryKeySelective(SmpLaunchStategy record);

    int updateByPrimaryKey(SmpLaunchStategy record);
}