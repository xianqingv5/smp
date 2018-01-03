package com.yiche.smp.mapper;

import com.yiche.smp.domain.OverView;
import org.apache.ibatis.annotations.Param;

public interface OverViewMapper {
    //根据月份查询当月的线索v数据分析概览
    OverView selectOverViewByYearMonth(@Param("yearMonth")String yearMonth);

}
