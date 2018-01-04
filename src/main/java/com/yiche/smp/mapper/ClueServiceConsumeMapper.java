package com.yiche.smp.mapper;

import com.yiche.smp.domain.ClueServiceConsume;
import com.yiche.smp.domain.ClueServiceConsumeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueServiceConsumeMapper {
    int insertClueSerList(@Param("clueServiceConsumes")List<ClueServiceConsume> clueServiceConsumes);
    //查询总体比消费的所有数据
    List<ClueServiceConsume> selectTotalCostList();
    //查询具体某个平台和某统计月份之前的所有数据
    List<ClueServiceConsume> selectByPlantAndCountTime(@Param("plantName") String plantName, @Param("countTime")String countTime);
    int countByExample(ClueServiceConsumeExample example);

    int deleteByExample(ClueServiceConsumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueServiceConsume record);

    int insertSelective(ClueServiceConsume record);

    List<ClueServiceConsume> selectByExample(ClueServiceConsumeExample example);

    ClueServiceConsume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueServiceConsume record, @Param("example") ClueServiceConsumeExample example);

    int updateByExample(@Param("record") ClueServiceConsume record, @Param("example") ClueServiceConsumeExample example);

    int updateByPrimaryKeySelective(ClueServiceConsume record);

    int updateByPrimaryKey(ClueServiceConsume record);
}