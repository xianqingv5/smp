package com.yiche.smp.core.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiche.smp.core.service.ImpChannelConsumeDataSerivce;
import com.yiche.smp.domain.ImpChannelConsumeData;
import com.yiche.smp.domain.ImpChannelConsumeDataExample;
import com.yiche.smp.mapper.ImpChannelConsumeDataMapper;
@Service

public class ImpChannelConsumeDataServiceImpl implements ImpChannelConsumeDataSerivce {
@Autowired
private ImpChannelConsumeDataMapper impMapper;
	@Override
	public List<ImpChannelConsumeData> selectFileExcle() {
		ImpChannelConsumeDataExample example = new ImpChannelConsumeDataExample();
		example.setOrderByClause("id desc");
		List<ImpChannelConsumeData> list = impMapper.selectByExample(example);
		return list;
	}
	@Override
	public ImpChannelConsumeData selectFileExcelById(Integer id) {
		ImpChannelConsumeData data = impMapper.selectByPrimaryKey(id);
		return data;
	}

}
