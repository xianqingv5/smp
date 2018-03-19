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

    public GatherYicheAPP getSumDataDay(Map<String,String> map);

    public GatherYicheAPP getPlatformDataDay(Map<String,String> map);

    public List<YichePlatform> getplatformChannelDataDay(Map<String,String> map);

    public List<YichePlatform> getPcwapchannelDataDay(Map<String,String> map);


}
