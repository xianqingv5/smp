package com.yiche.smp.mapper;


        import org.springframework.stereotype.Repository;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.YichePlatform;

import java.util.List;
        import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/9
 */

@Repository
public interface DisplayDayReportMapper {
    /**
     * 用于计算总量
     * @param map
     * @return
     */
    GatherYicheAPP getSumDataDay(Map<String,String> map);

    /**
     * 用于计算各平台总量
     * @param map
     * @return
     */
    GatherYicheAPP getPlatformDataDay(Map<String,String> map);

    /**
     * 用于计算易车APP,报价APP平台的详细数据
     * @param map
     * @return
     */
    List<YichePlatform> getplatformChannelDataDay(Map<String,String> map);

    /**
     * 用于计算pcwap平台的详细数据
     * @param map
     * @return
     */
    List<YichePlatform> getPcwapchannelDataDay(Map<String,String> map);


}
