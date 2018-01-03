package com.yiche.smp.core.service;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/5
 */
public interface CarDataService {

    //String findAllCarType();

    String findAllBrandData();

    String findAllManufacturer();

    String findBrandByid(String id);

    String findAllCarTypeByid(String id);

}
