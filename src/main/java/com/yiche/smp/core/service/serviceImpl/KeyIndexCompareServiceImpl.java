package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.Platform;
import com.yiche.smp.common.StringUtil;
import com.yiche.smp.common.key.index.ratio.TBody;
import com.yiche.smp.common.key.index.ratio.THead;
import com.yiche.smp.core.service.KeyIndexCompareService;
import com.yiche.smp.domain.*;
import com.yiche.smp.mapper.KeyTargetCompareMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/11
 */
@Service
public class KeyIndexCompareServiceImpl implements KeyIndexCompareService {

    // @Autowired
    // private OverviewChannelMapper overviewChannelMapper;
    // @Autowired
    // private ChannelDetailMapper channelDetailMapper;
    @Autowired
    private KeyTargetCompareMapper keyTargetCompareMapper;

    /*
     * 1.0
     * version not use
    @Override
    @Deprecated
    public Map <String, Object> keyIndexCompare(Integer platform, String date) {
        Map <String, Object> map = new HashMap <>();
        //根据平台返回相应平台关键指标环比数据
        OverviewChannelExample overviewChannelExample = new OverviewChannelExample();
        OverviewChannelExample.Criteria criteria = overviewChannelExample.createCriteria();
        criteria.andDataPlatformEqualTo(platform);
        //总的月数据
        List <OverviewChannel> channels = overviewChannelMapper.selectByExample(overviewChannelExample);
        List <THead> tHead = getTHead();
        List <TBody> tBodyList = new ArrayList <>();
        List <TBody> list1 = getBody(platform, "new_au_ratio", date, channelDetailMapper, tBodyList, channels);
        List <TBody> list2 = getBody(platform, "day_sevencn_ratio", date, channelDetailMapper, list1, channels);
        List <TBody> list3 = getBody(platform, "day_sevenun_ratio", date, channelDetailMapper, list2, channels);
        List <TBody> list4 = getBody(platform, "new_ac_ratio", date, channelDetailMapper, list3, channels);
        List <TBody> list5 = getBody(platform, "day_sevenoc_ratio", date, channelDetailMapper, list4, channels);
        List <TBody> list6 = getBody(platform, "seven_keep_ratio", date, channelDetailMapper, list5, channels);
        List <TBody> list7 = getBody(platform, "day_sevenuc_ratio", date, channelDetailMapper, list6, channels);
        List <TBody> list8 = getBody(platform, "day_sevenbcc_ratio", date, channelDetailMapper, list7, channels);
        List <TBody> list9 = getBody(platform, "day_sevenouc_ratio", date, channelDetailMapper, list8, channels);
        map.put("tHead", tHead);
        map.put("tBody", list9);
        return map;
    }
     */

    /**
     * version 1.0 关键指标环比
     */
    @Override
    public Map <String, Object> keyTargetCompare(String platform, String date) {
        Map <String, Object> map = new HashMap <>();
        KeyTargetCompareExample keyTargetCompareExample = new KeyTargetCompareExample();
        KeyTargetCompareExample.Criteria criteria = keyTargetCompareExample.createCriteria();
        criteria.andMonthEqualTo(date);
        if (platform.equals(Platform.yiche.getName())) {
            criteria.andPlatformEqualTo(Platform.yiche.ordinal());
        }
        if (platform.equals(Platform.baojia.getName())) {
            criteria.andPlatformEqualTo(Platform.baojia.ordinal());
        }
        List <KeyTargetCompare> compares = keyTargetCompareMapper.selectByExample(keyTargetCompareExample);
        if (CollectionUtil.listNotNull(compares)) {
            map.put("tHead", getTHead());
            map.put("tBody", getBody(compares));
        } else {
            map.put("tHead", null);
            map.put("tBody", null);
        }
        return map;
    }


    /**
     * 静态头部数据
     */
    private List <THead> getTHead() {
        List <THead> tHeads = new ArrayList <>();
        tHeads.add(new THead("指标类别", "indexCategory"));
        tHeads.add(new THead("细项名称", "detailName"));
        tHeads.add(new THead("月比趋势", "monthTrend"));
        tHeads.add(new THead("月环比", "compareValue"));
        tHeads.add(new THead("易动较大渠道", "changeChannel"));
        return tHeads;
    }

    /**
     * 拼接主体数据
     */
    private List <TBody> getBody(List <KeyTargetCompare> compares) {
        List <TBody> tBodyList = null;
        //单元格合并
        if (CollectionUtil.listNotNull(compares)) {
            List <Integer> rowSpanAndisShow62221 = Arrays.asList(6, 2, 2, 2, 1);
            List <Integer> rowSpanAndisShow11111 = Arrays.asList(1, 1, 1, 1, 1);
            List <Integer> rowSpanAndisShow00001 = Arrays.asList(0, 0, 0, 0, 1);
            List <Integer> rowSpanAndisShow12221 = Arrays.asList(1, 2, 2, 2, 1);
            List <Integer> rowSpanAndisShow01111 = Arrays.asList(0, 1, 1, 1, 1);
            List <Integer> rowSpanAndisShow22221 = Arrays.asList(2, 2, 2, 2, 1);
            List <Integer> rowSpanAndisShow42221 = Arrays.asList(4, 2, 2, 2, 1);
            //处理数据
            tBodyList = new ArrayList <>();
            for (int i = 0; i < compares.size(); i++) {
                TBody tBody = new TBody(compares.get(i).getKeyType(), compares.get(i).getDetailName(), compares.get(i).getMonthCompare() < 0 ? 0 : 1,
                        StringUtil.handleData(compares.get(i).getMonthCompare()), compares.get(i).getChannelName() + "(" + StringUtil.handleData(compares.get(i).getMonthCompare()) + ")");
                switch (i) {
                    case 0:
                        tBody.setRowSpan(rowSpanAndisShow62221);
                        tBody.setIsShow(rowSpanAndisShow11111);
                        break;
                    case 1:
                        tBody.setRowSpan(rowSpanAndisShow11111);
                        tBody.setIsShow(rowSpanAndisShow00001);
                        break;
                    case 2:
                        tBody.setRowSpan(rowSpanAndisShow12221);
                        tBody.setIsShow(rowSpanAndisShow01111);
                        break;
                    case 3:
                        tBody.setRowSpan(rowSpanAndisShow11111);
                        tBody.setIsShow(rowSpanAndisShow00001);
                        break;
                    case 4:
                        tBody.setRowSpan(rowSpanAndisShow12221);
                        tBody.setIsShow(rowSpanAndisShow01111);
                        break;
                    case 5:
                        tBody.setRowSpan(rowSpanAndisShow11111);
                        tBody.setIsShow(rowSpanAndisShow00001);
                        break;
                    case 6:
                        tBody.setRowSpan(rowSpanAndisShow62221);
                        tBody.setIsShow(rowSpanAndisShow11111);
                        break;
                    case 7:
                        tBody.setRowSpan(rowSpanAndisShow11111);
                        tBody.setIsShow(rowSpanAndisShow00001);
                        break;
                    case 8:
                        tBody.setRowSpan(rowSpanAndisShow12221);
                        tBody.setIsShow(rowSpanAndisShow01111);
                        break;
                    case 9:
                        tBody.setRowSpan(rowSpanAndisShow11111);
                        tBody.setIsShow(rowSpanAndisShow00001);
                        break;
                    case 10:
                        tBody.setRowSpan(rowSpanAndisShow12221);
                        tBody.setIsShow(rowSpanAndisShow01111);
                        break;
                    case 11:
                        tBody.setRowSpan(rowSpanAndisShow11111);
                        tBody.setIsShow(rowSpanAndisShow00001);
                        break;
                    case 12:
                        tBody.setRowSpan(rowSpanAndisShow22221);
                        tBody.setIsShow(rowSpanAndisShow11111);
                        break;
                    case 13:
                        tBody.setRowSpan(rowSpanAndisShow11111);
                        tBody.setIsShow(rowSpanAndisShow00001);
                        break;
                    case 14:
                        tBody.setRowSpan(rowSpanAndisShow42221);
                        tBody.setIsShow(rowSpanAndisShow11111);
                        break;
                    case 15:
                        tBody.setRowSpan(rowSpanAndisShow11111);
                        tBody.setIsShow(rowSpanAndisShow00001);
                        break;
                    case 16:
                        tBody.setRowSpan(rowSpanAndisShow12221);
                        tBody.setIsShow(rowSpanAndisShow01111);
                        break;
                    case 17:
                        tBody.setRowSpan(rowSpanAndisShow11111);
                        tBody.setIsShow(rowSpanAndisShow00001);
                        break;
                    default:
                        break;
                }
                tBodyList.add(tBody);
            }
        }
        return tBodyList;
    }

    /*
     * 根据条件查询
     private List <TBody> getBody(Integer platform, String filed, String date,
     ChannelDetailMapper channelDetailMapper, List <TBody> tBodies, List <OverviewChannel> channels) {
     Map <String, Object> map = new HashMap <>();
     map.put("platform", platform);
     map.put("date", date);
     List <Integer> rowSpanAndisShow62221 = new ArrayList <>();
     rowSpanAndisShow62221.add(6);
     rowSpanAndisShow62221.add(2);
     rowSpanAndisShow62221.add(2);
     rowSpanAndisShow62221.add(2);
     rowSpanAndisShow62221.add(1);
     List <Integer> rowSpanAndisShow11111 = new ArrayList <>();
     rowSpanAndisShow11111.add(1);
     rowSpanAndisShow11111.add(1);
     rowSpanAndisShow11111.add(1);
     rowSpanAndisShow11111.add(1);
     rowSpanAndisShow11111.add(1);
     List <Integer> rowSpanAndisShow00001 = new ArrayList <>();
     rowSpanAndisShow00001.add(0);
     rowSpanAndisShow00001.add(0);
     rowSpanAndisShow00001.add(0);
     rowSpanAndisShow00001.add(0);
     rowSpanAndisShow00001.add(1);
     List <Integer> rowSpanAndisShow12221 = new ArrayList <>();
     rowSpanAndisShow12221.add(1);
     rowSpanAndisShow12221.add(2);
     rowSpanAndisShow12221.add(2);
     rowSpanAndisShow12221.add(2);
     rowSpanAndisShow12221.add(1);
     List <Integer> rowSpanAndisShow01111 = new ArrayList <>();
     rowSpanAndisShow01111.add(0);
     rowSpanAndisShow01111.add(1);
     rowSpanAndisShow01111.add(1);
     rowSpanAndisShow01111.add(1);
     rowSpanAndisShow01111.add(1);
     List <Integer> rowSpanAndisShow22221 = new ArrayList <>();
     rowSpanAndisShow22221.add(2);
     rowSpanAndisShow22221.add(2);
     rowSpanAndisShow22221.add(2);
     rowSpanAndisShow22221.add(2);
     rowSpanAndisShow22221.add(1);
     List <Integer> rowSpanAndisShow42221 = new ArrayList <>();
     rowSpanAndisShow42221.add(4);
     rowSpanAndisShow42221.add(2);
     rowSpanAndisShow42221.add(2);
     rowSpanAndisShow42221.add(2);
     rowSpanAndisShow42221.add(1);
     //判断
     switch (filed) {
     case "new_au_ratio":
     map.put("filed", "new_au_ratio");
     List <ChannelDetail> list = null;
     //判断排序方式
     if (channels.get(0).getNewAuRatio() < 0) {
     list = channelDetailMapper.selectChannelDetailByOrderChannelNameAsc(map);
     } else {
     list = channelDetailMapper.selectChannelDetailByOrderChannelNameDesc(map);
     }
     TBody tBody = new TBody();
     tBody.setIndexCategory("数量");
     tBody.setDetailName("新增激活用户数");
     tBody.setCompareValue(channels.get(0).getNewAuRatio() * 100 + "%");
     tBody.setChangeChannel(list.get(0).getChannelName() + "(" + list.get(0).getNewAuRatio() * 100 + "%)");
     tBody.setMonthTrend(channels.get(0).getNewAuRatio() < 0 ? 0 : 1);
     tBody.setRowSpan(rowSpanAndisShow62221);
     tBody.setIsShow(rowSpanAndisShow11111);
     TBody tBody1 = new TBody();
     tBody1.setIndexCategory("数量");
     tBody1.setDetailName("新增激活用户数");
     tBody1.setCompareValue(channels.get(0).getNewAuRatio() * 100 + "%");
     tBody1.setChangeChannel(list.get(1).getChannelName() + "(" + list.get(1).getNewAuRatio() * 100 + "%)");
     tBody1.setMonthTrend(channels.get(0).getNewAuRatio() < 0 ? 0 : 1);
     tBody1.setRowSpan(rowSpanAndisShow11111);
     tBody1.setIsShow(rowSpanAndisShow00001);
     tBodies.add(tBody);
     tBodies.add(tBody1);
     map.remove("filed");
     break;
     case "day_sevencn_ratio":
     map.put("filed", "day_sevencn_ratio");

     List <ChannelDetail> list1 = null;
     if (channels.get(0).getDaySevencnRatio() < 0) {
     list1 = channelDetailMapper.selectChannelDetailByOrderChannelNameAsc(map);
     } else {
     list1 = channelDetailMapper.selectChannelDetailByOrderChannelNameDesc(map);
     }
     TBody tBody2 = new TBody();
     tBody2.setIndexCategory("数量");
     tBody2.setDetailName("当日激活用户7日产生商机数");
     tBody2.setCompareValue(channels.get(0).getDaySevencnRatio() * 100 + "%");
     tBody2.setChangeChannel(list1.get(0).getChannelName() + "(" + list1.get(0).getDaySevencnRatio() * 100 + "%)");
     tBody2.setMonthTrend(channels.get(0).getDaySevencnRatio() < 0 ? 0 : 1);
     tBody2.setRowSpan(rowSpanAndisShow12221);

     tBody2.setIsShow(rowSpanAndisShow01111);
     TBody tBody3 = new TBody();
     tBody3.setIndexCategory("数量");
     tBody3.setDetailName("当日激活用户7日产生商机数");
     tBody3.setCompareValue(channels.get(0).getDaySevencnRatio() * 100 + "%");
     tBody3.setChangeChannel(list1.get(1).getChannelName() + "(" + list1.get(1).getDaySevencnRatio() * 100 + "%)");
     tBody3.setMonthTrend(channels.get(0).getDaySevencnRatio() < 0 ? 0 : 1);
     tBody3.setRowSpan(rowSpanAndisShow11111);
     tBody3.setIsShow(rowSpanAndisShow00001);
     tBodies.add(tBody2);
     tBodies.add(tBody3);
     map.remove("filed");
     break;
     case "day_sevenun_ratio":
     //查询当日激活用户7日产生下单用户数数环比异动较大的渠道(前俩个,重复调用)
     map.remove("filed");
     map.put("filed", "day_sevenun_ratio");
     List <ChannelDetail> list2 = null;
     if (channels.get(0).getDaySevenunRatio() < 0) {
     list2 = channelDetailMapper.selectChannelDetailByOrderChannelNameAsc(map);
     } else {
     list2 = channelDetailMapper.selectChannelDetailByOrderChannelNameDesc(map);
     }
     TBody tBody4 = new TBody();
     tBody4.setIndexCategory("数量");
     tBody4.setDetailName("当日激活用户7日产生下单用户数");
     tBody4.setCompareValue(channels.get(0).getDaySevenunRatio() * 100 + "%");
     tBody4.setChangeChannel(list2.get(0).getChannelName() + "(" + list2.get(0).getDaySevenunRatio() * 100 + "%)");
     tBody4.setMonthTrend(channels.get(0).getDaySevenunRatio() < 0 ? 0 : 1);
     tBody4.setRowSpan(rowSpanAndisShow12221);
     tBody4.setIsShow(rowSpanAndisShow01111);
     TBody tBody5 = new TBody();
     tBody5.setIndexCategory("数量");
     tBody5.setDetailName("当日用户7日产生商机数");
     tBody5.setCompareValue(channels.get(0).getDaySevenunRatio() * 100 + "%");
     tBody5.setChangeChannel(list2.get(1).getChannelName() + "(" + list2.get(1).getDaySevenunRatio() * 100 + "%)");
     tBody5.setMonthTrend(channels.get(0).getDaySevenunRatio() < 0 ? 0 : 1);
     tBody5.setRowSpan(rowSpanAndisShow11111);
     tBody5.setIsShow(rowSpanAndisShow00001);
     tBodies.add(tBody4);
     tBodies.add(tBody5);
     map.remove("filed");
     break;
     case "new_ac_ratio":
     map.remove("filed");
     map.put("filed", "new_ac_ratio");
     List <ChannelDetail> list3 = null;
     if (channels.get(0).getNewAcRatio() < 0) {
     list3 = channelDetailMapper.selectChannelDetailByOrderChannelNameAsc(map);
     } else {
     list3 = channelDetailMapper.selectChannelDetailByOrderChannelNameDesc(map);
     }
     TBody tBody6 = new TBody();
     tBody6.setIndexCategory("成本");
     tBody6.setDetailName("新增激活用户成本");
     tBody6.setCompareValue(channels.get(0).getNewAcRatio() * 100 + "%");
     tBody6.setChangeChannel(list3.get(0).getChannelName() + "(" + list3.get(0).getNewAcRatio() * 100 + "%)");
     tBody6.setMonthTrend(channels.get(0).getNewAcRatio() < 0 ? 0 : 1);
     tBody6.setRowSpan(rowSpanAndisShow62221);
     tBody6.setIsShow(rowSpanAndisShow11111);
     TBody tBody7 = new TBody();
     tBody7.setIndexCategory("成本");
     tBody7.setDetailName("新增激活用户成本");
     tBody7.setCompareValue(channels.get(0).getNewAcRatio() * 100 + "%");
     tBody7.setChangeChannel(list3.get(1).getChannelName() + "(" + list3.get(1).getNewAcRatio() * 100 + "%)");
     tBody7.setMonthTrend(channels.get(0).getNewAcRatio() < 0 ? 0 : 1);
     tBody7.setRowSpan(rowSpanAndisShow11111);
     tBody7.setIsShow(rowSpanAndisShow00001);
     tBodies.add(tBody6);
     tBodies.add(tBody7);
     //查询当日激活用户7日产生商机成本数环比异动较大的渠道(前俩个,重复调用)
     map.remove("filed");
     break;
     case "day_sevenoc_ratio":
     map.put("filed", "day_sevenoc_ratio");
     List <ChannelDetail> list4 = null;
     if (channels.get(0).getDaySevenocRatio() < 0) {
     list4 = channelDetailMapper.selectChannelDetailByOrderChannelNameAsc(map);
     } else {
     list4 = channelDetailMapper.selectChannelDetailByOrderChannelNameDesc(map);
     }
     TBody tBody8 = new TBody();
     tBody8.setIndexCategory("成本");
     tBody8.setDetailName("当日激活用户7日产生商机成本");
     tBody8.setCompareValue(channels.get(0).getDaySevenocRatio() * 100 + "%");
     tBody8.setChangeChannel(list4.get(0).getChannelName() + "(" + list4.get(0).getDaySevenocRatio() * 100 + "%)");
     tBody8.setMonthTrend(channels.get(0).getDaySevenocRatio() < 0 ? 0 : 1);
     tBody8.setRowSpan(rowSpanAndisShow12221);
     tBody8.setIsShow(rowSpanAndisShow01111);
     TBody tBody9 = new TBody();
     tBody9.setIndexCategory("成本");
     tBody9.setDetailName("当日激活用户7日产生商机成本");
     tBody9.setCompareValue(channels.get(0).getDaySevenocRatio() * 100 + "%");
     tBody9.setChangeChannel(list4.get(1).getChannelName() + "(" + list4.get(1).getDaySevenocRatio() * 100 + "%)");
     tBody9.setMonthTrend(channels.get(0).getDaySevenocRatio() < 0 ? 0 : 1);
     tBody9.setRowSpan(rowSpanAndisShow11111);
     tBody9.setIsShow(rowSpanAndisShow00001);
     tBodies.add(tBody8);
     tBodies.add(tBody9);
     //查询当日激活用户7日产生下单成本数环比异动较大的渠道(前俩个,重复调用)
     map.remove("filed");
     break;
     case "day_sevenuc_ratio":
     map.put("filed", "day_sevenuc_ratio");
     List <ChannelDetail> list5 = null;
     if (channels.get(0).getDaySevenucRatio() < 0) {
     list5 = channelDetailMapper.selectChannelDetailByOrderChannelNameAsc(map);
     } else {
     list5 = channelDetailMapper.selectChannelDetailByOrderChannelNameDesc(map);
     }
     TBody tBody10 = new TBody();
     tBody10.setIndexCategory("成本");
     tBody10.setDetailName("当日激活用户7日产生下单成本");
     tBody10.setCompareValue(channels.get(0).getDaySevenucRatio() * 100 + "%");
     tBody10.setChangeChannel(list5.get(0).getChannelName() + "(" + list5.get(0).getDaySevenucRatio() * 100 + "%)");
     tBody10.setMonthTrend(channels.get(0).getDaySevenucRatio() < 0 ? 0 : 1);
     tBody10.setRowSpan(rowSpanAndisShow12221);
     tBody10.setIsShow(rowSpanAndisShow01111);
     TBody tBody11 = new TBody();
     tBody11.setIndexCategory("成本");
     tBody11.setDetailName("当日激活用户7日产生下单成本");
     tBody11.setCompareValue(channels.get(0).getDaySevenucRatio() * 100 + "%");
     tBody11.setChangeChannel(list5.get(1).getChannelName() + "(" + list5.get(1).getDaySevenucRatio() * 100 + "%)");
     tBody11.setMonthTrend(channels.get(0).getDaySevenucRatio() < 0 ? 0 : 1);
     tBody11.setRowSpan(rowSpanAndisShow11111);
     tBody11.setIsShow(rowSpanAndisShow00001);
     tBodies.add(tBody10);
     tBodies.add(tBody11);
     //查询7日留存率环比异动较大的渠道(前俩个,重复调用)
     map.remove("filed");
     break;
     case "seven_keep_ratio":
     map.put("filed", "seven_keep_ratio");
     List <ChannelDetail> list6 = null;
     if (channels.get(0).getSevenKeepRatio() < 0) {
     list6 = channelDetailMapper.selectChannelDetailByOrderChannelNameAsc(map);
     } else {
     list6 = channelDetailMapper.selectChannelDetailByOrderChannelNameDesc(map);
     }
     TBody tBody12 = new TBody();
     tBody12.setIndexCategory("质量");
     tBody12.setDetailName("7日留存率");
     tBody12.setCompareValue(channels.get(0).getSevenKeepRatio() * 100 + "%");
     tBody12.setChangeChannel(list6.get(0).getChannelName() + "(" + list6.get(0).getSevenKeepRatio() * 100 + "%)");
     tBody12.setMonthTrend(channels.get(0).getSevenKeepRatio() < 0 ? 0 : 1);
     tBody12.setRowSpan(rowSpanAndisShow22221);
     tBody12.setIsShow(rowSpanAndisShow11111);
     TBody tBody13 = new TBody();
     tBody13.setIndexCategory("质量");
     tBody13.setDetailName("7日留存率");
     tBody13.setCompareValue(channels.get(0).getSevenKeepRatio() * 100 + "%");
     tBody13.setChangeChannel(list6.get(1).getChannelName() + "(" + list6.get(1).getSevenKeepRatio() * 100 + "%)");
     tBody13.setMonthTrend(channels.get(0).getSevenKeepRatio() < 0 ? 0 : 1);
     tBody13.setRowSpan(rowSpanAndisShow11111);
     tBody13.setIsShow(rowSpanAndisShow00001);
     tBodies.add(tBody12);
     tBodies.add(tBody13);
     //查询当日激活用户7日产生商机转化率环比异动较大的渠道(前俩个,重复调用)
     map.remove("filed");
     break;
     case "day_sevenbcc_ratio":
     map.put("filed", "day_sevenbcc_ratio");
     List <ChannelDetail> list7 = null;
     if (channels.get(0).getDaySevenbccRatio() < 0) {
     list7 = channelDetailMapper.selectChannelDetailByOrderChannelNameAsc(map);
     } else {
     list7 = channelDetailMapper.selectChannelDetailByOrderChannelNameDesc(map);
     }
     TBody tBody14 = new TBody();
     tBody14.setIndexCategory("效率");
     tBody14.setDetailName("当日激活用户7日产生商机转化率");
     tBody14.setCompareValue(channels.get(0).getDaySevenbccRatio() * 100 + "%");
     tBody14.setChangeChannel(list7.get(0).getChannelName() + "(" + list7.get(0).getDaySevenbccRatio() * 100 + "%)");
     tBody14.setMonthTrend(channels.get(0).getDaySevenbccRatio() < 0 ? 0 : 1);
     tBody14.setRowSpan(rowSpanAndisShow42221);
     tBody14.setIsShow(rowSpanAndisShow11111);
     TBody tBody15 = new TBody();
     tBody15.setIndexCategory("效率");
     tBody15.setDetailName("当日激活用户7日产生商机转化率");
     tBody15.setCompareValue(channels.get(0).getDaySevenbccRatio() * 100 + "%");
     tBody15.setChangeChannel(list7.get(1).getChannelName() + "(" + list7.get(1).getDaySevenbccRatio() * 100 + "%)");
     tBody15.setMonthTrend(channels.get(0).getDaySevenbccRatio() < 0 ? 0 : 1);
     tBody15.setRowSpan(rowSpanAndisShow11111);
     tBody15.setIsShow(rowSpanAndisShow00001);
     tBodies.add(tBody14);
     tBodies.add(tBody15);
     //查询当日激活用户7日产生商机转化率环比异动较大的渠道(前俩个,重复调用)
     map.remove("filed");
     break;
     case "day_sevenouc_ratio":
     map.put("filed", "day_sevenouc_ratio");
     List <ChannelDetail> list8 = null;
     if (channels.get(0).getDaySevenoucRatio() < 0) {
     list8 = channelDetailMapper.selectChannelDetailByOrderChannelNameAsc(map);
     } else {
     list8 = channelDetailMapper.selectChannelDetailByOrderChannelNameDesc(map);
     }
     TBody tBody16 = new TBody();
     tBody16.setIndexCategory("效率");
     tBody16.setDetailName("当日激活用户7日产生下单转化率");
     tBody16.setCompareValue(channels.get(0).getDaySevenoucRatio() * 100 + "%");
     tBody16.setChangeChannel(list8.get(0).getChannelName() + "(" + list8.get(0).getDaySevenoucRatio() * 100 + "%)");
     tBody16.setMonthTrend(channels.get(0).getDaySevenoucRatio() < 0 ? 0 : 1);
     tBody16.setRowSpan(rowSpanAndisShow12221);
     tBody16.setIsShow(rowSpanAndisShow01111);
     TBody tBody17 = new TBody();
     tBody17.setIndexCategory("效率");
     tBody17.setDetailName("当日激活用户7日产生下单转化率");
     tBody17.setCompareValue(channels.get(0).getDaySevenoucRatio() * 100 + "%");
     tBody17.setChangeChannel(list8.get(1).getChannelName() + "(" + list8.get(1).getDaySevenoucRatio() * 100 + "%)");
     tBody17.setMonthTrend(channels.get(0).getDaySevenoucRatio() < 0 ? 0 : 1);
     tBody17.setRowSpan(rowSpanAndisShow11111);
     tBody17.setIsShow(rowSpanAndisShow00001);
     tBodies.add(tBody16);
     tBodies.add(tBody17);
     map.remove("filed");
     break;
     default:
     break;
     }
     return tBodies;
     }
     */
}
