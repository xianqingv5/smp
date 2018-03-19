package com.yiche.smp.mapper;

import com.yiche.smp.domain.ImpHoliday;
import com.yiche.smp.domain.ImpHolidayExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImpHolidayMapper {
    int countByExample(ImpHolidayExample example);

    int deleteByExample(ImpHolidayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImpHoliday record);

    int insertSelective(ImpHoliday record);

    List<ImpHoliday> selectByExample(ImpHolidayExample example);

    ImpHoliday selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImpHoliday record, @Param("example") ImpHolidayExample example);

    int updateByExample(@Param("record") ImpHoliday record, @Param("example") ImpHolidayExample example);

    int updateByPrimaryKeySelective(ImpHoliday record);

    int updateByPrimaryKey(ImpHoliday record);

	ImpHoliday selectByDate(Date dateto);

	Byte selectByNow(Date date);
}