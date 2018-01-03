package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.MonthUtil;
import com.yiche.smp.common.StringUtil;
import com.yiche.smp.common.linechart.*;
import com.yiche.smp.core.service.LineChartService;
import com.yiche.smp.domain.SellTrend;
import com.yiche.smp.domain.SellTrendExample;
import com.yiche.smp.mapper.SellTrendMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lenovo on 2017/12/12.
 */
@Service
@Transactional
public class LineChartServiceImpl implements LineChartService {
    private Logger logger = LoggerFactory.getLogger(LineChartServiceImpl.class);
    @Autowired
    private SellTrendMapper selltrendMapper;

    @Override
    public List <LineChart> getLineCharts(String brandName, String monthData) {
        //查询之前五个月的数据对比后返回折线图对象
        String[] split = monthData.split("-");
        if(Integer.parseInt(split[1])<10){
            monthData= split[0]+"-0"+split[1];
        }
        String monthData1 = getMonthData(monthData);
        String monthData2 = getMonthData(monthData1);
        String monthData3 = getMonthData(monthData2);
        String monthData4 = getMonthData(monthData3);
        logger.info("查询月前的第四个月分是：" + monthData4);
        //查询的本月
        SellTrend selltrend = selltrendMapper.getSelltrendsByNameAndMonthData(getMap(brandName, monthData));
        logger.info("查询到的本月品牌是："+selltrend.getBrand());
        //查询的之前一个月
        SellTrend selltrend1 = selltrendMapper.getSelltrendsByNameAndMonthData(getMap(brandName, monthData1));
        //查询的之前2个月
        SellTrend selltrend2 = selltrendMapper.getSelltrendsByNameAndMonthData(getMap(brandName, monthData2));
        //查询的之前3个月
        SellTrend selltrend3 = selltrendMapper.getSelltrendsByNameAndMonthData(getMap(brandName, monthData3));
        //查询的之前4个月
        SellTrend selltrend4 = selltrendMapper.getSelltrendsByNameAndMonthData(getMap(brandName, monthData4));
        //销售趋势
        Trend trend1 = new Trend(brandName, "2%", "center", new TextStyle(14));
        Object[] data1 = new Object[]{selltrend4==null?"-":selltrend4.getSellNumber(),selltrend3==null?"-": selltrend3.getSellNumber(),selltrend2==null?"-": selltrend2.getSellNumber(),selltrend1==null?"-": selltrend1.getSellNumber(),selltrend==null?"-": selltrend.getSellNumber()};
        LineStyle lineStyle = new LineStyle(new Normal("#528dff", 2));
        TrendData trendData1 = new TrendData(data1, "销售趋势", "line", lineStyle);
        XAxisData xAxisData = new XAxisData(new String[]{getMonth(monthData4), getMonth(monthData3), getMonth(monthData2), getMonth(monthData1), getMonth(monthData)});
        YAxisType yAxisType = new YAxisType("销售趋势:（台）", "value");
        ArrayList <LineChart> lineCharts = new ArrayList <>();
        if(StringUtil.ObjNotNull(selltrend.getSellNumber()) && StringUtil.ObjNotNull(selltrend1.getSellNumber()) && StringUtil.ObjNotNull(selltrend2.getSellNumber()) && StringUtil.ObjNotNull(selltrend3.getSellNumber()) && StringUtil.ObjNotNull(selltrend4.getSellNumber())){
            lineCharts.add(new LineChart(trend1, trendData1, xAxisData, yAxisType));
        }else {
            lineCharts.add(new LineChart(trend1, null, xAxisData, yAxisType));
        }
        //保留两位小数
        //店均线索趋势
        Trend trend2 = new Trend(brandName, "2%", "center", new TextStyle(14));
        Object[] data2 = new Object[]{selltrend4==null?"-":getDouble(selltrend4.getStoreClueNumber()),selltrend3==null?"-": getDouble(selltrend3.getStoreClueNumber()),selltrend2==null?"-": getDouble(selltrend2.getStoreClueNumber()),selltrend1==null?"-": getDouble(selltrend1.getStoreClueNumber()),selltrend==null?"-": getDouble(selltrend.getStoreClueNumber())};
        TrendData trendData2 = new TrendData(data2, "店均线索趋势", "line", lineStyle);
        YAxisType yAxisType2 = new YAxisType("店均线索趋势:（条）", "value");
        if(StringUtil.ObjNotNull(selltrend.getStoreClueNumber()) && StringUtil.ObjNotNull(selltrend1.getStoreClueNumber()) && StringUtil.ObjNotNull(selltrend2.getStoreClueNumber()) && StringUtil.ObjNotNull(selltrend3.getStoreClueNumber()) && StringUtil.ObjNotNull(selltrend4.getStoreClueNumber())){
            lineCharts.add(new LineChart(trend2, trendData2, xAxisData, yAxisType2));
        }else {
            lineCharts.add(new LineChart(trend2, null, xAxisData, yAxisType2));
        }
        //整体线索趋势
        Trend trend3 = new Trend(brandName, "2%", "center", new TextStyle(14));

        Object[] data3 = new Object[]{selltrend4==null?"-":selltrend4.getClueNumber(),selltrend3==null?"-": selltrend3.getClueNumber(),selltrend2==null?"-": selltrend2.getClueNumber(),selltrend1==null?"-": selltrend1.getClueNumber(),selltrend==null?"-": selltrend.getClueNumber()};
        TrendData trendData3 = new TrendData(data3, "整体线索趋势", "line", lineStyle);
        YAxisType yAxisType3 = new YAxisType("整体线索趋势:（条）", "value");

        if(StringUtil.ObjNotNull(selltrend.getClueNumber()) && StringUtil.ObjNotNull(selltrend1.getClueNumber()) && StringUtil.ObjNotNull(selltrend2.getClueNumber()) && StringUtil.ObjNotNull(selltrend3.getClueNumber()) && StringUtil.ObjNotNull(selltrend4.getClueNumber())){
            lineCharts.add(new LineChart(trend3, trendData3, xAxisData, yAxisType3));
        }else {
            lineCharts.add(new LineChart(trend2, null, xAxisData, yAxisType2));
        }
        //门店签约趋势
        Trend trend4 = new Trend(brandName, "2%", "center", new TextStyle(14));
        Object[] data4 = new Object[]{selltrend4==null?"-":getDouble(selltrend4.getDealerNumber()),selltrend3==null?"-": getDouble(selltrend3.getDealerNumber()),selltrend2==null?"-": getDouble(selltrend2.getDealerNumber()),selltrend1==null?"-": getDouble(selltrend1.getDealerNumber()),selltrend==null?"-": getDouble(selltrend.getDealerNumber())};
        TrendData trendData4 = new TrendData(data4, "门店签约趋势", "line", lineStyle);
        YAxisType yAxisType4 = new YAxisType("门店签约趋势:（个）", "value");

        if(StringUtil.ObjNotNull(selltrend.getDealerNumber()) && StringUtil.ObjNotNull(selltrend1.getDealerNumber()) && StringUtil.ObjNotNull(selltrend2.getDealerNumber()) && StringUtil.ObjNotNull(selltrend3.getDealerNumber()) && StringUtil.ObjNotNull(selltrend4.getDealerNumber())){
            lineCharts.add(new LineChart(trend4, trendData4, xAxisData, yAxisType4));
        }else {
            lineCharts.add(new LineChart(trend4, null, xAxisData, yAxisType4));
        }
        return lineCharts;
    }

    @Override
    public List <BrandName> getBrands(String monthData) {
        String[] split = monthData.split("-");
        if(Integer.parseInt(split[1])<10){
            monthData= split[0]+"-0"+split[1];
        }
        SellTrendExample selltrendExample = new SellTrendExample();
        SellTrendExample.Criteria criteria = selltrendExample.createCriteria();
        criteria.andMonthdataEqualTo(monthData);
        logger.info("monthData:"+monthData);
        List <SellTrend> selltrends = selltrendMapper.selectByExample(selltrendExample);
        List <BrandName> brandNames = new ArrayList <BrandName>();
        for (SellTrend selltrend : selltrends) {
            BrandName brandName = new BrandName();
            brandName.setName(selltrend.getBrand());
            brandNames.add(brandName);
        }
        return brandNames;
    }

    private String getMonth(String monthData) {
        String substring = monthData.substring(monthData.lastIndexOf("-") + 1);
        int i = Integer.parseInt(substring);
        return i + "月";
    }

    private Map <String, String> getMap(String brandName, String monthData) {
        HashMap <String, String> map = new HashMap <>();
        map.put("brandName", brandName);
        map.put("monthData", monthData);
        return map;
    }

    private String getMonthData(String monthdata) {
        //数据库数据为2017-09，需要转换
        String monthDate1 = MonthUtil.getPrevMonthDate(monthdata);
        String[] split = monthDate1.split("-");
        if(Integer.parseInt(split[1])<10){
            return split[0]+"-0"+split[1];
        }
        return monthDate1;
    }

    public Double getDouble(double num) {
        //        保留两位小数
        DecimalFormat df = new DecimalFormat("######0.00");
        String format = df.format(num);
        return Double.valueOf(format);
    }


}
