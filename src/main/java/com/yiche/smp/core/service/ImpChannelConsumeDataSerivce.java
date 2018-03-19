package com.yiche.smp.core.service;

import java.util.List;

import com.yiche.smp.domain.ImpChannelConsumeData;

public interface ImpChannelConsumeDataSerivce {

	List<ImpChannelConsumeData> selectFileExcle();

	ImpChannelConsumeData selectFileExcelById(Integer id);

	

}
