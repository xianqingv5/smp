package com.yiche.smp.core.service.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiche.smp.core.service.ImpHolidayService;
import com.yiche.smp.domain.ImpHoliday;
import com.yiche.smp.mapper.ImpHolidayMapper;
@Service
public class ImPHolidayServiceImpl implements ImpHolidayService {
	@Autowired
	private ImpHolidayMapper impmapper;
	@Override
	public ImpHoliday selectdate(Date dateto) {
	ImpHoliday  impHoliday =impmapper.selectByDate(dateto);
		return impHoliday;
	}
	@Override
	public Byte selectBynow(Date date) {
	Byte strutsnow =	impmapper.selectByNow( date);
		return strutsnow;
	}

}
