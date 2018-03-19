package com.yiche.smp.core.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiche.smp.core.service.ImPlatformService;
import com.yiche.smp.domain.ImpPlatform;
import com.yiche.smp.domain.ImpPlatformExample;
import com.yiche.smp.mapper.ImpPlatformMapper;
@Service
public class ImplatformServiceImpl implements ImPlatformService {
	@Autowired
	private ImpPlatformMapper imPlatformMapper;
	@Override
	public List<ImpPlatform> selectImPlatform() {
		ImpPlatformExample example = new ImpPlatformExample();
		List<ImpPlatform> list = imPlatformMapper.selectByExample(example);
		return list;
	}

}
