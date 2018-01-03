package com.yiche.smp.mapper;

import com.yiche.smp.domain.KeyTargetCompare;
import com.yiche.smp.domain.KeyTargetCompareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyTargetCompareMapper {
    //批量添加
    int insertList(@Param("KeyTargetCompareList")List<KeyTargetCompare> KeyTargetCompareList);
    int countByExample(KeyTargetCompareExample example);

    int deleteByExample(KeyTargetCompareExample example);

    int deleteByPrimaryKey(Integer keyIndexId);

    int insert(KeyTargetCompare record);

    int insertSelective(KeyTargetCompare record);

    List<KeyTargetCompare> selectByExample(KeyTargetCompareExample example);

    KeyTargetCompare selectByPrimaryKey(Integer keyIndexId);

    int updateByExampleSelective(@Param("record") KeyTargetCompare record, @Param("example") KeyTargetCompareExample example);

    int updateByExample(@Param("record") KeyTargetCompare record, @Param("example") KeyTargetCompareExample example);

    int updateByPrimaryKeySelective(KeyTargetCompare record);

    int updateByPrimaryKey(KeyTargetCompare record);
}