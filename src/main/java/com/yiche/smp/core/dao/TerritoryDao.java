package com.yiche.smp.core.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/6
 */
@FeignClient(value = "${report.server.name}")
public interface TerritoryDao {

    @RequestMapping(value = "/metadata/enum/getDetailByPrefix/total?prefix=indexProvince", method = RequestMethod.GET)
    String findProvince();

    @RequestMapping(value = "/metadata/enum/getDetailByProperty", method = RequestMethod.GET)
    String findProvinceByid(@RequestParam(value = "propertyKey") String propertyKey, @RequestParam(value = "propertyValue") String propertyValue);
}
