package com.yiche.smp.core.service;

import java.util.Date;

import com.yiche.smp.domain.ImpHoliday;

public interface ImpHolidayService {

	ImpHoliday selectdate(Date dateto);

	Byte selectBynow(Date date);

}
