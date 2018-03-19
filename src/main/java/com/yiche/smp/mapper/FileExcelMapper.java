package com.yiche.smp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yiche.smp.domain.FileExcel;
import com.yiche.smp.domain.FileExcelExample;

public interface FileExcelMapper {
    int countByExample(FileExcelExample example);

    int deleteByExample(FileExcelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileExcel record);

    int insertSelective(FileExcel record);

    List<FileExcel> selectByExample(FileExcelExample example);

    FileExcel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileExcel record, @Param("example") FileExcelExample example);

    int updateByExample(@Param("record") FileExcel record, @Param("example") FileExcelExample example);

    int updateByPrimaryKeySelective(FileExcel record);

    int updateByPrimaryKey(FileExcel record);
}