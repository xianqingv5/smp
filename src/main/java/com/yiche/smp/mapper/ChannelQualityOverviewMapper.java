package com.yiche.smp.mapper;

import com.yiche.smp.domain.ChannelQualityOverview;
import com.yiche.smp.domain.ChannelQualityOverviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelQualityOverviewMapper {
    int countByExample(ChannelQualityOverviewExample example);

    int deleteByExample(ChannelQualityOverviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChannelQualityOverview record);

    int insertSelective(ChannelQualityOverview record);

    List<ChannelQualityOverview> selectByExample(ChannelQualityOverviewExample example);

    ChannelQualityOverview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChannelQualityOverview record, @Param("example") ChannelQualityOverviewExample example);

    int updateByExample(@Param("record") ChannelQualityOverview record, @Param("example") ChannelQualityOverviewExample example);

    int updateByPrimaryKeySelective(ChannelQualityOverview record);

    int updateByPrimaryKey(ChannelQualityOverview record);
}