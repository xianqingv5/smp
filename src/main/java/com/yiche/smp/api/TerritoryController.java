package com.yiche.smp.api;

import com.alibaba.fastjson.JSON;
import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.StringUtil;
import com.yiche.smp.common.euraka.data.Data;
import com.yiche.smp.common.euraka.data.EurekaDataDispose;
import com.yiche.smp.core.service.CarDataService;
import com.yiche.smp.core.service.TerritoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.Map;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/6
 */
@RestController
@Api(value = "地域接口")
@RequestMapping("/intelligent")
public class TerritoryController {
    @Autowired
    private TerritoryService territoryService;
    @Autowired
    private CarDataService carDataService;

    @RequestMapping(value = "/getProvincesData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("所有省级数据")
    public ResultResponse findProvince() {
        String province = territoryService.findProvince();
        EurekaDataDispose eurekaDataDispose = JSON.parseObject(province, EurekaDataDispose.class);
        //排序
        LinkedList <Data> data1 = eurekaDataDispose.getData();
        LinkedList <Data> data2 = StringUtil.chineseSort(data1);
        eurekaDataDispose.setData(data2);
        Data data = new Data("0", "请选择省份");
        eurekaDataDispose.getData().addFirst(data);
        return ResultResponse.success(eurekaDataDispose);
    }

    @RequestMapping(value = "/getCitysData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("当前省级下的市级数据")
    public ResultResponse findCityByid(@RequestBody Map <String, String> map) {
        if (CollectionUtil.notEmpty(map)) {
            String id = map.get("id");
            String allCarTypeByid = carDataService.findAllCarTypeByid(id);
            EurekaDataDispose eurekaDataDispose = JSON.parseObject(allCarTypeByid, EurekaDataDispose.class);
            //判断获得的数据是否空
            if (!CollectionUtil.listNotNull(eurekaDataDispose.getData())) {
                //处理几个特殊区域
                //查询所有省
                String province = territoryService.findProvince();
                EurekaDataDispose allProvince = JSON.parseObject(province, EurekaDataDispose.class);
                //获取集合
                for (Data data : allProvince.getData()) {
                    if (data.getId().equals(id)) {
                        LinkedList <Data> list = new LinkedList <>();
                        list.add(new Data(data.getId(), data.getName()));
                        eurekaDataDispose.setData(list);
                        break;
                    }
                }
            } else {
                //排序
                LinkedList <Data> data1 = eurekaDataDispose.getData();
                LinkedList <Data> data2 = StringUtil.chineseSort(data1);
                eurekaDataDispose.setData(data2);
            }
            Data data = new Data("0", "请选择城市");
            eurekaDataDispose.getData().addFirst(data);
            return ResultResponse.success(eurekaDataDispose);
        }
        return ResultResponse.error();
    }
}
