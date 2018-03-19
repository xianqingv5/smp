package com.yiche.smp.api;

import com.yiche.smp.common.*;
import com.yiche.smp.core.service.CreateReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by xuhaiqiang on 2018/3/13
 */
@RestController
@Api("生成相应报表")
public class CreateReportController2 {

    private Logger logger = LoggerFactory.getLogger(CreateReportController2.class);

    @Autowired
    private CreateReportService createReportService;

    @RequestMapping(value = "/exportSumExcel", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation("导出相应渠道消耗汇总报表")
    public ResultResponse getExcel(@RequestBody ReportCondition reportCondition, HttpServletResponse response, HttpServletRequest request) throws Exception {
        logger.info("传进来的参数是：" + reportCondition);
        if (reportCondition!=null){
            //获取platformName
            String platformName = reportCondition.getPlatformName();
            if (platformName==null){
                logger.info("导出报表时传参时平台名为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            //获取channelName
            String channelName = reportCondition.getChannelName();
            if (channelName==null){
                logger.info("导出报表时传参时渠道名为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            //获取开始时间
            String startTime = reportCondition.getStartTime();
            if (startTime==null){
                logger.info("导出报表时传参时开始时间为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            //获取结束时间
            String endTime = reportCondition.getEndTime();
            if (endTime==null){
                logger.info("导出报表时传参时结束时间为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            //获取是否是明细
            int isDetail=reportCondition.getIsDetail();

            //生成Excel文件
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
            HSSFCellStyle cellStyle = hssfWorkbook.createCellStyle();

            //设置居中
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
            HSSFSheet sheet = hssfWorkbook.createSheet("123");
            sheet.setDefaultColumnStyle(0, cellStyle);
            sheet.setDefaultColumnStyle(1, cellStyle);
            sheet.setDefaultColumnStyle(2, cellStyle);
            sheet.setDefaultColumnStyle(3, cellStyle);
            sheet.setDefaultColumnStyle(4, cellStyle);
            sheet.setDefaultColumnStyle(5, cellStyle);
            sheet.setDefaultColumnStyle(6, cellStyle);

            //表头
            HSSFRow headRow = sheet.createRow(0);
            headRow.createCell(0).setCellValue("平台名称");
            headRow.createCell(1).setCellValue("渠道名称");
            headRow.createCell(2).setCellValue("线索量");
            headRow.createCell(3).setCellValue("线索用户");
            headRow.createCell(4).setCellValue("消耗");
            headRow.createCell(5).setCellValue("线索单价");
            headRow.createCell(6).setCellValue("用户单价");

            List<GatherYicheAPP> channelConsumeData = createReportService.getChannelConsumeData(platformName, channelName, startTime, endTime, isDetail);
            for (GatherYicheAPP gatherYicheAPP:channelConsumeData){
                HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
                row.createCell(0).setCellValue(gatherYicheAPP.getPlatformName());
                row.createCell(1).setCellValue(gatherYicheAPP.getChannelName());
                row.createCell(2).setCellValue(gatherYicheAPP.getLeadsCnt());
                row.createCell(3).setCellValue(gatherYicheAPP.getLeadsUserCnt());
                row.createCell(4).setCellValue(200f);
                row.createCell(5).setCellValue(gatherYicheAPP.getLeadsCnt()/200f);
                row.createCell(6).setCellValue(gatherYicheAPP.getLeadsUserCnt()/200f);
                if (isDetail==0){
                    row.createCell(7).setCellValue(gatherYicheAPP.getBt());
                }
            }
            response.setContentType("application/vnd.ms-excel");
            String fileName = "店均线索趋势报表.xls";
            String agent = request.getHeader("user-agent");
            fileName = FileUtils.encodeDownloadFilename(fileName, agent);
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + fileName);
            ServletOutputStream outputStream = response.getOutputStream();
            hssfWorkbook.write(outputStream);
            //关闭
            return null;
        }
        return ResultResponse.error();
    }

}