package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.StringUtil;
import com.yiche.smp.common.put.in.strategy.chart.*;
import com.yiche.smp.common.put.in.strategy.table.Data;
import com.yiche.smp.common.put.in.strategy.table.TBody;
import com.yiche.smp.common.put.in.strategy.table.THead;
import com.yiche.smp.core.service.PutInStrategyService;
import com.yiche.smp.domain.*;
import com.yiche.smp.mapper.SmpLaunchStategyMapper;
import com.yiche.smp.mapper.SmpStategyClueMapper;
import com.yiche.smp.mapper.SmpStategyCostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 投放策略
 */
@Service
public class PutInStrategyServiceImpl implements PutInStrategyService {

    @Autowired
    private SmpLaunchStategyMapper smpLaunchStategyMapper;
    @Autowired
    private SmpStategyClueMapper smpStategyClueMapper;
    @Autowired
    private SmpStategyCostMapper smpStategyCostMapper;

    /**
     * 表格
     */
    public Data getPutStrategyTable() {
        List <SmpLaunchStategy> smpLaunchStategies = smpLaunchStategyMapper.selectByExample(new SmpLaunchStategyExample());
        return new Data(jointHead(), jointBody(smpLaunchStategies));
    }

    /**
     * 折线图
     */
    public com.yiche.smp.common.put.in.strategy.chart.Data getPutStrategyChart() {
        com.yiche.smp.common.put.in.strategy.chart.Data data = new com.yiche.smp.common.put.in.strategy.chart.Data();
        //legend
        //获取所有品牌(线索)
        List <SmpStategyClue> smpStategyClues = smpStategyClueMapper.selectByExample(new SmpStategyClueExample());
        //去重(获取所有品牌)
        Set <String> brandNames = checkBrandToClue(smpStategyClues);
        //获取日期
        List <String> month = checkMonthToClue(smpStategyClues);
        //计算数据
        List <Series> series = checkSeriesToClue(smpStategyClues, brandNames);
        Chart chart = new Chart();
        ArrayList <String> strings = new ArrayList <>(brandNames);
        Tooltip tooltip = new Tooltip();
        chart.setTooltip(tooltip);
        chart.setLegend(new Legend(strings));
        chart.setxAxis(new XAxis("category", false, month));
        chart.setyAxis(new YAxis("value", "单位:条"));
        chart.setSeries(series);
        //成本
        List <SmpStategyCost> smpStategyCosts = smpStategyCostMapper.selectByExample(new SmpStategyCostExample());
        //去重(获取所有品牌)
        Set <String> costBrands = checkBrandToCost(smpStategyCosts);
        //获取日期
        List <String> costMonth = checkMonthToCost(smpStategyCosts);
        //计算数据
        List <Series> costSeries = checkSeriesToCost(smpStategyCosts, costBrands);
        Chart costChart = new Chart();
        List <String> costStrings = new ArrayList <>(costBrands);
        costChart.setTooltip(tooltip);
        costChart.setLegend(new Legend(costStrings));
        costChart.setxAxis(new XAxis("category", false, costMonth));
        costChart.setyAxis(new YAxis("value", "单位:条"));
        costChart.setSeries(costSeries);

        data.setClueChart(chart);
        data.setCostChart(costChart);
        return data;
    }

    /**
     * 获取所有品牌(线索)
     */
    private Set <String> checkBrandToClue(List <SmpStategyClue> smpStategyClues) {
        Set <String> brandNames = null;
        if (CollectionUtil.listNotNull(smpStategyClues)) {
            brandNames = new LinkedHashSet <>();
            for (int i = 0; i < smpStategyClues.size(); i++) {
                for (SmpStategyClue smpStategyClue : smpStategyClues) {
                    if (smpStategyClues.get(i).getChannelName().equals(smpStategyClue.getChannelName())) {
                        brandNames.add(smpStategyClues.get(i).getChannelName());
                        break;
                    }
                }
            }
        }
        return brandNames;
    }

    /**
     * 获取所有品牌(成本)
     */
    private Set <String> checkBrandToCost(List <SmpStategyCost> smpStategyClues) {
        Set <String> brandNames = null;
        if (CollectionUtil.listNotNull(smpStategyClues)) {
            brandNames = new LinkedHashSet <>();
            for (int i = 0; i < smpStategyClues.size(); i++) {
                for (SmpStategyCost smpStategyClue : smpStategyClues) {
                    if (smpStategyClues.get(i).getCostChannelName().equals(smpStategyClue.getCostChannelName())) {
                        brandNames.add(smpStategyClues.get(i).getCostChannelName());
                        break;
                    }
                }
            }
        }
        return brandNames;
    }


    /**
     * 获取日期
     */
    private List <String> checkMonthToClue(List <SmpStategyClue> smpStategyClues) {
        List <String> month = null;
        if (CollectionUtil.listNotNull(smpStategyClues)) {
            month = new ArrayList <>();
            for (SmpStategyClue smpStategyClue : smpStategyClues) {
                if (smpStategyClues.get(0).getChannelName().equals(smpStategyClue.getChannelName())) {
                    month.add(smpStategyClue.getMonth());
                }
            }
        }
        return month;
    }

    /**
     * 获取日期(成本)
     */
    private List <String> checkMonthToCost(List <SmpStategyCost> smpStategyClues) {
        List <String> month = null;
        if (CollectionUtil.listNotNull(smpStategyClues)) {
            month = new ArrayList <>();
            for (SmpStategyCost smpStategyClue : smpStategyClues) {
                if (smpStategyClues.get(0).getCostChannelName().equals(smpStategyClue.getCostChannelName())) {
                    month.add(smpStategyClue.getCostMonth());
                }
            }
        }
        return month;
    }

    /**
     * 计算数据
     */
    private List <Series> checkSeriesToClue(List <SmpStategyClue> smpStategyClues, Set <String> brandNames) {
        List <Series> series = null;
        if (CollectionUtil.listNotNull(smpStategyClues)) {
            series = new ArrayList <>();
            for (String brand : brandNames) {
                List <String> list = new ArrayList <>();
                for (SmpStategyClue smpStategyClue : smpStategyClues) {
                    if (brand.equals(smpStategyClue.getChannelName())) {
                        list.add(StringUtil.handletoRound(smpStategyClue.getClueNum()));
                    }
                }
                series.add(new Series(brand, "line", "", false, list));
            }
        }
        return series;
    }

    /**
     * 计算数据(成本)
     */
    private List <Series> checkSeriesToCost(List <SmpStategyCost> smpStategyClues, Set <String> brandNames) {
        List <Series> series = null;
        if (CollectionUtil.listNotNull(smpStategyClues)) {
            series = new ArrayList <>();
            for (String brand : brandNames) {
                List <String> list = new ArrayList <>();
                for (SmpStategyCost smpStategyClue : smpStategyClues) {
                    if (brand.equals(smpStategyClue.getCostChannelName())) {
                        list.add(StringUtil.handletoRound(smpStategyClue.getCost()));
                    }
                }
                series.add(new Series(brand, "line", "", false, list));
            }
        }
        return series;
    }


    /**
     * 拼接头部
     */
    private List <THead> jointHead() {
        return Arrays.asList(new THead("advType", "广告类型"),
                new THead("channelInfo", "渠道特点"),
                new THead("shopStrategy", "电商节策略"),
                new THead("carStrategy", "车展策略"));
    }

    /**
     * 拼接主体
     */
    private List <TBody> jointBody(List <SmpLaunchStategy> smpLaunchStategies) {
        List <TBody> bodies = null;
        if (CollectionUtil.listNotNull(smpLaunchStategies)) {
            bodies = new ArrayList <>();
            for (SmpLaunchStategy smpLaunchStategy : smpLaunchStategies) {
                bodies.add(new TBody(smpLaunchStategy.getAdvertType(),
                        smpLaunchStategy.getChannelTrait(),
                        smpLaunchStategy.getCommerceFestival(),
                        smpLaunchStategy.getCarShowStategy()));
            }
        }
        return bodies;
    }
}
