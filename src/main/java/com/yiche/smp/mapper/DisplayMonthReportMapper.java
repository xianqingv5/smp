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
public interface DisplayMonthReportMapper {

    public GatherYicheAPP selectSumDataMonth(Map<String, String> map);

    public GatherYicheAPP selectPlatformDataMonth(Map<String, String> map);

    public List<YichePlatform> selectplatformChannelDataMonth(Map<String, String> map);

    public List<YichePlatform> selectPcwapchannelDataMonth(Map<String, String> map);

    public List<YichePlatform> selectThirdPartychannelDataMonth(Map<String, String> map);

    int insertPcwapMonthReport(YichePlatform yichePlatform);

    int insertQuoteMonthReport(YichePlatform yichePlatform);

    int insertyicheMonthReport(YichePlatform yichePlatform);

    int insertThirdMonthReport(YichePlatform yichePlatform);

    String selectLastMonth();
}
