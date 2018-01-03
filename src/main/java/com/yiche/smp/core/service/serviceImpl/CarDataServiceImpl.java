package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.core.dao.CarDataDao;
import com.yiche.smp.core.service.CarDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/5
 */
@Service
public class CarDataServiceImpl implements CarDataService {

    @Autowired
    private CarDataDao carDataDao;

    /*public String findAllCarType() {
        return carDataDao.findAllCarType();
    }*/

    @Override
    public String findAllBrandData() {
        return carDataDao.findAllBrandData();
    }

    @Override
    public String findAllManufacturer() {
        return carDataDao.findAllManufacturer();
    }

    @Override
    public String findBrandByid(String id) {
        return carDataDao.findBrandByid(id);
    }

    @Override
    public String findAllCarTypeByid(String id) {
        return carDataDao.findAllCarTypeByid(id);
    }

}
