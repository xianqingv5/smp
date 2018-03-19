package com.yiche.smp.mapper;

import com.yiche.smp.domain.YichePcwapAppLeadsChannelDay;
import com.yiche.smp.domain.YichePcwapAppLeadsChannelDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YichePcwapAppLeadsChannelDayMapper {
    int countByExample(YichePcwapAppLeadsChannelDayExample example);

    int deleteByExample(YichePcwapAppLeadsChannelDayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YichePcwapAppLeadsChannelDay record);

    int insertSelective(YichePcwapAppLeadsChannelDay record);

    List<YichePcwapAppLeadsChannelDay> selectByExample(YichePcwapAppLeadsChannelDayExample example);

    YichePcwapAppLeadsChannelDay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YichePcwapAppLeadsChannelDay record, @Param("example") YichePcwapAppLeadsChannelDayExample example);

    int updateByExample(@Param("record") YichePcwapAppLeadsChannelDay record, @Param("example") YichePcwapAppLeadsChannelDayExample example);

    int updateByPrimaryKeySelective(YichePcwapAppLeadsChannelDay record);

    int updateByPrimaryKey(YichePcwapAppLeadsChannelDay record);

	int updateByNameDate(YichePcwapAppLeadsChannelDay ycwapp);
}