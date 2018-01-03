package com.yiche.smp.api;

import com.alibaba.fastjson.JSON;
import com.yiche.smp.common.CollectionUtil;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.StringUtil;
import com.yiche.smp.common.euraka.data.Data;
import com.yiche.smp.common.euraka.data.EurekaDataDispose;
import com.yiche.smp.core.service.CarDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.Map;

/**
 * function:
 *
 * @Author wangyb
 * @Date 2017/12/5
 */
@RestController
@Api(value = "车相关数据")
@RequestMapping("/intelligent")
public class CarDataController {

    @Autowired
    private CarDataService carTypeService;


    @RequestMapping(value = "/getBrandsData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "查询所有品牌")
    public ResultResponse getAllBrandData() {
        String json = carTypeService.findAllBrandData();
        EurekaDataDispose eurekaDataDispose = JSON.parseObject(json, EurekaDataDispose.class);

        LinkedList <Data> data1 = eurekaDataDispose.getData();
        LinkedList <Data> data2 = StringUtil.chineseSort(data1);
        eurekaDataDispose.setData(data2);
        Data data = new Data("0", "请选择品牌");
        eurekaDataDispose.getData().addFirst(data);
        return ResultResponse.success(eurekaDataDispose);
    }

    @RequestMapping(value = "/getManufacturerData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "查询该品牌下所有的厂商")
    public ResultResponse getAllManufacturerByBrand(@RequestBody Map <String, String> map) {
        if (CollectionUtil.notEmpty(map)) {
            String id = map.get("id");
            String CarTypeByid = carTypeService.findAllCarTypeByid(id);
            EurekaDataDispose eurekaDataDispose = JSON.parseObject(CarTypeByid, EurekaDataDispose.class);
            //排序
            LinkedList <Data> data1 = eurekaDataDispose.getData();
            LinkedList <Data> data2 = StringUtil.chineseSort(data1);

            Data data = new Data("0", "请选择厂商");
            eurekaDataDispose.setData(data2);
            eurekaDataDispose.getData().addFirst(data);
            return ResultResponse.success(eurekaDataDispose);
        }
        return ResultResponse.error();
    }

    @RequestMapping(value = "/getCarmodels", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "查询厂商下所有的车系车型")
    public ResultResponse findAllCarTypeByid(@RequestBody Map <String, String> map) {
        if (CollectionUtil.notEmpty(map)) {
            String id = map.get("id");
            String CarTypeByid = carTypeService.findAllCarTypeByid(id);
            EurekaDataDispose eurekaDataDispose = JSON.parseObject(CarTypeByid, EurekaDataDispose.class);
            //排序
            LinkedList <Data> data1 = eurekaDataDispose.getData();
            LinkedList <Data> data2 = StringUtil.chineseSort(data1);
            eurekaDataDispose.setData(data2);
            Data data = new Data("0", "请选择车型");
            eurekaDataDispose.getData().addFirst(data);
            return ResultResponse.success(eurekaDataDispose);
        }
        return ResultResponse.error();
    }


    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有车型")
    public String findAllCarType() {
        return carTypeService.findAllCarType();
    }*/


   /* @RequestMapping(value = "/getManufacturerData", method = RequestMethod.POST)
    @ApiOperation(value = "查询所有厂商")
    public ResultResponse findAllManufacturer() {
        String json = carTypeService.findAllManufacturer();
        EurekaDataDispose eurekaDataDispose = JSON.parseObject(json, EurekaDataDispose.class);
        Data data = new Data("0", "请选择厂商");
        eurekaDataDispose.getData().addFirst(data);
        return ResultResponse.success(eurekaDataDispose);
    }*/

    /*@RequestMapping(value = "/getBrandsData", method = RequestMethod.POST)
    @ApiOperation(value = "查询厂商所属的品牌")
    public ResultResponse findAllBrandByid(@RequestBody Map <String, String> map) {
        if (CollectionUtil.notEmpty(map)) {
            String id = map.get("id");
            String brandByid = carTypeService.findBrandByid(id);
            EurekaDataDispose eurekaDataDispose = JSON.parseObject(brandByid, EurekaDataDispose.class);
            Data data = new Data("0", "请选择品牌");
            eurekaDataDispose.getData().addFirst(data);
            return ResultResponse.success(eurekaDataDispose);
        }
        return ResultResponse.error();
    }*/

}
