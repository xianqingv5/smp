package com.yiche.smp.core.service;

import com.yiche.smp.common.barchart.Barchart;
import com.yiche.smp.common.early.warning.EarlyWarning;
import com.yiche.smp.common.early.warning.EarlyWarningPiece;
import com.yiche.smp.common.early.warning.ResultBrand;
import com.yiche.smp.common.euraka.data.Data;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/25
 */
public interface EarlyWarningService {

    LinkedList <Data> findBrandNameByMonth(String monthData) throws ParseException;

    EarlyWarning earlyWarningList(String monthData) throws ParseException;

    List <EarlyWarningPiece> earlyWarningPieceList(String brandName, String monthData) throws ParseException;


    //Barchart earlyWarningBarchart(String brandName, String monthData) throws ParseException;
}
