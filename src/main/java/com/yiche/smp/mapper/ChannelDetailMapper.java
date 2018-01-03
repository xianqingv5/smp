package com.yiche.smp.mapper;

import com.yiche.smp.domain.ChannelDetail;
import com.yiche.smp.domain.ChannelDetailExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ChannelDetailMapper {
    int countByExample(ChannelDetailExample example);

    int deleteByExample(ChannelDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChannelDetail record);

    int insertSelective(ChannelDetail record);

    List<ChannelDetail> selectByExample(ChannelDetailExample example);

    ChannelDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChannelDetail record, @Param("example") ChannelDetailExample example);

    int updateByExample(@Param("record") ChannelDetail record, @Param("example") ChannelDetailExample example);

    int updateByPrimaryKeySelective(ChannelDetail record);

    int updateByPrimaryKey(ChannelDetail record);

    List<ChannelDetail> selectChannelDetailByOrderChannelNameDesc(Map<String,Object> map);

    List<ChannelDetail> selectChannelDetailByOrderChannelNameAsc(Map<String,Object> map);
}