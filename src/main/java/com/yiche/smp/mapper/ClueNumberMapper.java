package com.yiche.smp.mapper;

import com.yiche.smp.domain.ClueNumber;
import com.yiche.smp.domain.ClueNumberExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueNumberMapper {
    //查询合计线索量的所有数据
    List<ClueNumber> selectTotalClueNumList();
    //查询某平台和某统计时间之前的线索量
    List<ClueNumber> selectByPlantAndCountTime(@Param("plantName")String plantName, @Param("countTime")String countTime);
    //批量添加
    int insertClueNumberList(@Param("clueNumberList")List<ClueNumber> clueNumberList);

    int countByExample(ClueNumberExample example);

    int deleteByExample(ClueNumberExample example);

    int deleteByPrimaryKey(Integer numid);

    int insert(ClueNumber record);

    int insertSelective(ClueNumber record);

    List<ClueNumber> selectByExample(ClueNumberExample example);

    ClueNumber selectByPrimaryKey(Integer numid);

    int updateByExampleSelective(@Param("record") ClueNumber record, @Param("example") ClueNumberExample example);

    int updateByExample(@Param("record") ClueNumber record, @Param("example") ClueNumberExample example);

    int updateByPrimaryKeySelective(ClueNumber record);

    int updateByPrimaryKey(ClueNumber record);
}