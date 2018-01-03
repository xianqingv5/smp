package com.yiche.smp.mapper;

import com.yiche.smp.domain.ChannelQuality;
import com.yiche.smp.domain.ChannelQualityExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ChannelQualityMapper {
    int countByExample(ChannelQualityExample example);

    int deleteByExample(ChannelQualityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChannelQuality record);

    int insertSelective(ChannelQuality record);

    List<ChannelQuality> selectByExample(ChannelQualityExample example);

    ChannelQuality selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChannelQuality record, @Param("example") ChannelQualityExample example);

    int updateByExample(@Param("record") ChannelQuality record, @Param("example") ChannelQualityExample example);

    int updateByPrimaryKeySelective(ChannelQuality record);

    int updateByPrimaryKey(ChannelQuality record);
    List<ChannelQuality> selectByScoreAfterData(Map<String,Object> map);
    List<ChannelQuality> selectByScoreWaveDownData(Map<String,Object> map);
    List<ChannelQuality> selectByScoreFontData(Map<String,Object> map);
    List<ChannelQuality> selectByScoreWaveUpDate(Map<String,Object> map);
    List<ChannelQuality> selectTotalScoreRank(Map<String,Object> map);
}