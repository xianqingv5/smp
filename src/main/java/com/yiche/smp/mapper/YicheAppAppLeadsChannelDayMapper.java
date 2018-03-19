package com.yiche.smp.mapper;

import com.yiche.smp.domain.YicheAppAppLeadsChannelDay;
import com.yiche.smp.domain.YicheAppAppLeadsChannelDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YicheAppAppLeadsChannelDayMapper {
    int countByExample(YicheAppAppLeadsChannelDayExample example);

    int deleteByExample(YicheAppAppLeadsChannelDayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YicheAppAppLeadsChannelDay record);

    int insertSelective(YicheAppAppLeadsChannelDay record);

    List<YicheAppAppLeadsChannelDay> selectByExample(YicheAppAppLeadsChannelDayExample example);

    YicheAppAppLeadsChannelDay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YicheAppAppLeadsChannelDay record, @Param("example") YicheAppAppLeadsChannelDayExample example);

    int updateByExample(@Param("record") YicheAppAppLeadsChannelDay record, @Param("example") YicheAppAppLeadsChannelDayExample example);

    int updateByPrimaryKeySelective(YicheAppAppLeadsChannelDay record);

    int updateByPrimaryKey(YicheAppAppLeadsChannelDay record);

	int updateByNameDate(YicheAppAppLeadsChannelDay ycapp);
}