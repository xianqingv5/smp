package com.yiche.smp.mapper;

import com.yiche.smp.domain.ImpChannelConsumeData;
import com.yiche.smp.domain.ImpChannelConsumeDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImpChannelConsumeDataMapper {
    int countByExample(ImpChannelConsumeDataExample example);

    int deleteByExample(ImpChannelConsumeDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImpChannelConsumeData record);

    int insertSelective(ImpChannelConsumeData record);

    List<ImpChannelConsumeData> selectByExample(ImpChannelConsumeDataExample example);

    ImpChannelConsumeData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImpChannelConsumeData record, @Param("example") ImpChannelConsumeDataExample example);

    int updateByExample(@Param("record") ImpChannelConsumeData record, @Param("example") ImpChannelConsumeDataExample example);

    int updateByPrimaryKeySelective(ImpChannelConsumeData record);

    int updateByPrimaryKey(ImpChannelConsumeData record);
}