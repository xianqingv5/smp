package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.CluesTrend.ClueTrend;
import com.yiche.smp.common.CluesTrend.THead;
import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.TrendJudgeEnum;
import com.yiche.smp.common.copy.CopyShopAvgClus;
import com.yiche.smp.core.service.AvgCluesTendenService;
import com.yiche.smp.domain.ShopAvgClues;
import com.yiche.smp.domain.ShopAvgCluesExample;
import com.yiche.smp.mapper.ShopAvgCluesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * funtion:店均线索趋势
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
@Service
public class AvgCluesTendenServiceImpl implements AvgCluesTendenService {
    @Autowired
    private ShopAvgCluesMapper shopAvgCluesMapper;

    public ClueTrend getClueTrendData(String month) {
        List <THead> tHeads = montageTHead(month);
        //获取body数据
        ShopAvgCluesExample shopAvgCluesExample = new ShopAvgCluesExample();
        ShopAvgCluesExample.Criteria criteria = shopAvgCluesExample.createCriteria();
        criteria.andCluesDateEqualTo(month);
        List <ShopAvgClues> shopAvgClues = shopAvgCluesMapper.selectByExample(shopAvgCluesExample);
        List <CopyShopAvgClus> shopAvgCluses = new ArrayList <>();
        for (ShopAvgClues shopAvgClues1 : shopAvgClues) {
            String trendDecide = null;
            if (shopAvgClues1.getTrendDecide().equals(TrendJudgeEnum.conform.getCode())) {
                trendDecide = TrendJudgeEnum.conform.getMessage();
            } else if (shopAvgClues1.getTrendDecide().equals(TrendJudgeEnum.exceed.getCode())) {
                trendDecide = TrendJudgeEnum.exceed.getMessage();
            } else if (shopAvgClues1.getTrendDecide().equals(TrendJudgeEnum.underShopAdd.getCode())) {
                trendDecide = TrendJudgeEnum.underShopAdd.getMessage();
            } else if (shopAvgClues1.getTrendDecide().equals(TrendJudgeEnum.underClueInsufficient.getCode())) {
                trendDecide = TrendJudgeEnum.underClueInsufficient.getMessage();
            } else if (shopAvgClues1.getTrendDecide().equals(TrendJudgeEnum.underClueDecline.getCode())) {
                trendDecide = TrendJudgeEnum.underClueDecline.getMessage();
            }
            shopAvgCluses.add(new CopyShopAvgClus(shopAvgClues1.getId(),
                    shopAvgClues1.getIsTop(), shopAvgClues1.getBrandName(),
                    trendDecide,
                    String.valueOf(shopAvgClues1.getShopSellDifference()),
                    String.valueOf(shopAvgClues1.getTotalSellDifference()),
                    String.valueOf(shopAvgClues1.getSellYesteryearOwt()),
                    String.valueOf(shopAvgClues1.getSell()),
                    String.valueOf(shopAvgClues1.getSellCompare()),
                    String.valueOf(shopAvgClues1.getStoreCluesYesteryearOwt()),
                    String.valueOf(shopAvgClues1.getStoreClues()),
                    String.valueOf(shopAvgClues1.getStoreCluesCompare()),
                    String.valueOf(shopAvgClues1.getAllCluesYesteryearOwt()),
                    String.valueOf(shopAvgClues1.getAllClues()),
                    String.valueOf(shopAvgClues1.getYicheCluesCompare()),
                    String.valueOf(shopAvgClues1.getDealerDataYesteryearOwt()),
                    String.valueOf(shopAvgClues1.getDealerData()),
                    String.valueOf(shopAvgClues1.getShopCompare()),
                    String.valueOf(shopAvgClues1.getBaojiaAppYesteryearOwt()),
                    String.valueOf(shopAvgClues1.getBaojiaApp()),
                    String.valueOf(shopAvgClues1.getBaojiaAppCluesCompare()),
                    String.valueOf(shopAvgClues1.getYicheAppYesteryearOwt()),
                    String.valueOf(shopAvgClues1.getYicheApp()),
                    String.valueOf(shopAvgClues1.getYicheAppCluesCompare()),
                    String.valueOf(shopAvgClues1.getYichePcYesteryearOwt()),
                    String.valueOf(shopAvgClues1.getYichePc()),
                    String.valueOf(shopAvgClues1.getYichePcCluesCompare()),
                    String.valueOf(shopAvgClues1.getYicheWapYesteryearOwt()),
                    String.valueOf(shopAvgClues1.getYicheWap()),
                    String.valueOf(shopAvgClues1.getYicheWapCluesCompare()),
                    String.valueOf(shopAvgClues1.getOtherYesteryearOwt()),
                    String.valueOf(shopAvgClues1.getOther()),
                    String.valueOf(shopAvgClues1.getOtherCluesCompare()),
                    shopAvgClues1.getCluesDate()));
        }
        //封装对象
        ClueTrend clueTrend = new ClueTrend();
        if (CollectionUtil.listNotNull(shopAvgClues)) {
            clueTrend.settHead(tHeads);
            clueTrend.settBody(shopAvgCluses);
            return clueTrend;
        }
        clueTrend.settHead(null);
        clueTrend.settBody(null);
        return clueTrend;
    }


    private List <THead> montageTHead(String month) {
        //校验月份数据
        String year = month.substring(0, month.lastIndexOf("-"));
        String charmonth = month.substring(month.lastIndexOf("-"));
        //拼接头部数据
        List <THead> list = new ArrayList <>();
        THead is_top = new THead();
        is_top.setProp("isTop");
        is_top.setLabel("是否top");
        is_top.setChildren(null);
        is_top.setFixed(true);
        list.add(is_top);
        THead brand_name = new THead();
        brand_name.setProp("brandName");
        brand_name.setLabel("品牌名称");
        brand_name.setChildren(null);
        brand_name.setFixed(true);
        list.add(brand_name);
        THead trend_decide = new THead();
        trend_decide.setProp("trendDecide");
        trend_decide.setLabel("趋势判断");
        trend_decide.setChildren(null);
        trend_decide.setFixed(true);
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

        //有分支
        THead all_sell1 = new THead();
        all_sell1.setProp("all_sells");
        all_sell1.setLabel("销售数据(乘联会)");
        List <THead> all_sell = new ArrayList <>();
        THead tHead1 = new THead("sellYesteryearOwt", Integer.parseInt(year) - 1 + charmonth, null, false);
        THead tHead2 = new THead("sell", month, null, false);
        all_sell.add(tHead1);
        all_sell.add(tHead2);
        all_sell1.setChildren(all_sell);
        all_sell1.setFixed(false);
        list.add(all_sell1);
        //销售同比
        THead sell_compare = new THead();
        sell_compare.setProp("sellCompare");
        sell_compare.setLabel("销售同比");
        sell_compare.setChildren(null);
        sell_compare.setFixed(false);
        list.add(sell_compare);
        //店均线索数据(已接入数仓)
        //有分支
        THead all_store_clues1 = new THead();
        all_store_clues1.setProp("all_store_cluess");
        all_store_clues1.setLabel("销售数据(乘联会)");
        List <THead> all_store_clues = new ArrayList <>();
        THead tHead3 = new THead("storeCluesYesteryearOwt", Integer.parseInt(year) - 1 + charmonth, null, false);
        THead tHead4 = new THead("storeClues", month, null, false);
        all_store_clues.add(tHead3);
        all_store_clues.add(tHead4);
        all_store_clues1.setChildren(all_store_clues);
        all_store_clues1.setFixed(false);
        list.add(all_store_clues1);
        //店均线索量同比
        THead store_clues_compare = new THead();
        store_clues_compare.setProp("storeCluesCompare");
        store_clues_compare.setLabel("店均线索量同比");
        store_clues_compare.setChildren(null);
        store_clues_compare.setFixed(false);
        list.add(store_clues_compare);
        //整体线索数据(后续接入数仓)
        //有分支
        THead all_clues1 = new THead();
        all_clues1.setProp("all_cluess");
        all_clues1.setLabel("销售数据(乘联会)");
        List <THead> all_clues = new ArrayList <>();
        THead tHead5 = new THead("allCluesYesteryearOwt", Integer.parseInt(year) - 1 + charmonth, null, false);
        THead tHead6 = new THead("allClues", month, null, false);
        all_clues.add(tHead5);
        all_clues.add(tHead6);
        all_clues1.setChildren(all_clues);
        all_clues1.setFixed(false);
        list.add(all_clues1);
        //易车线索量同比
        THead yiche_clues_compare = new THead();
        yiche_clues_compare.setProp("yicheCluesCompare");
        yiche_clues_compare.setLabel("易车线索量同比");
        yiche_clues_compare.setChildren(null);
        yiche_clues_compare.setFixed(false);
        list.add(yiche_clues_compare);
        //经销商签约数据(CRM后续接入数仓)
        //有分支
        THead dealer_data1 = new THead();
        dealer_data1.setProp("dealer_datas");
        dealer_data1.setLabel("经销商签约数据(CRM后续接入数仓)");
        List <THead> dealer_data = new ArrayList <>();
        THead tHead7 = new THead("dealerDataYesteryearOwt", Integer.parseInt(year) - 1 + charmonth, null, false);
        THead tHead8 = new THead("dealerData", month, null, false);
        dealer_data.add(tHead7);
        dealer_data.add(tHead8);
        dealer_data1.setChildren(dealer_data);
        dealer_data1.setFixed(false);
        list.add(dealer_data1);
        //门店同比
        THead shop_compare = new THead();
        shop_compare.setProp("shopCompare");
        shop_compare.setLabel("门店同比");
        shop_compare.setChildren(null);
        shop_compare.setFixed(false);
        list.add(shop_compare);
        //报价APP
        //有分支
        THead baojia_apps = new THead();
        baojia_apps.setProp("baojia_apps");
        baojia_apps.setLabel("报价APP");
        List <THead> baojia_app = new ArrayList <>();
        THead tHead9 = new THead("baojiaAppYesteryearOwt", Integer.parseInt(year) - 1 + charmonth, null, false);
        THead tHead10 = new THead("baojiaApp", month, null, false);
        baojia_app.add(tHead9);
        baojia_app.add(tHead10);
        baojia_apps.setChildren(baojia_app);
        baojia_apps.setFixed(false);
        list.add(baojia_apps);
        //报价APP线索量同比
        THead baojia_app_clues_compare = new THead();
        baojia_app_clues_compare.setProp("baojiaAppCluesCompare");
        baojia_app_clues_compare.setLabel("报价APP线索量同比");
        baojia_app_clues_compare.setChildren(null);
        baojia_app_clues_compare.setFixed(false);
        list.add(baojia_app_clues_compare);
        //易车APP
        //有分支
        THead yiche_apps = new THead();
        yiche_apps.setProp("yiche_apps");
        yiche_apps.setLabel("易车APP");
        List <THead> yiche_app = new ArrayList <>();
        THead tHead11 = new THead("yicheAppYesteryearOwt", Integer.parseInt(year) - 1 + charmonth, null, false);
        THead tHead12 = new THead("yicheApp", month, null, false);
        yiche_app.add(tHead11);
        yiche_app.add(tHead12);
        yiche_apps.setChildren(yiche_app);
        yiche_apps.setFixed(false);
        list.add(yiche_apps);
        //易车APP线索量同比
        THead yiche_app_clues_compare = new THead();
        yiche_app_clues_compare.setProp("yicheAppCluesCompare");
        yiche_app_clues_compare.setLabel("易车APP线索量同比");
        yiche_app_clues_compare.setChildren(null);
        yiche_app_clues_compare.setFixed(false);
        list.add(yiche_app_clues_compare);
        //易车PC
        //有分支
        THead yiche_pcs = new THead();
        yiche_pcs.setProp("yiche_pcs");
        yiche_pcs.setLabel("易车PC");
        List <THead> yiche_pc = new ArrayList <>();
        THead tHead13 = new THead("yichePcYesteryearOwt", Integer.parseInt(year) - 1 + charmonth, null, false);
        THead tHead14 = new THead("yichePc", month, null, false);
        yiche_pc.add(tHead13);
        yiche_pc.add(tHead14);
        yiche_pcs.setChildren(yiche_pc);
        yiche_pcs.setFixed(false);
        list.add(yiche_pcs);
        //易车PC线索量同比
        THead yiche_pc_clues_compare = new THead();
        yiche_pc_clues_compare.setProp("yichePcCluesCompare");
        yiche_pc_clues_compare.setLabel("易车PC线索量同比");
        yiche_pc_clues_compare.setChildren(null);
        yiche_pc_clues_compare.setFixed(false);
        list.add(yiche_pc_clues_compare);
        //易车WAP
        //有分支
        THead yiche_waps = new THead();
        yiche_waps.setProp("yiche_waps");
        yiche_waps.setLabel("易车WAP");
        List <THead> yiche_wap = new ArrayList <>();
        THead tHead15 = new THead("yicheWapYesteryearOwt", Integer.parseInt(year) - 1 + charmonth, null, false);
        THead tHead16 = new THead("yicheWap", month, null, false);
        yiche_wap.add(tHead15);
        yiche_wap.add(tHead16);
        yiche_waps.setChildren(yiche_wap);
        yiche_waps.setFixed(false);
        list.add(yiche_waps);
        //易车WAP线索量同比
        THead yiche_wap_clues_compare = new THead();
        yiche_wap_clues_compare.setProp("yicheWapCluesCompare");
        yiche_wap_clues_compare.setLabel("易车WAP线索量同比");
        yiche_wap_clues_compare.setChildren(null);
        yiche_wap_clues_compare.setFixed(false);
        list.add(yiche_wap_clues_compare);
        //其他
        //有分支
        THead others1 = new THead();
        others1.setProp("otherss");
        others1.setLabel("其它");
        List <THead> others = new ArrayList <>();
        THead tHead17 = new THead("otherYesteryearOwt", Integer.parseInt(year) - 1 + charmonth, null, false);
        THead tHead18 = new THead("other", month, null, false);
        others.add(tHead17);
        others.add(tHead18);
        others1.setChildren(others);
        others1.setFixed(false);
        list.add(others1);
        //其他线索量同比
        THead other_clues_compare = new THead();
        other_clues_compare.setProp("otherCluesCompare");
        other_clues_compare.setLabel("其他线索量同比");
        other_clues_compare.setChildren(null);
        other_clues_compare.setFixed(false);
        list.add(other_clues_compare);
        return list;
    }
}
