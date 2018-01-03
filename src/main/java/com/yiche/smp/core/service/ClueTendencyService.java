package com.yiche.smp.core.service;

import com.yiche.smp.common.barchart.Barchart;
import com.yiche.smp.common.piechart.Piechart;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public interface ClueTendencyService {

    Barchart selectDataByDate(String month);

    Piechart selectDatatoPiechart(String month);
}
