package com.yiche.smp.api;

import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.cluecost.*;
import com.yiche.smp.common.util.DataCalculationUtils;
import com.yiche.smp.core.service.ClueTotalTrendService;
import com.yiche.smp.domain.ClueCost;
import com.yiche.smp.domain.ClueNumber;
import com.yiche.smp.domain.ClueServiceConsume;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@Api(value = "线索及成本整体趋势相关数据")
@RequestMapping("/intelligent")
public class ClueTotalTrendController {
    @Autowired
    private ClueTotalTrendService clueTotalTrendService;

    @RequestMapping(value = "/getWholeClueTrend", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "获取整体消费和线索量")
    public ResultResponse getClueNumberAndClueSerConsume() {
        Map<String, Object> map = clueTotalTrendService.selectAllClueNumberAndClueSerConsume();
        Map<String, Object> resultMap = new HashMap<>();
        List<ClueNumber> clueNumber = (List<ClueNumber>) map.get("clueNumber");
        List<ClueServiceConsume> clueSerConsume = (List<ClueServiceConsume>) map.get("clueSerConsume");
        List<ClueCost> clueCosts = clueTotalTrendService.selectAllClueCost();
        if (CollectionUtil.listNotNull(clueNumber) || CollectionUtil.listNotNull(clueSerConsume)) {
            resultMap.put("clueNumber", getClueNumber(clueNumber, clueSerConsume));
        } else {
            resultMap.put("clueNumber", null);
        }
        if (CollectionUtil.listNotNull(clueCosts)) {
            resultMap.put("cluePrice", getcluePriceAll(clueCosts, null));
        } else {
            resultMap.put("cluePrice", null);
        }
        return ResultResponse.success(resultMap);
    }

    @RequestMapping(value = "/getPlatClueTrend", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "获取线索平台整体数据")
    public ResultResponse getCluePlantData(@RequestBody CluePlantDataParam cluePlantDataParam) {
        if (cluePlantDataParam == null) {
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        Map<String, Object> plantData = clueTotalTrendService.selectAllCluePlantData(cluePlantDataParam);
        Map<String, Object> resultMap = new HashMap<>();
        List<ClueServiceConsume> clueSerConsume = (List<ClueServiceConsume>) plantData.get("clueSerConsume");
        List<ClueNumber> clueNumber = (List<ClueNumber>) plantData.get("clueNumber");
        List<ClueCost> clueCost = (List<ClueCost>) plantData.get("clueCost");
        if (CollectionUtil.listNotNull(clueNumber) || CollectionUtil.listNotNull(clueSerConsume)) {
            resultMap.put("clueNumber", getClueNumber(clueNumber, clueSerConsume));
        } else {
            resultMap.put("clueNumber", null);
        }
        if (CollectionUtil.listNotNull(clueCost)) {
            resultMap.put("cluePrice", getcluePriceAll(clueCost, cluePlantDataParam.getPlatName()));
        } else {
            resultMap.put("cluePrice", null);
        }
        return ResultResponse.success(resultMap);
    }

    @ApiOperation(value = "获取线索量及消费数据")
    private Map<String, Object> getClueNumber(List<ClueNumber> clueNumber, List<ClueServiceConsume> clueSerConsume) {
        List<ClueBarGraphSubtitle> clueBarGraphSubtitles = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ClueBarGraphSubtitle clueBarGraphSubtitle = new ClueBarGraphSubtitle();
            if (i == 0) {
                clueBarGraphSubtitle.setName("线索合计");
                clueBarGraphSubtitle.setIcon("rect");
            } else {
                clueBarGraphSubtitle.setName("总消费");
                clueBarGraphSubtitle.setIcon("rect");
            }
            clueBarGraphSubtitles.add(clueBarGraphSubtitle);
        }
        Map<String, Object> clueBarMap = new HashMap<>();
        clueBarMap.put("data", clueBarGraphSubtitles);
        Map<String, Object> allMap = new HashMap<>();
        allMap.put("legend", clueBarMap);
        Map<String, Object> monthYearMap = new HashMap<>();
        List<ClueNumberAndConsumeData> clueNumberAndConsumeDatas = new ArrayList<>();
        List<ClueBarCraphYaxisData> clueBarCraphYaxisDatas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ClueNumberAndConsumeData clueNumberAndConsumeData = new ClueNumberAndConsumeData();
            ClueBarCraphYaxisData clueBarCraphYaxisData = new ClueBarCraphYaxisData();
            if (i != 0) {
                String[] monthYear = null;
                if (clueNumber != null) {
                    monthYear = new String[clueNumber.size()];
                    double[] clueNum = new double[clueNumber.size()];
                    for (int j = 0; j < clueNumber.size(); j++) {
                        clueNum[j] = DataCalculationUtils.div(clueNumber.get(j).getNumvalue(), 10000.0, 2);
                        String[] split = clueNumber.get(j).getNummonthyear().split("-");
                        String month = split[1];
                        if ("0".equals(month.subSequence(0, 1))) {
                            monthYear[j] = split[0] + "-" + month.substring(1);
                        } else {
                            monthYear[j] = clueNumber.get(j).getNummonthyear();
                        }
                    }
                    clueNumberAndConsumeData.setData(clueNum);
                    clueNumberAndConsumeData.setName("线索合计");
                    clueNumberAndConsumeData.setType("line");
                    clueNumberAndConsumeData.setyAxisIndex(1);
                    clueNumberAndConsumeDatas.add(clueNumberAndConsumeData);
                    clueBarCraphYaxisData.setMin(10);
                    clueBarCraphYaxisData.setMax(700);
                    clueBarCraphYaxisData.setInterval(138);
                    clueBarCraphYaxisData.setyAxisIndex(1);
                    clueBarCraphYaxisData.setName("线索合计:万");
                    clueBarCraphYaxisDatas.add(clueBarCraphYaxisData);
                }
                monthYearMap.put("data", monthYear);
            } else {
                if (clueSerConsume != null) {
                    double[] clueSer = new double[clueSerConsume.size()];
                    for (int j = 0; j < clueSerConsume.size(); j++) {
                        clueSer[j] = DataCalculationUtils.div(clueSerConsume.get(j).getValue(), 1000000.0, 2);
                    }
                    clueNumberAndConsumeData.setData(clueSer);
                    clueNumberAndConsumeData.setName("总消费");
                    clueNumberAndConsumeData.setType("bar");
                    clueNumberAndConsumeData.setyAxisIndex(0);
                    clueNumberAndConsumeDatas.add(clueNumberAndConsumeData);
                    clueBarCraphYaxisData.setMin(1);
                    clueBarCraphYaxisData.setMax(120);
                    clueBarCraphYaxisData.setName("总消费:百万");
                    clueBarCraphYaxisData.setyAxisIndex(0);
                    clueBarCraphYaxisData.setInterval(23.8);
                    clueBarCraphYaxisDatas.add(clueBarCraphYaxisData);
                }
            }
        }
        allMap.put("series", clueNumberAndConsumeDatas);
        List<Object> xAxisList = new ArrayList<>();
        xAxisList.add(monthYearMap);
        allMap.put("xAxis", xAxisList);
        allMap.put("yAxis", clueBarCraphYaxisDatas);
        return allMap;
    }

    @ApiOperation(value = "获取线索单价")
    private Map<String, Object> getcluePriceAll(List<ClueCost> clueCosts, String plantName) {
        Map<String, Object> allMap = new HashMap<>();
        if (clueCosts != null) {
            Map<String, Object> trendMap = new HashMap<>();
            trendMap.put("trend", "线索增长趋势，成本呈现平稳态");
            trendMap.put("detail", "Q3环比Q2，线索上升16.6%，费用下降15.6% ，成本下降27.6%");
            if (plantName == null) {
                trendMap.put("name", "整体趋势");
            } else {
                trendMap.put("name", plantName);
            }
            allMap.put("modTitle", trendMap);
            Map<String, Object> textMap = new HashMap<>();
            textMap.put("text", "总体线索单价(元)");
            Map<String, Object> contentMap = new HashMap<>();
            contentMap.put("title", textMap);
            List<CluePrinceData> cluePrinceList = new ArrayList<>();
            CluePrinceData cluePrince = new CluePrinceData();
            cluePrince.setName("总体线索单价");
            cluePrince.setType("bar");
            Map<String, Object> normalInnerMap = new HashMap<>();
            normalInnerMap.put("show", true);
            normalInnerMap.put("position", "top");
            Map<String, Object> normalMap = new HashMap<>();
            normalMap.put("normal", normalInnerMap);
            cluePrince.setLable(normalMap);
            int[] clueCost = new int[clueCosts.size()];
            String[] monthYear = new String[clueCosts.size()];
            for (int i = 0; i < clueCosts.size(); i++) {
                clueCost[i] = new Double(clueCosts.get(i).getCostvalue()).intValue();
                String[] split = clueCosts.get(i).getCostmonthyear().split("-");
                String month = split[1];
                if ("0".equals(month.subSequence(0, 1))) {
                    monthYear[i] = split[0] + "-" + month.substring(1);
                } else {
                    monthYear[i] = clueCosts.get(i).getCostmonthyear();
                }
            }
            cluePrince.setData(clueCost);
            cluePrinceList.add(cluePrince);
            contentMap.put("series", cluePrinceList);
            Map<String, Object> monthYearMap = new HashMap<>();
            monthYearMap.put("data", monthYear);
            List<Object> monthYearList = new ArrayList<>();
            monthYearList.add(monthYearMap);
            contentMap.put("xAxis", monthYearList);
            Map<String, Object> yAxisMap = new HashMap<>();
            yAxisMap.put("show", false);
            yAxisMap.put("name", "总体线索单价");
            List<Object> yAxisList = new ArrayList<>();
            yAxisList.add(yAxisMap);
            contentMap.put("yAxis", yAxisList);
            allMap.put("cluenPriceChart", contentMap);
        }
        return allMap;
    }
}
