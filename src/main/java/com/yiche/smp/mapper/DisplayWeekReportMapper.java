package com.yiche.smp.mapper;

import com.yiche.smp.common.GatherYicheAPP;
import com.yiche.smp.common.YichePlatform;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by xuhaiqiang on 2018/3/16
 */
@Repository
public interface DisplayWeekReportMapper {
    public GatherYicheAPP selectSumDataWeek(Map<String, String> map);

    public GatherYicheAPP selectPlatformDataWeek(Map<String, String> map);

    public List<YichePlatform> selectplatformChannelDataWeek(Map<String, String> map);

    public List<YichePlatform> selectPcwapchannelDataWeek(Map<String, String> map);

    public List<YichePlatform> selectThirdPartychannelDataWeek(Map<String, String> map);

     int insertPcwapWeekReport(YichePlatform yichePlatform);

     int insertQuoteWeekReport(YichePlatform yichePlatform);

     int insertyicheWeekReport(YichePlatform yichePlatform);

     int insertThirdWeekReport(YichePlatform yichePlatform);

     String selectlastWeek();
}
