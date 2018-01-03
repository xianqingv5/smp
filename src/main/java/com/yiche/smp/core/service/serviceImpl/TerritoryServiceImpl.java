package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.core.dao.TerritoryDao;
import com.yiche.smp.core.service.TerritoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/6
 */
@Service
public class TerritoryServiceImpl implements TerritoryService {
    @Autowired
    private TerritoryDao territoryDao;

    @Override
    public String findProvince() {
        return territoryDao.findProvince();
    }

    @Override
    public String findProvinceByid(String id) {
        return territoryDao.findProvinceByid("id", id);
    }
}
