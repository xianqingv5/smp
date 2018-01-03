package com.yiche.smp.mapper;

import com.yiche.smp.domain.City;
import com.yiche.smp.domain.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    //批量添加
    int addCityList(@Param("cityList")List<City> cityList);
    //批量修改
    int updateCityList(@Param("cityList")List<City> cityList);
    //批量删除【根据补量申请ID】
    int deleteCityList(@Param("boostId")Integer boostId);
    int countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);
}