package com.yiche.smp.mapper;

import com.yiche.smp.domain.SmpStategyClue;
import com.yiche.smp.domain.SmpStategyClueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmpStategyClueMapper {
    int countByExample(SmpStategyClueExample example);

    int deleteByExample(SmpStategyClueExample example);

    int deleteByPrimaryKey(Integer stategyClueId);

    int insert(SmpStategyClue record);

    int insertSelective(SmpStategyClue record);

    List<SmpStategyClue> selectByExample(SmpStategyClueExample example);

    SmpStategyClue selectByPrimaryKey(Integer stategyClueId);

    int updateByExampleSelective(@Param("record") SmpStategyClue record, @Param("example") SmpStategyClueExample example);

    int updateByExample(@Param("record") SmpStategyClue record, @Param("example") SmpStategyClueExample example);

    int updateByPrimaryKeySelective(SmpStategyClue record);

    int updateByPrimaryKey(SmpStategyClue record);
}