package com.yiche.smp.mapper;

import com.yiche.smp.domain.YicheQuoteAppLeadsChannelDay;
import com.yiche.smp.domain.YicheQuoteAppLeadsChannelDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YicheQuoteAppLeadsChannelDayMapper {
    int countByExample(YicheQuoteAppLeadsChannelDayExample example);

    int deleteByExample(YicheQuoteAppLeadsChannelDayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YicheQuoteAppLeadsChannelDay record);

    int insertSelective(YicheQuoteAppLeadsChannelDay record);

    List<YicheQuoteAppLeadsChannelDay> selectByExample(YicheQuoteAppLeadsChannelDayExample example);

    YicheQuoteAppLeadsChannelDay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YicheQuoteAppLeadsChannelDay record, @Param("example") YicheQuoteAppLeadsChannelDayExample example);

    int updateByExample(@Param("record") YicheQuoteAppLeadsChannelDay record, @Param("example") YicheQuoteAppLeadsChannelDayExample example);

    int updateByPrimaryKeySelective(YicheQuoteAppLeadsChannelDay record);

    int updateByPrimaryKey(YicheQuoteAppLeadsChannelDay record);

	int updateByNameDate(YicheQuoteAppLeadsChannelDay ycqapp);
}