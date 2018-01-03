package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.MonthUtil;
import com.yiche.smp.common.channelPictureChart.*;
import com.yiche.smp.core.service.ChannelQualityService;
import com.yiche.smp.domain.*;
import com.yiche.smp.mapper.ChannelQualityMapper;
import com.yiche.smp.mapper.ChannelQualityOverviewMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lenovo on 2017/12/8.
 */
@Service
@Transactional
public class ChannelQualityServiceImpl implements ChannelQualityService {
    private Logger logger = LoggerFactory.getLogger(ChannelQualityServiceImpl.class);
    @Autowired
    private ChannelQualityMapper channelQualityMapper;
    @Autowired
    private ChannelQualityOverviewMapper channelQualityOverviewMapper;

    @Override
    public TotalData getTotalData(String platName, String monthData) {
        //获取上月的月份
        String monthData1 = MonthUtil.getPrevMonthDate(monthData);
        logger.info("获得的月份是：" + monthData1);
        TotalData totalData = new TotalData();
        int comeFrom = -1;
        if (platName.equals("易车APP")) {
            comeFrom = 0;
        } else if (platName.equals("汽车报价大全APP")) {
            comeFrom = 1;
        } else {
            return null;
        }
        //获取综述语句的对象
        ChannelQualityOverviewExample channelQualityOverviewExample = new ChannelQualityOverviewExample();
        ChannelQualityOverviewExample.Criteria criteria = channelQualityOverviewExample.createCriteria();
        criteria.andComeFromEqualTo(comeFrom);
        criteria.andMonthDataEqualTo(monthData);
        List <ChannelQualityOverview> channelQualityOverviews = channelQualityOverviewMapper.selectByExample(channelQualityOverviewExample);
        if (channelQualityOverviews == null || channelQualityOverviews.size() == 0) {
            return new TotalData();
        }
        ChannelQualityOverview channelQualityOverview = channelQualityOverviews.get(0);
        //获取的查询月的数据
        HashMap <String, Object> map = new HashMap <>();
        map.put("comeFrom", comeFrom);
        map.put("monthData", monthData);
        map.put("channelTime", monthData);
        List <ChannelQuality> channelqualities1 = channelQualityMapper.selectByScoreAfterData(map);
        logger.info("综合得分靠后的渠道查询到的条数有：" + channelqualities1.size() + "第二条的id是：" + channelqualities1.get(1).getId());
//        为第一张图设置数据
        ScoreData scoreAfterData = new ScoreData();
        scoreAfterData.setChannelScoreTitle("综合得分靠后的渠道");
//        String channelScoreDesc="数据显示，"+mongth+"月份综合分分排名较靠后的渠道有"+channelqualities1.get(0).getChannelname()+"、"+channelqualities1.get(1).getChannelname()+"、"+channelqualities1.get(2).getChannelname();
        String channelScoreDesc = channelQualityOverview.getScoreAfterData();
        scoreAfterData.setChannelScoreDesc(channelScoreDesc);
        //设置表格
        Table table1 = new Table();
        ArrayList <Children> tHead1 = new ArrayList <>();
        tHead1.add(new Children("channelName", "渠道名称", new ArrayList <Children>()));
        tHead1.add(new Children("indexScore", "成本指标得分", new ArrayList <Children>()));
        tHead1.add(new Children("numberScore", "数量指标得分", new ArrayList <Children>()));
        tHead1.add(new Children("qualityScore", "质量指标得分", new ArrayList <Children>()));
        tHead1.add(new Children("efficiencyScore", "效率指标得分", new ArrayList <Children>()));
        tHead1.add(new Children("rank", "综合排名", new ArrayList <Children>()));
        table1.settHead(tHead1);
        ArrayList <Object> tBody1 = new ArrayList <>();
        for (ChannelQuality channelquality : channelqualities1) {
            Tbody1 tbody1 = new Tbody1();
            tbody1.setChannelName(channelquality.getChannelName());
            tbody1.setEfficiencyScore(channelquality.getEfficiencyScore());
            tbody1.setIndexScore(channelquality.getIndexScore());
            tbody1.setNumberScore(channelquality.getNumberScore());
            tbody1.setQualityScore(channelquality.getQualityScore());
            tbody1.setRank(channelquality.getRank());
            tBody1.add(tbody1);
        }
        table1.settBody(tBody1);
        scoreAfterData.setChannelScoreTable(table1);
        //设置雷达图
        ArrayList <ChannelScoreChart> channelScoreCharts = new ArrayList <ChannelScoreChart>();
        for (ChannelQuality channelquality : channelqualities1) {
            ChannelScoreChart channelScoreChart1 = new ChannelScoreChart();
            channelScoreChart1.setTitle(new Title(channelquality.getChannelName()));
            ArrayList <String> strings = new ArrayList <>();
            strings.add(channelquality.getChannelName());
            strings.add("均分");
            channelScoreChart1.setLegend(new Legend(strings));
            ArrayList <Indicator> indicators = new ArrayList <>();
            indicators.add(new Indicator("成本", 10));
            indicators.add(new Indicator("效率", 10));
            indicators.add(new Indicator("质量", 10));
            indicators.add(new Indicator("数量", 10));
            channelScoreChart1.setRadar(new Radar(indicators));
            //设置雷达图数值
            List <PictureData> data = new ArrayList <PictureData>();
            double[] value1 = new double[]{channelquality.getIndexScore(), channelquality.getEfficiencyScore(), channelquality.getQualityScore(), channelquality.getNumberScore()};
            double[] value2 = new double[]{6.0, 6.0, 6.0, 6.0};
            data.add(new PictureData(channelquality.getChannelName(), value1));
            data.add(new PictureData("均分", value2));
            ArrayList <Series> series = new ArrayList <>();
            series.add(new Series("radar", data));
            channelScoreChart1.setSeries(series);
            channelScoreCharts.add(channelScoreChart1);
        }
        scoreAfterData.setChannelScoreChart(channelScoreCharts);
        totalData.setScoreAfterData(scoreAfterData);
        //综合得分波动（下降）较大的渠道
        List <ChannelQuality> channelqualities2 = channelQualityMapper.selectByScoreWaveDownData(map);
        logger.info("综合得分波动（下降）较大的渠道个数：" + channelqualities2.size() + "第二条的id是：" + channelqualities2.get(1).getId());
        ScoreData scoreWaveDownDate = new ScoreData();
        scoreWaveDownDate.setChannelScoreTitle("综合得分波动（下降）较大的渠道");
        scoreWaveDownDate.setChannelScoreDesc(channelQualityOverview.getScoreWaveDownData());
        Table table2 = new Table();
        ArrayList <Children> tHead2 = new ArrayList <>();
        tHead2.add(new Children("channelName", "渠道名称", new ArrayList <Children>()));
        ArrayList <Children> tHead21 = new ArrayList <>();
        tHead21.add(new Children("indexScorePrev", "本月", new ArrayList <Children>()));
        tHead21.add(new Children("indexScoreNext", "上月", new ArrayList <Children>()));
        tHead2.add(new Children("indexScore", "成本指标得分", tHead21));
        ArrayList <Children> tHead22 = new ArrayList <>();
        tHead22.add(new Children("numberScorePrev", "本月", new ArrayList <Children>()));
        tHead22.add(new Children("numberScoreNext", "上月", new ArrayList <Children>()));
        tHead2.add(new Children("numberScore", "数量指标得分", tHead22));
        ArrayList <Children> tHead23 = new ArrayList <>();
        tHead23.add(new Children("qualityScorePrev", "本月", new ArrayList <Children>()));
        tHead23.add(new Children("qualityScoreNext", "上月", new ArrayList <Children>()));
        tHead2.add(new Children("qualityScore", "质量指标得分", tHead23));
        ArrayList <Children> tHead24 = new ArrayList <>();
        tHead24.add(new Children("efficiencyScorePrev", "本月", new ArrayList <Children>()));
        tHead24.add(new Children("efficiencyScoreNext", "上月", new ArrayList <Children>()));
        tHead2.add(new Children("efficiencyScore", "效率指标得分", tHead24));
        tHead2.add(new Children("rank", "本月排名", new ArrayList <Children>()));
        tHead2.add(new Children("wave", "得分波动", new ArrayList <Children>()));
        table2.settHead(tHead2);
//        设置表格的tbody
        ArrayList <Object> tbody2 = new ArrayList <>();
        //设置综合得分波动（下降）较大的渠道的雷达图
        ArrayList <ChannelScoreChart> channelScoreCharts2 = new ArrayList <>();
        getData(channelqualities2, tbody2, channelScoreCharts2, monthData1, comeFrom, monthData);
        table2.settBody(tbody2);
        scoreWaveDownDate.setChannelScoreTable(table2);
        scoreWaveDownDate.setChannelScoreChart(channelScoreCharts2);
        totalData.setScoreWaveDownData(scoreWaveDownDate);
        //综合得分靠前的渠道
        ScoreData scoreFontData = new ScoreData();
        //获取综合得分靠前的渠道
        List <ChannelQuality> channelqualities3 = channelQualityMapper.selectByScoreFontData(map);
        scoreFontData.setChannelScoreTitle("综合得分靠前的渠道");
        scoreFontData.setChannelScoreDesc(channelQualityOverview.getScoreFrontData());
        Table table3 = new Table();
        table3.settHead(tHead1);
        ArrayList <Object> tBody3 = new ArrayList <>();
        ArrayList <ChannelScoreChart> channelScoreCharts3 = new ArrayList <ChannelScoreChart>();
        for (ChannelQuality channelquality : channelqualities3) {
            Tbody1 tbody3 = new Tbody1();
            tbody3.setChannelName(channelquality.getChannelName());
            tbody3.setEfficiencyScore(channelquality.getEfficiencyScore());
            tbody3.setIndexScore(channelquality.getIndexScore());
            tbody3.setNumberScore(channelquality.getNumberScore());
            tbody3.setQualityScore(channelquality.getQualityScore());
            tbody3.setRank(channelquality.getRank());
            tBody3.add(tbody3);
            //设置雷达图
            ChannelScoreChart channelScoreChart1 = new ChannelScoreChart();
            channelScoreChart1.setTitle(new Title(channelquality.getChannelName()));
            ArrayList <String> strings = new ArrayList <>();
            strings.add(channelquality.getChannelName());
            strings.add("均分");
            channelScoreChart1.setLegend(new Legend(strings));
            ArrayList <Indicator> indicators = new ArrayList <>();
            indicators.add(new Indicator("成本", 10));
            indicators.add(new Indicator("效率", 10));
            indicators.add(new Indicator("质量", 10));
            indicators.add(new Indicator("数量", 10));
            channelScoreChart1.setRadar(new Radar(indicators));
            //设置雷达图数值
            List <PictureData> data = new ArrayList <PictureData>();
            double[] value1 = new double[]{channelquality.getIndexScore(), channelquality.getEfficiencyScore(), channelquality.getQualityScore(), channelquality.getNumberScore()};
            double[] value2 = new double[]{6.0, 6.0, 6.0, 6.0};
            data.add(new PictureData(channelquality.getChannelName(), value1));
            data.add(new PictureData("均分", value2));
            ArrayList <Series> series = new ArrayList <>();
            series.add(new Series("radar", data));
            channelScoreChart1.setSeries(series);
            channelScoreCharts3.add(channelScoreChart1);
        }
        table3.settBody(tBody3);
        scoreFontData.setChannelScoreTable(table3);
        scoreFontData.setChannelScoreChart(channelScoreCharts3);
        totalData.setScoreFontData(scoreFontData);
        //综合得分波动（上升）较大的渠道
        ScoreData scoreWaveUpDate = new ScoreData();
        scoreWaveUpDate.setChannelScoreTitle("综合得分波动（上升）较大的渠道");
        scoreWaveUpDate.setChannelScoreDesc(channelQualityOverview.getScoreWaveUpData());
        Table table4 = new Table();
        table4.settHead(tHead2);
        //设置tbody和雷达图
        List <ChannelQuality> channelqualities4 = channelQualityMapper.selectByScoreWaveUpDate(map);
        ArrayList <Object> tbody4 = new ArrayList <>();
        //设置综合得分波动（下降）较大的渠道的雷达图
        ArrayList <ChannelScoreChart> channelScoreCharts4 = new ArrayList <>();
        getData(channelqualities4, tbody4, channelScoreCharts4, monthData1, comeFrom, monthData);
        table4.settBody(tbody4);
        scoreWaveUpDate.setChannelScoreTable(table4);
        scoreWaveUpDate.setChannelScoreChart(channelScoreCharts4);
        totalData.setScoreWaveUpData(scoreWaveUpDate);
        return totalData;
    }

    @Override
    public Table2 getTotalScoreRank(String platName, String monthData) {
        int comeFrom = -1;
        if (platName.equals("易车APP")) {
            comeFrom = 0;
        } else if (platName.equals("汽车报价大全APP")) {
            comeFrom = 1;
        } else {
            return null;
        }
        HashMap <String, Object> map2 = new HashMap <>();
        map2.put("comeFrom", comeFrom);
        map2.put("monthData", monthData);
        map2.put("channelTime", monthData);
        List <ChannelQuality> channelqualities = channelQualityMapper.selectTotalScoreRank(map2);
        if (channelqualities == null) {
            return null;
        }
        ArrayList <Head> heads = new ArrayList <>();
        heads.add(new Head("channelName", "渠道名称"));
        heads.add(new Head("indexScore", "成本指标得分"));
        heads.add(new Head("numberScore", "数量指标得分"));
        heads.add(new Head("qualityScore", "质量指标得分"));
        heads.add(new Head("efficiencyScore", "效率指标得分"));
        heads.add(new Head("totalScore", "综合得分"));
        heads.add(new Head("rank", "本月排名"));
        ArrayList <Body> bodies = new ArrayList <>();
        for (ChannelQuality channelquality : channelqualities) {
            Body body = new Body();
            body.setChannelName(channelquality.getChannelName());
            body.setIndexScore(channelquality.getIndexScore());
            body.setNumberScore(channelquality.getNumberScore());
            body.setQualityScore(channelquality.getQualityScore());
            body.setEfficiencyScore(channelquality.getEfficiencyScore());
            body.setTotalScore(channelquality.getTotalScore());
            body.setRank(channelquality.getRank());
            bodies.add(body);
        }
        Table2 table2 = new Table2(heads, bodies);
        return table2;
    }

    private void getData(List <ChannelQuality> channelqualities4, ArrayList <Object> tbody4, ArrayList <ChannelScoreChart> channelScoreCharts4, String monthData1, int comeFrom, String channelTime) {
        for (int i = 0; i < channelqualities4.size(); i++) {
            ChannelQuality channelqualityPrev = channelqualities4.get(i);
            ChannelQualityExample channelqualityExample = new ChannelQualityExample();
            ChannelQualityExample.Criteria criteria = channelqualityExample.createCriteria();
            criteria.andMonthTimeEqualTo(monthData1);
            criteria.andComeFromEqualTo(comeFrom);
            criteria.andChannelTimeEqualTo(channelTime);
            criteria.andChannelNumberEqualTo(channelqualityPrev.getChannelNumber());
            ChannelQuality channelqualityNext = channelQualityMapper.selectByExample(channelqualityExample).get(0);
            logger.info("查询到的上月的名称是：" + channelqualityNext.getChannelName());
            Tbody2 tbody = new Tbody2();
            tbody.setChannelName(channelqualityPrev.getChannelName());
            tbody.setIndexScorePrev(channelqualityPrev.getIndexScore());
            tbody.setIndexScoreNext(channelqualityNext.getIndexScore());
            tbody.setNumberScorePrev(channelqualityPrev.getNumberScore());
            tbody.setNumberScoreNext(channelqualityNext.getNumberScore());
            tbody.setQualityScorePrev(channelqualityPrev.getQualityScore());
            tbody.setQualityScoreNext(channelqualityNext.getQualityScore());
            tbody.setEfficiencyScorePrev(channelqualityPrev.getEfficiencyScore());
            tbody.setEfficiencyScoreNext(channelqualityNext.getEfficiencyScore());
            tbody.setRank(channelqualityPrev.getRank());
            Double scorechange = channelqualityPrev.getScoreChange();
            if (scorechange <= 0) {
                tbody.setWave(scorechange);
            } else {
                tbody.setWave("+" + scorechange.toString());
            }

            tbody4.add(tbody);
            //设置雷达图的值
            ChannelScoreChart channelScoreChart1 = new ChannelScoreChart();
            channelScoreChart1.setTitle(new Title(channelqualityPrev.getChannelName()));
            ArrayList <String> strings = new ArrayList <>();
            strings.add("本月");
            strings.add("上月");
            channelScoreChart1.setLegend(new Legend(strings));
            ArrayList <Indicator> indicators = new ArrayList <>();
            indicators.add(new Indicator("成本", 10));
            indicators.add(new Indicator("效率", 10));
            indicators.add(new Indicator("质量", 10));
            indicators.add(new Indicator("数量", 10));
            channelScoreChart1.setRadar(new Radar(indicators));
            //设置雷达图数值
            List <PictureData> data = new ArrayList <PictureData>();
            double[] value1 = new double[]{channelqualityPrev.getIndexScore(), channelqualityPrev.getEfficiencyScore(), channelqualityPrev.getQualityScore(), channelqualityPrev.getNumberScore()};
            double[] value2 = new double[]{channelqualityNext.getIndexScore(), channelqualityNext.getEfficiencyScore(), channelqualityNext.getQualityScore(), channelqualityNext.getNumberScore()};
            data.add(new PictureData("本月", value1));
            data.add(new PictureData("上月", value2));
            ArrayList <Series> series = new ArrayList <>();
            series.add(new Series("radar", data));
            channelScoreChart1.setSeries(series);
            channelScoreCharts4.add(channelScoreChart1);
        }
    }
}
