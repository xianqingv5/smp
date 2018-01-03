package com.yiche.smp.api;

import com.yiche.smp.common.CluesTrend.ClueTrend;
import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.FileUtils;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.copy.CopyShopAvgClus;
import com.yiche.smp.core.service.AgainstApplyService;
import com.yiche.smp.core.service.AvgCluesTendenService;
import com.yiche.smp.core.service.BoostApplyService;
import com.yiche.smp.domain.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by Lenovo on 2017/12/7.
 */
@RestController
@Api("下载文件")
public class DownloadFileController {
    private Logger logger = LoggerFactory.getLogger(DownloadFileController.class);
    @Autowired
    private BoostApplyService boostApplyService;
    @Autowired
    private AgainstApplyService againstApplyService;
    @Autowired
    private AvgCluesTendenService avgCluesTendenService;

    @RequestMapping(value = "/download/enclosure", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.GET)
    @ApiOperation("反作弊申请中上传附件的下载")
    public void downloadEnclosure(Integer applyId, HttpServletResponse response) {
        if (applyId == null) {
            logger.info("下载上传附件时传入的id为空");
            return;
        }
        //获取上传的附件
        Apply apply = againstApplyService.selectOneById(applyId);
        String enclosure = apply.getEnclosure();
        String enclosureName = apply.getEnclosureName();
        processDownload(response, enclosure, enclosureName);
    }

    @RequestMapping(value = "/download/boost", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.GET)
    @ApiOperation("补量申请过程上传成功表的下载")
    public void downloadBoost(Integer boostId, HttpServletResponse response) {
        if (boostId == null) {
            logger.info("下载上传列表时传入的id为空");
            return;
        }
        //获取上传的文件
        Boost boost = boostApplyService.selectBoostById(boostId);
        String uploadfilepath = boost.getUploadfilepath();
//        uploadfilepath = "E:\\uploadFile\\项目导入步骤.docx";
        String fileName = boost.getFileName();
//        System.out.println(fileName+"---------------------");
        //读取文件到流中
        processDownload(response, uploadfilepath, fileName);
    }

    @RequestMapping(value = "/download/apply", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8")
    @ApiOperation("反作弊过程上传成功表的下载")
    public void downloadApply(Integer applyId, HttpServletResponse response) throws Exception {
        if (applyId == null) {
            logger.info("下载上传列表时传入的id为空");
            return;
        }
        Apply apply = againstApplyService.selectOneById(applyId);
        String uploadfilepath = apply.getUploadFilePath();
        //        uploadfilepath = "E:\\uploadFile\\项目导入步骤.docx";
        String fileName = apply.getFilename();
//        System.out.println(fileName+"---------------------");
        //读取文件到流中
        processDownload(response, uploadfilepath, fileName);
    }

    //到处Excel表格
    @RequestMapping(value = "/exportExcel", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.GET)
    @ApiOperation("导出报表")
    public ResultResponse getExcel(String monthData, HttpServletResponse response, HttpServletRequest request) throws Exception {
        logger.info("传进来的参数是：" + monthData);
        if (monthData == null) {
            logger.info("导出报表时传参时月份为空");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        ClueTrend clueTrendData = avgCluesTendenService.getClueTrendData(monthData);
        if (clueTrendData == null) {
            logger.info("导出报表时根据月份时期查询到了空");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        List <CopyShopAvgClus> shopAvgClues = clueTrendData.gettBody();

        if (shopAvgClues == null) {
            logger.info("导出报表时根据月份时期查询到了空");
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
        }
        //生成Excel文件
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFCellStyle cellStyle = hssfWorkbook.createCellStyle();
        //设置居中
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        HSSFSheet sheet = hssfWorkbook.createSheet("每月店均线索趋势报表");
        sheet.setDefaultColumnStyle(0, cellStyle);
        sheet.setDefaultColumnStyle(1, cellStyle);
        sheet.setDefaultColumnStyle(2, cellStyle);
        sheet.setDefaultColumnStyle(3, cellStyle);
        sheet.setDefaultColumnStyle(4, cellStyle);
        //设置自适应列宽
        sheet.setColumnWidth(1, "店均线索趋势与销售趋势差值".getBytes().length * 2 * 80);
        sheet.setColumnWidth(2, "店均线索趋势与销售趋势差值".getBytes().length * 2 * 80);
        sheet.setColumnWidth(3, "店均线索趋势与销售趋势差值".getBytes().length * 2 * 90);
        sheet.setColumnWidth(4, "店均线索趋势与销售趋势差值".getBytes().length * 2 * 90);
        //表头
        HSSFRow headRow = sheet.createRow(0);
        headRow.createCell(0).setCellValue("是否top");
        headRow.createCell(1).setCellValue("品牌名称");
        headRow.createCell(2).setCellValue("趋势判断");
        headRow.createCell(3).setCellValue("店均线索趋势与销售趋势差值");
        headRow.createCell(4).setCellValue("总体线索趋势与销售趋势差值");
        headRow.createCell(5).setCellValue("销售数据(乘联会)");
        headRow.createCell(6).setCellValue("");
        headRow.createCell(7).setCellValue("销售同比");
        headRow.createCell(8).setCellValue("店均线索数据(已接入数仓)");
        headRow.createCell(9).setCellValue("");
        headRow.createCell(10).setCellValue("店均线索量同比");
        headRow.createCell(11).setCellValue("整体线索数据(后续接入数仓)");
        headRow.createCell(12).setCellValue("");
        headRow.createCell(13).setCellValue("易车线索量同比");
        headRow.createCell(14).setCellValue("经销商签约数据(CRM后续接入数仓)");
        headRow.createCell(15).setCellValue("");
        headRow.createCell(16).setCellValue("门店同比");
        headRow.createCell(17).setCellValue("报价APP");
        headRow.createCell(18).setCellValue("");
        headRow.createCell(19).setCellValue("报价APP");
        headRow.createCell(20).setCellValue("易车APP");
        headRow.createCell(21).setCellValue("");
        headRow.createCell(22).setCellValue("易车APP");
        headRow.createCell(23).setCellValue("易车PC");
        headRow.createCell(24).setCellValue("");
        headRow.createCell(25).setCellValue("易车PC");
        headRow.createCell(26).setCellValue("易车WAP");
        headRow.createCell(27).setCellValue("");
        headRow.createCell(28).setCellValue("易车WAP");
        headRow.createCell(29).setCellValue("其他");
        headRow.createCell(30).setCellValue("");
        headRow.createCell(31).setCellValue("其他");
        //表头第二行
        String[] split = monthData.split("-");
        int year = Integer.parseInt(split[0]) - 1;
        String monthData1 = year + "-" + split[1];
        String month = split[1] + "月";
        HSSFRow headRow1 = sheet.createRow(1);
        headRow1.createCell(0).setCellValue("");
        headRow1.createCell(1).setCellValue("");
        headRow1.createCell(2).setCellValue("");
        headRow1.createCell(3).setCellValue("");
        headRow1.createCell(4).setCellValue("");
        headRow1.createCell(5).setCellValue(monthData1);
        headRow1.createCell(6).setCellValue(monthData);
        headRow1.createCell(7).setCellValue(month);
        headRow1.createCell(8).setCellValue(monthData1);
        headRow1.createCell(9).setCellValue(monthData);
        headRow1.createCell(10).setCellValue(month);
        headRow1.createCell(11).setCellValue(monthData1);
        headRow1.createCell(12).setCellValue(monthData);
        headRow1.createCell(13).setCellValue(month);
        headRow1.createCell(14).setCellValue(monthData1);
        headRow1.createCell(15).setCellValue(monthData);
        headRow1.createCell(16).setCellValue(month);
        headRow1.createCell(17).setCellValue(monthData1);
        headRow1.createCell(18).setCellValue(monthData);
        headRow1.createCell(19).setCellValue("线索量同比");
        headRow1.createCell(20).setCellValue(monthData1);
        headRow1.createCell(21).setCellValue(monthData);
        headRow1.createCell(22).setCellValue("线索量同比");
        headRow1.createCell(23).setCellValue(monthData1);
        headRow1.createCell(24).setCellValue(monthData);
        headRow1.createCell(25).setCellValue("线索量同比");
        headRow1.createCell(26).setCellValue(monthData1);
        headRow1.createCell(27).setCellValue(monthData);
        headRow1.createCell(28).setCellValue("线索量同比");
        headRow1.createCell(29).setCellValue(monthData1);
        headRow1.createCell(30).setCellValue(monthData);
        headRow1.createCell(31).setCellValue("线索量同比");
//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
        sheet.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
        sheet.addMergedRegion(new CellRangeAddress(0, 1, 2, 2));
        sheet.addMergedRegion(new CellRangeAddress(0, 1, 3, 3));
        sheet.addMergedRegion(new CellRangeAddress(0, 1, 4, 4));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 5, 6));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 8, 9));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 11, 12));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 14, 15));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 17, 18));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 20, 21));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 23, 24));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 26, 27));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 29, 30));
        for (CopyShopAvgClus shopAvgClues1 : shopAvgClues) {
            HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
            row.createCell(0).setCellValue(shopAvgClues1.getIsTop());
            row.createCell(1).setCellValue(shopAvgClues1.getBrandName());
            row.createCell(2).setCellValue(shopAvgClues1.getTrendDecide());
            row.createCell(3).setCellValue(shopAvgClues1.getShopSellDifference());
            row.createCell(4).setCellValue(shopAvgClues1.getTotalSellDifference());
            row.createCell(5).setCellValue(shopAvgClues1.getSellYesteryearOwt());
            row.createCell(6).setCellValue(shopAvgClues1.getSell());
            row.createCell(7).setCellValue(shopAvgClues1.getSellCompare());
            row.createCell(8).setCellValue(shopAvgClues1.getStoreCluesYesteryearOwt());
            row.createCell(9).setCellValue(shopAvgClues1.getStoreClues());
            row.createCell(10).setCellValue(shopAvgClues1.getStoreCluesCompare());
            row.createCell(11).setCellValue(shopAvgClues1.getAllCluesYesteryearOwt());
            row.createCell(12).setCellValue(shopAvgClues1.getAllClues());
            row.createCell(13).setCellValue(shopAvgClues1.getYicheCluesCompare());
            row.createCell(14).setCellValue(shopAvgClues1.getDealerDataYesteryearOwt());
            row.createCell(15).setCellValue(shopAvgClues1.getDealerData());
            row.createCell(16).setCellValue(shopAvgClues1.getShopCompare());
            row.createCell(17).setCellValue(shopAvgClues1.getBaojiaAppYesteryearOwt());
            row.createCell(18).setCellValue(shopAvgClues1.getBaojiaApp());
            row.createCell(19).setCellValue(shopAvgClues1.getBaojiaAppCluesCompare());
            row.createCell(20).setCellValue(shopAvgClues1.getYicheAppYesteryearOwt());
            row.createCell(21).setCellValue(shopAvgClues1.getYicheApp());
            row.createCell(22).setCellValue(shopAvgClues1.getYicheAppCluesCompare());
            row.createCell(23).setCellValue(shopAvgClues1.getYichePcYesteryearOwt());
            row.createCell(24).setCellValue(shopAvgClues1.getYichePc());
            row.createCell(25).setCellValue(shopAvgClues1.getYichePcCluesCompare());
            row.createCell(26).setCellValue(shopAvgClues1.getYicheWapYesteryearOwt());
            row.createCell(27).setCellValue(shopAvgClues1.getYicheWap());
            row.createCell(28).setCellValue(shopAvgClues1.getYicheWapCluesCompare());
            row.createCell(29).setCellValue(shopAvgClues1.getOtherYesteryearOwt());
            row.createCell(30).setCellValue(shopAvgClues1.getOther());
            row.createCell(31).setCellValue(shopAvgClues1.getOtherCluesCompare());
        }
        //设置头信息
        response.setContentType("application/vnd.ms-excel");
        String fileName = "每月店均线索趋势报表.xls";
        String agent = request.getHeader("user-agent");
        fileName = FileUtils.encodeDownloadFilename(fileName, agent);
        response.setHeader("Content-Disposition",
                "attachment;filename=" + fileName);
        ServletOutputStream outputStream = response.getOutputStream();
        hssfWorkbook.write(outputStream);
        //关闭
        return null;
    }

    //下载时读取文件到流中
    private void processDownload(HttpServletResponse response, String filePath, String fileName) {
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            //设置头信息
            response.reset();
            response.setContentType("bin");
            response.addHeader("Content-Disposition", "attachment; filename=\"" + URLEncoder.encode(fileName, "UTF-8") + "\"");
            //循环取流中的数据
            byte[] b = new byte[100];
            int len;
            while ((len = inputStream.read(b)) > 0) {
                response.getOutputStream().write(b, 0, len);
            }
            inputStream.close();
        } catch (IOException e) {
            logger.error("出现了异常：", e.getMessage(), e);
            return;
        }
    }
}
