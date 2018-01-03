package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.common.cluecost.OverViewVO;
import com.yiche.smp.core.service.OverViewService;
import com.yiche.smp.domain.OverView;
import com.yiche.smp.mapper.OverViewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class OverViewServiceImpl implements OverViewService{
    @Autowired
    private OverViewMapper overViewMapper;

    @Override
    public Map<String,Object> selectOverViewByYearMonth(String yearMonth) {
        OverView overView = overViewMapper.selectOverViewByYearMonth(yearMonth);
        Map<String, Object> map = new HashMap<>();
        List<OverViewVO> list = new ArrayList<>();
        if(overView !=null){
            setOverViewVoList(list,overView.getClueServeyMonth(),overView.getClueServey());
            setOverViewVoList(list,overView.getClueTrendMonth(),overView.getClueTrend());
            setOverViewVoList(list,overView.getEarlyWarnMonth(),overView.getEarlyWarn());
            setOverViewVoList(list,overView.getLackBrandMonth(),overView.getLackBrand());
        }
        map.put("data",list);
        return map;
    }

    private void setOverViewVoList(List<OverViewVO> list,String name,String description){
        OverViewVO overViewVO = new OverViewVO();
        overViewVO.setName(name);
        overViewVO.setDescription(description);
        list.add(overViewVO);
    }
}
