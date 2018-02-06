package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.DateUtil;
import com.yiche.smp.common.TrendJudgeEnum;
import com.yiche.smp.common.barchart.*;
import com.yiche.smp.common.piechart.*;
import com.yiche.smp.core.service.ClueTendencyService;
import com.yiche.smp.domain.*;
import com.yiche.smp.mapper.MonthClueColumnarMapper;
import com.yiche.smp.mapper.MonthCluePieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
@Service
public class ClueTendencyServiceImpl implements ClueTendencyService {

    @Autowired
    private MonthClueColumnarMapper monthClueColumnarMapper;

    @Autowired
    private MonthCluePieMapper monthCluePieMapper;

    /**
     * 柱状图
     */
    public Barchart selectDataByDate(String month) {
        //处理日期数据
        List <String> strings = DateUtil.DisposeDateData(month);
        //判断此月是否有值
        List <MonthClueColumnar> monthClueColumnarList = new ArrayList <>();
        for (String s : strings) {
            MonthClueColumnarExample monthClueColumnarExample = new MonthClueColumnarExample();
            MonthClueColumnarExample.Criteria criteria = monthClueColumnarExample.createCriteria();
            criteria.andDataDateEqualTo(s);
            List <MonthClueColumnar> monthClueColumnars = monthClueColumnarMapper.selectByExample(monthClueColumnarExample);
            if (CollectionUtil.listNotNull(monthClueColumnars)) {
                monthClueColumnarList.addAll(monthClueColumnars);
            }else{
            	monthClueColumnarList.add(null);
            }
        }
        if (!CollectionUtil.listNotNull(monthClueColumnarList)) {
        	return null;
        }
        //添加月份
        List <String> data = DateUtil.DisposeDateMonth(strings, "月");
        //存储数据
        Barchart barchart = new Barchart();
        barchart.setLegend(new com.yiche.smp.common.barchart.Legend(data));
        List <Data> datas = new ArrayList <>();
        Data data1 = new Data();
        data1.setData(data);
        datas.add(data1);
        barchart.setxAxis(datas);
        barchart.setLegend(new com.yiche.smp.common.barchart.Legend(data));
        //创建容器
        List <com.yiche.smp.common.barchart.Series> seriesList = new ArrayList <>();
        List <String> conform_market_trend = new ArrayList <>();
        List <String> up_market_trend = new ArrayList <>();
        List <String> under_maket_trend_shop_up = new ArrayList <>();
        List <String> under_maket_trend_clue_up_insufficient = new ArrayList <>();
        List <String> under_maket_trend_clue_glide = new ArrayList <>();
        //提取数据
        for (MonthClueColumnar monthClueColumnar : monthClueColumnarList) {
            if (monthClueColumnar != null) {
                conform_market_trend.add(String.valueOf(monthClueColumnar.getConformMarketTrend()));
                up_market_trend.add(String.valueOf(monthClueColumnar.getUpMarketTrend()));
                under_maket_trend_shop_up.add(String.valueOf(monthClueColumnar.getUnderMaketTrendShopUp()));
                under_maket_trend_clue_up_insufficient.add(String.valueOf(monthClueColumnar.getUnderMaketTrendClueUpInsufficient()));
                under_maket_trend_clue_glide.add(String.valueOf(monthClueColumnar.getUnderMaketTrendClueGlide()));
            } else {
                conform_market_trend.add("-");
                up_market_trend.add("-");
                under_maket_trend_shop_up.add("-");
                under_maket_trend_clue_up_insufficient.add("-");
                under_maket_trend_clue_glide.add("-");
            }
        }
        //创建对象
        seriesList.add(new com.yiche.smp.common.barchart.Series(conform_market_trend, TrendJudgeEnum.conform.getMessage(), "bar", ""));
        seriesList.add(new com.yiche.smp.common.barchart.Series(up_market_trend, TrendJudgeEnum.exceed.getMessage(), "bar", ""));
        seriesList.add(new com.yiche.smp.common.barchart.Series(under_maket_trend_shop_up, TrendJudgeEnum.underShopAdd.getMessage(), "bar", ""));
        seriesList.add(new com.yiche.smp.common.barchart.Series(under_maket_trend_clue_up_insufficient, TrendJudgeEnum.underClueInsufficient.getMessage(), "bar", ""));
        seriesList.add(new com.yiche.smp.common.barchart.Series(under_maket_trend_clue_glide, TrendJudgeEnum.underClueDecline.getMessage(), "bar", ""));
        barchart.setSeries(seriesList);
        barchart.setyAxis(new YAxis("单位,个"));
        return barchart;
    }

    /**
     * 饼图
     */
    public Piechart selectDatatoPiechart(String month) {
        MonthCluePieExample monthCluePieExample = new MonthCluePieExample();
        MonthCluePieExample.Criteria criteria = monthCluePieExample.createCriteria();
        criteria.andDataDateEqualTo(month);
        List <MonthCluePie> monthCluePies = monthCluePieMapper.selectByExample(monthCluePieExample);


        //处理数据
        Piechart piechart = new Piechart();
        List <PieData> list = new ArrayList <>();
        com.yiche.smp.common.piechart.Series series = new com.yiche.smp.common.piechart.Series();

        if (!CollectionUtil.listNotNull(monthCluePies)) {
            series.setData(list);
        } else {
            list.add(new PieData(String.valueOf(Math.round(monthCluePies.get(0).getConformMarketTrend() * 100)), TrendJudgeEnum.conform.getMessage()));
            list.add(new PieData(String.valueOf(Math.round(monthCluePies.get(0).getUpMarketTrend() * 100)), TrendJudgeEnum.exceed.getMessage()));
            list.add(new PieData(String.valueOf(Math.round(monthCluePies.get(0).getUnderMaketTrendShopUp() * 100)), TrendJudgeEnum.underShopAdd.getMessage()));
            list.add(new PieData(String.valueOf(Math.round(monthCluePies.get(0).getUnderMaketTrendClueUpInsufficient() * 100)), TrendJudgeEnum.underClueInsufficient.getMessage()));
            list.add(new PieData(String.valueOf(Math.round(monthCluePies.get(0).getUnderMaketTrendClueGlide() * 100)), TrendJudgeEnum.underClueDecline.getMessage()));
            series.setData(list);
        }
        Normal normal = new Normal();
        Label label = new Label();
        label.setNormal(normal);
        series.setLabel(label);
        LabelLine labelLine = new LabelLine();
        labelLine.setNormal(normal);
        series.setLabelLine(labelLine);

        List <com.yiche.smp.common.piechart.Series> seriesList = new ArrayList <>();
        seriesList.add(series);
        piechart.setSeries(seriesList);
        piechart.setLegend(new com.yiche.smp.common.piechart.Legend());
        return piechart;
    }
}
