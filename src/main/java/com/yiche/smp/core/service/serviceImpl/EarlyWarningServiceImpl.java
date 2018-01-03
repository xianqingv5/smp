package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.CluesTrend.THead;
import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.DateUtil;
import com.yiche.smp.common.StringUtil;
import com.yiche.smp.common.TrendJudgeEnum;
import com.yiche.smp.common.early.warning.EarlyWarning;
import com.yiche.smp.common.early.warning.EarlyWarningList;
import com.yiche.smp.common.early.warning.EarlyWarningPiece;
import com.yiche.smp.common.early.warning.ResultBrand;
import com.yiche.smp.common.euraka.data.Data;
import com.yiche.smp.core.service.EarlyWarningService;
import com.yiche.smp.domain.SellTrend;
import com.yiche.smp.domain.SellTrendExample;
import com.yiche.smp.domain.ShopAvgClues;
import com.yiche.smp.domain.ShopAvgCluesExample;
import com.yiche.smp.mapper.SellTrendMapper;
import com.yiche.smp.mapper.ShopAvgCluesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.*;


@Service
public class EarlyWarningServiceImpl implements EarlyWarningService {

    @Autowired
    private ShopAvgCluesMapper shopAvgCluesMapper;

    @Autowired
    private SellTrendMapper sellTrendMapper;


    /**
     * 预警品牌接口
     */
    @Override
    public LinkedList <Data> findBrandNameByMonth(String monthData) throws ParseException {
        //处理日期
        List <ShopAvgClues> brandNameByMonth = shopAvgCluesMapper.findBrandNameByMonth(monthData);
        LinkedList <Data> ResultBrands = new LinkedList <>();
        for (ShopAvgClues shopAvgClues : brandNameByMonth) {
            ResultBrands.add(new Data(String.valueOf(shopAvgClues.getId()), shopAvgClues.getBrandName()));
        }
        return ResultBrands;
    }


    /**
     * 预警展示列表
     */
    @Override
    public EarlyWarning earlyWarningList(String monthData) throws ParseException {
        Map <String, String> map = new HashMap <>();
        map.put("monthData", monthData);
        map.put("condition", TrendJudgeEnum.underClueDecline.getCode());
        //线索数量下降
        List <ShopAvgClues> shopAvgClues = shopAvgCluesMapper.earlyWarningList(map);
        List <EarlyWarningList> shopAvgCluses = new ArrayList <>();
        for (ShopAvgClues shopAvgClues1 : shopAvgClues) {
            shopAvgCluses.add(new EarlyWarningList(shopAvgClues1.getId(),
                    shopAvgClues1.getIsTop(), shopAvgClues1.getBrandName(),
                    TrendJudgeEnum.underClueDecline.getMessage(),
                    String.valueOf(shopAvgClues1.getShopSellDifference()),
                    String.valueOf(shopAvgClues1.getTotalSellDifference())));
        }
        map.remove("condition");
        map.put("condition", TrendJudgeEnum.underClueInsufficient.getCode());
        List <ShopAvgClues> shopAvgClues2 = shopAvgCluesMapper.earlyWarningList(map);
        for (ShopAvgClues shopAvgClues1 : shopAvgClues2) {
            shopAvgCluses.add(new EarlyWarningList(shopAvgClues1.getId(),
                    shopAvgClues1.getIsTop(), shopAvgClues1.getBrandName(),
                    TrendJudgeEnum.underClueInsufficient.getMessage(),
                    String.valueOf(shopAvgClues1.getShopSellDifference()),
                    String.valueOf(shopAvgClues1.getTotalSellDifference())));
        }
        //封装对象
        EarlyWarning earlyWarning = new EarlyWarning();
        if (CollectionUtil.listNotNull(shopAvgClues)) {
            earlyWarning.settHead(montageTHead());
            earlyWarning.settBody(shopAvgCluses);
            return earlyWarning;
        }
        earlyWarning.settHead(null);
        earlyWarning.settBody(null);
        return earlyWarning;
    }

    /**
     * 预警块图
     */
    @Override
    public List <EarlyWarningPiece> earlyWarningPieceList(String brandName, String monthData) throws ParseException {
        SellTrend currentEarlyWarningData = getCurrentEarlyWarningData(brandName, monthData);
        SellTrend yesteryearEarlyWarningData = getYesteryearEarlyWarningData(brandName, monthData);
        ShopAvgClues shopAvgClues = getShopAvgClues(brandName, monthData);
        return jointData(currentEarlyWarningData, yesteryearEarlyWarningData, shopAvgClues, monthData);
    }


    //查询当前时间数据
    private SellTrend getCurrentEarlyWarningData(String brandName, String monthData) throws ParseException {
        //处理日期
        String s = DateUtil.jointDate(monthData);
        //查询
        SellTrendExample sellTrendExample = new SellTrendExample();
        SellTrendExample.Criteria criteria = sellTrendExample.createCriteria();
        criteria.andBrandEqualTo(brandName);
        criteria.andMonthdataEqualTo(s);
        //当下日期的数据
        List <SellTrend> currentSellTrends = sellTrendMapper.selectByExample(sellTrendExample);
        return currentSellTrends.get(0);
    }

    //查询去年同月时间数据
    private SellTrend getYesteryearEarlyWarningData(String brandName, String monthData) throws ParseException {
        //查询
        SellTrendExample sellTrendExample1 = new SellTrendExample();
        SellTrendExample.Criteria criteria1 = sellTrendExample1.createCriteria();
        criteria1.andBrandEqualTo(brandName);
        int year = DateUtil.getYear(monthData) - 1;
        Integer month = DateUtil.getMonth(monthData);
        String yesteryear = null;
        if (month < 10) {
            yesteryear = year + "-" + "0" + month;
        } else {
            yesteryear = year + "-" + month;
        }
        criteria1.andMonthdataEqualTo(yesteryear);
        //去年同月数据
        List <SellTrend> yesteryearSellTrends = sellTrendMapper.selectByExample(sellTrendExample1);
        return yesteryearSellTrends.get(0);
    }

    private ShopAvgClues getShopAvgClues(String brandName, String monthData) {
        //查询指定同比值
        ShopAvgCluesExample shopAvgCluesExample = new ShopAvgCluesExample();
        ShopAvgCluesExample.Criteria criteria2 = shopAvgCluesExample.createCriteria();
        criteria2.andBrandNameEqualTo(brandName);
        criteria2.andCluesDateEqualTo(monthData);
        List <ShopAvgClues> shopAvgClues = shopAvgCluesMapper.selectByExample(shopAvgCluesExample);
        return shopAvgClues.get(0);
    }

    private List <EarlyWarningPiece> jointData(SellTrend currentSellTrend, SellTrend yesteryearSellTrend, ShopAvgClues shopAvgClues1, String monthData) throws ParseException {
        EarlyWarningPiece allEarlyWarningPiece = new EarlyWarningPiece();
        allEarlyWarningPiece.setWarnTitle(DateUtil.getMonth(monthData) + "月整体线索量");
        allEarlyWarningPiece.setWarnNum(String.valueOf(StringUtil.handletoRound(currentSellTrend.getClueNumber())));
        allEarlyWarningPiece.setLastYear(DateUtil.getYear(monthData) - 1 + "年" + DateUtil.getMonth(monthData) + "月");
        allEarlyWarningPiece.setLastYearNum(String.valueOf(StringUtil.handletoRound(yesteryearSellTrend.getClueNumber())));
        allEarlyWarningPiece.setCompareNum(StringUtil.handleData(shopAvgClues1.getYicheCluesCompare()));

        EarlyWarningPiece shopAvgEarlyWarningPiece = new EarlyWarningPiece();
        shopAvgEarlyWarningPiece.setWarnTitle(DateUtil.getMonth(monthData) + "月店均线索量");
        shopAvgEarlyWarningPiece.setWarnNum(String.valueOf(StringUtil.handletoRound(currentSellTrend.getStoreClueNumber())));
        shopAvgEarlyWarningPiece.setLastYear(DateUtil.getYear(monthData) - 1 + "年" + DateUtil.getMonth(monthData) + "月");
        shopAvgEarlyWarningPiece.setLastYearNum(String.valueOf(StringUtil.handletoRound(yesteryearSellTrend.getStoreClueNumber())));
        shopAvgEarlyWarningPiece.setCompareNum(StringUtil.handleData(shopAvgClues1.getStoreCluesCompare()));

        EarlyWarningPiece sellEarlyWarningPiece = new EarlyWarningPiece();
        sellEarlyWarningPiece.setWarnTitle(DateUtil.getMonth(monthData) + "月销售线索量");
        sellEarlyWarningPiece.setWarnNum(String.valueOf(StringUtil.handletoRound(currentSellTrend.getSellNumber())));
        sellEarlyWarningPiece.setLastYear(DateUtil.getYear(monthData) - 1 + "年" + DateUtil.getMonth(monthData) + "月");
        sellEarlyWarningPiece.setLastYearNum(String.valueOf(StringUtil.handletoRound(yesteryearSellTrend.getSellNumber())));
        sellEarlyWarningPiece.setCompareNum(StringUtil.handleData(shopAvgClues1.getSellCompare()));

        EarlyWarningPiece shopEarlyWarningPiece = new EarlyWarningPiece();
        shopEarlyWarningPiece.setWarnTitle(DateUtil.getMonth(monthData) + "月签约经销商数");
        shopEarlyWarningPiece.setWarnNum(String.valueOf(StringUtil.handletoRound(currentSellTrend.getDealerNumber())));
        shopEarlyWarningPiece.setLastYear(DateUtil.getYear(monthData) - 1 + "年" + DateUtil.getMonth(monthData) + "月");
        shopEarlyWarningPiece.setLastYearNum(String.valueOf(StringUtil.handletoRound(yesteryearSellTrend.getDealerNumber())));
        shopEarlyWarningPiece.setCompareNum(StringUtil.handleData(shopAvgClues1.getShopCompare()));
        List <EarlyWarningPiece> result = new ArrayList <>();
        result.add(allEarlyWarningPiece);
        result.add(shopAvgEarlyWarningPiece);
        result.add(sellEarlyWarningPiece);
        result.add(shopEarlyWarningPiece);
        return result;
    }

    /*
     * 预警柱状图
    public Barchart earlyWarningBarchart(String brandName, String monthData) throws ParseException {
        SellTrendExample sellTrendExample = new SellTrendExample();
        SellTrendExample.Criteria criteria = sellTrendExample.createCriteria();
        criteria.andBrandEqualTo(brandName);
        //处理日期
        String s = DateUtil.jointDate(monthData);
        criteria.andMonthdataEqualTo(s);
        //当下时间品牌数据
        List <SellTrend> currentSellTrends = sellTrendMapper.selectByExample(sellTrendExample);
        //去年同月品牌数据
        SellTrendExample sellTrendExample1 = new SellTrendExample();
        SellTrendExample.Criteria criteria1 = sellTrendExample1.createCriteria();
        criteria1.andBrandEqualTo(brandName);
        int year = DateUtil.getYear(monthData) - 1;
        Integer month = DateUtil.getMonth(monthData);
        String yesteryear = null;
        if (month < 10) {
            yesteryear = year + "-" + "0" + month;
        } else {
            yesteryear = year + "-" + month;
        }
        criteria1.andMonthdataEqualTo(yesteryear);
        List <SellTrend> yesteryearSellTrends = sellTrendMapper.selectByExample(sellTrendExample1);
        //拼接series数据
        //去年
        Series yesteryearSeries = new Series();
        yesteryearSeries.setName(year + "年");
        yesteryearSeries.setType("bar");
        yesteryearSeries.setStack("");
        ArrayList <String> data = new ArrayList <>();
        SellTrend sellTrend = yesteryearSellTrends.get(0);
        data.add(String.valueOf(sellTrend.getClueNumber()));
        data.add(StringUtil.handletoRound(sellTrend.getDealerNumber()));
        data.add(StringUtil.handletoRound(sellTrend.getStoreClueNumber()));
        data.add(String.valueOf(sellTrend.getSellNumber()));
        yesteryearSeries.setData(data);
        //今年
        Series currentSeries = new Series();
        currentSeries.setName(year + 1 + "年");
        currentSeries.setType("bar");
        currentSeries.setStack("");
        ArrayList <String> currentSeriesdata = new ArrayList <>();
        SellTrend currentSeriesSellTrend = currentSellTrends.get(0);
        currentSeriesdata.add(String.valueOf(currentSeriesSellTrend.getClueNumber()));
        currentSeriesdata.add(StringUtil.handletoRound(currentSeriesSellTrend.getDealerNumber()));
        currentSeriesdata.add(StringUtil.handletoRound(currentSeriesSellTrend.getStoreClueNumber()));
        currentSeriesdata.add(String.valueOf(currentSeriesSellTrend.getSellNumber()));
        currentSeries.setData(currentSeriesdata);
        List <Series> list = new ArrayList <>();
        list.add(yesteryearSeries);
        list.add(currentSeries);
        Barchart barchart = jointBarchart(monthData);
        barchart.setSeries(list);
        return barchart;
    }
     */

    /*
     * 拼接柱状图
    private Barchart jointBarchart(String monthData) {
        //拼接数据
        Barchart barchart = new Barchart();
        //年
        String substring = monthData.substring(0, monthData.lastIndexOf("-"));
        //拼接头部
        Legend legend = new Legend();
        List <String> objects = new ArrayList <>();
        objects.add(Integer.parseInt(substring) - 1 + "年");
        objects.add(substring.concat("年"));
        legend.setData(objects);
        barchart.setLegend(legend);
        //拼接Y轴
        YAxis yAxis = new YAxis();
        yAxis.setName("线索数: 条");
        barchart.setyAxis(yAxis);
        //拼接X轴
        List <Data> xAxis = new ArrayList <>();
        List <String> xAxises = new ArrayList <>();
        xAxises.add("总体线索量");
        xAxises.add("店均线索量");
        xAxises.add("销售数据");
        xAxises.add("经销商签约数据");
        Data data = new Data();
        data.setData(xAxises);
        xAxis.add(data);
        barchart.setxAxis(xAxis);
        return barchart;
    }
     */

    /**
     * 拼接头部数据
     */
    private List <THead> montageTHead() {
        //拼接头部数据
        List <THead> list = new ArrayList <>();
        THead is_top = new THead();
        is_top.setProp("isTop");
        is_top.setLabel("是否top");
        is_top.setChildren(null);
        is_top.setFixed(false);
        list.add(is_top);
        THead brand_name = new THead();
        brand_name.setProp("brandName");
        brand_name.setLabel("品牌名称");
        brand_name.setChildren(null);
        brand_name.setFixed(false);
        list.add(brand_name);
        THead trend_decide = new THead();
        trend_decide.setProp("trendDecide");
        trend_decide.setLabel("趋势判断");
        trend_decide.setChildren(null);
        trend_decide.setFixed(false);
        list.add(trend_decide);
        THead shop_sell_difference = new THead();
        shop_sell_difference.setProp("shopSellDifference");
        shop_sell_difference.setLabel("店均线索趋势与销售趋势差值");
        shop_sell_difference.setChildren(null);
        shop_sell_difference.setFixed(false);
        list.add(shop_sell_difference);
        THead total_sell_difference = new THead();
        total_sell_difference.setProp("totalSellDifference");
        total_sell_difference.setLabel("总体线索趋势与销售趋势差值");
        total_sell_difference.setChildren(null);
        total_sell_difference.setFixed(false);
        list.add(total_sell_difference);
        return list;
    }
}
