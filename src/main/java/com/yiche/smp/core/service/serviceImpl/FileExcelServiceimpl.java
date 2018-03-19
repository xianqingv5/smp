package com.yiche.smp.core.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiche.smp.core.service.FileExcleService;
import com.yiche.smp.domain.FileExcel;
import com.yiche.smp.domain.FileExcelExample;
import com.yiche.smp.domain.FileExcelExample.Criteria;
import com.yiche.smp.mapper.FileExcelMapper;
@Service
public class FileExcelServiceimpl implements FileExcleService {
@Autowired
private FileExcelMapper fileExcelMapper;
	@Override
	public List<FileExcel> selectFileExcleList() {
		FileExcelExample example = new FileExcelExample();
		example.createCriteria();
		List<FileExcel> list = fileExcelMapper.selectByExample(example);
		return list;
	}

}
