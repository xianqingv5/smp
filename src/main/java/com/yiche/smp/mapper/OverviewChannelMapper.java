package com.yiche.smp.mapper;

import com.yiche.smp.domain.OverviewChannel;
import com.yiche.smp.domain.OverviewChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OverviewChannelMapper {
    int countByExample(OverviewChannelExample example);

    int deleteByExample(OverviewChannelExample example);

    int deleteByPrimaryKey(Integer overviewId);

    int insert(OverviewChannel record);

    int insertSelective(OverviewChannel record);

    List<OverviewChannel> selectByExample(OverviewChannelExample example);

    OverviewChannel selectByPrimaryKey(Integer overviewId);

    int updateByExampleSelective(@Param("record") OverviewChannel record, @Param("example") OverviewChannelExample example);

    int updateByExample(@Param("record") OverviewChannel record, @Param("example") OverviewChannelExample example);

    int updateByPrimaryKeySelective(OverviewChannel record);

    int updateByPrimaryKey(OverviewChannel record);
}