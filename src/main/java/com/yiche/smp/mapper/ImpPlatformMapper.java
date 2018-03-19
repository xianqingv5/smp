package com.yiche.smp.mapper;

import com.yiche.smp.domain.ImpPlatform;
import com.yiche.smp.domain.ImpPlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImpPlatformMapper {
    int countByExample(ImpPlatformExample example);

    int deleteByExample(ImpPlatformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImpPlatform record);

    int insertSelective(ImpPlatform record);

    List<ImpPlatform> selectByExample(ImpPlatformExample example);

    ImpPlatform selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImpPlatform record, @Param("example") ImpPlatformExample example);

    int updateByExample(@Param("record") ImpPlatform record, @Param("example") ImpPlatformExample example);

    int updateByPrimaryKeySelective(ImpPlatform record);

    int updateByPrimaryKey(ImpPlatform record);
}