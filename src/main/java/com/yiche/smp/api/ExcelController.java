package com.yiche.smp.api;

import com.yiche.smp.domain.ChannelDetail;
import com.yiche.smp.domain.ChannelQuality;
import com.yiche.smp.domain.ImpHoliday;
import com.yiche.smp.domain.SellTrend;
import com.yiche.smp.domain.ShopAvgClues;
import com.yiche.smp.mapper.ChannelDetailMapper;
import com.yiche.smp.mapper.ChannelQualityMapper;
import com.yiche.smp.mapper.ImpHolidayMapper;
import com.yiche.smp.mapper.SellTrendMapper;
import com.yiche.smp.mapper.ShopAvgCluesMapper;
import io.swagger.annotations.Api;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;

import javax.el.ImportHandler;

/**
 * Created by Lenovo on 2017/12/11.
 */
@RestController
@Api("读取excel")
//@Transactional
public class ExcelController {
    @Autowired
    private ShopAvgCluesMapper shopAvgCluesMapper;
    @Autowired
    private SellTrendMapper selltrendMapper;
    @Autowired
    private ChannelQualityMapper channelQualityMapper;
    @Autowired
    private ChannelDetailMapper channelDetailMapper;
    @Autowired
    private ImpHolidayMapper imp;
   /* @RequestMapping("///")
    public void read() throws Exception {
        //file
        File file = new File("C:\\Users\\Lenovo\\Desktop\\数据\\智能投放项目提供数据(1).xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = wb.getSheetAt(2);

        sheet.getRow(2);
        for (int i = 2; i <= 59 ; i++) {
            XSSFRow row = sheet.getRow(i);
            ShopAvgClues shopAvgClues = new ShopAvgClues();
            int cell1 = row.getPhysicalNumberOfCells();
//            System.out.println("每一行的格子数目是："+cell1);
            for (int n=0;n<cell1;n++) {
                XSSFCell cell = row.getCell(n);
                if(n==0){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            shopAvgClues.setIsTop(cell.getRichStringCellValue().getString());
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==0){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            shopAvgClues.setIsTop(cell.getRichStringCellValue().getString());
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==0){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            shopAvgClues.setIsTop(cell.getRichStringCellValue().getString());
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==1){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            shopAvgClues.setBrandName(cell.getRichStringCellValue().getString());
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==2){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            shopAvgClues.setTrendDecide(cell.getRichStringCellValue().getString());
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==3){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setShopSellDifference(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==4){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setTotalSellDifference(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==5){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setSellYesteryearOwt(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==6){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setSell(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==7){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setSellCompare(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==8){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setStoreCluesYesteryearOwt(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==9){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setStoreClues(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==10){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setStoreCluesCompare(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==11){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setAllCluesYesteryearOwt(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==12){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setAllClues(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==13){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYicheCluesCompare(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==14){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setDealerDataYesteryearOwt(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==15){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setDealerData(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==16){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setShopCompare(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==17){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setBaojiaAppYesteryearOwt(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==18){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setBaojiaApp(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==19){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setBaojiaAppCluesCompare(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==20){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYicheAppYesteryearOwt(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==21){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYicheApp(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==22){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYicheAppCluesCompare(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==23){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYichePcYesteryearOwt(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==24){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYichePc(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==25){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYichePcCluesCompare(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==26){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYicheWapYesteryearOwt(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==27){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYicheWap(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==28){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setYicheWapCluesCompare(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==29){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setOtherYesteryearOwt(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==30){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setOther(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                if(n==31){
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getRichStringCellValue().getString());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(String.valueOf(cell.getDateCellValue()));
                            } else {
                                shopAvgClues.setOtherCluesCompare(cell.getNumericCellValue());
                                System.out.print(cell.getNumericCellValue());
                            }
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print("null");
                            System.out.print("|");
                        case Cell.CELL_TYPE_ERROR:
                            System.out.print("");
                            System.out.print("|");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getRichStringCellValue());
                            System.out.print("|");
                            break;
                        default:
                            System.out.print(cell.getRichStringCellValue());
                    }
                }
                shopAvgClues.setCluesDate("2017-10");
            }
            shopAvgCluesMapper.insert(shopAvgClues);
            System.out.println();
        }
    }
    @RequestMapping("impend")
    public void read2() throws Exception {
        //file
        File file = new File("C:\\Users\\Lenovo\\Desktop\\数据\\11智能投放项目提供数据(1).xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = wb.getSheetAt(8);

        sheet.getRow(2357);
        for (int i = 2477; i < 2593; i++) {
            SellTrend selltrend = new SellTrend();
            XSSFRow row = sheet.getRow(i);
            String dateCellValue = row.getCell(0).getRichStringCellValue().getString();
            selltrend.setMonthdata(dateCellValue);
            selltrend.setBrand(row.getCell(1).getRichStringCellValue().getString());
            selltrend.setClueNumber(row.getCell(2).getNumericCellValue());

            selltrend.setDealerNumber(row.getCell(3).getNumericCellValue());
            selltrend.setStoreClueNumber(row.getCell(4).getNumericCellValue());
            XSSFCell cell = row.getCell(5);
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getRichStringCellValue().getString());
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.print(String.valueOf(cell.getDateCellValue()));
                        } else {
                            selltrend.setSellNumber(cell.getNumericCellValue());
                            System.out.print(cell.getNumericCellValue());
                        }
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_BLANK:
                        selltrend.setSellNumber(null);
                        System.out.print("null");
                        System.out.print("|");
                    case Cell.CELL_TYPE_ERROR:
                        System.out.print("");
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        System.out.print(cell.getRichStringCellValue());
                        System.out.print("|");
                        break;
                    default:
                        System.out.print(cell.getRichStringCellValue());
                }
            System.out.println();
            selltrendMapper.insert(selltrend);
        }
    }*/
   // @RequestMapping("/imporlQuality")
    public void read3() throws Exception {
        //file
        File file = new File("E:\\js\\File\\2018-01\\渠道质量评估分析明细-报价大全12月样例数据.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = wb.getSheetAt(1);

        sheet.getRow(1);
        for (int i =2; i < 30; i++) {
            XSSFRow row = sheet.getRow(i);
            ChannelQuality channelQuality = new ChannelQuality();
            channelQuality.setChannelNumber(row.getCell(0).getRichStringCellValue().getString());
            channelQuality.setChannelName(row.getCell(1).getRichStringCellValue().getString());
            channelQuality.setIndexScore(row.getCell(2).getNumericCellValue());
            channelQuality.setNumberScore(row.getCell(3).getNumericCellValue());
            channelQuality.setQualityScore(row.getCell(4).getNumericCellValue());
            channelQuality.setEfficiencyScore(row.getCell(5).getNumericCellValue());
            channelQuality.setTotalScore(row.getCell(6).getNumericCellValue());
            double numericCellValue = row.getCell(7).getNumericCellValue();
            channelQuality.setRank(Double.valueOf(numericCellValue).intValue());
            channelQuality.setScoreChange(null);
//            channelQuality.setScoreChange(Double.valueOf(row.getCell(8).getNumericCellValue()));
            channelQuality.setRankShange(null);
            channelQuality.setMonthTime("2017-11");
            channelQuality.setComeFrom(1);
            channelQuality.setChannelTime("2017-12");
            for(Cell cell: row) {
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getRichStringCellValue().getString());
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.print(String.valueOf(cell.getDateCellValue()));
                        } else {
                            System.out.print(cell.getNumericCellValue());
                        }
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_BLANK:
                        System.out.print("null");
                        System.out.print("|");
                    case Cell.CELL_TYPE_ERROR:
                        System.out.print("");
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        System.out.print(cell.getRichStringCellValue());
                        System.out.print("|");
                        break;
                    default:
                        System.out.print(cell.getRichStringCellValue());
                }
            }
           //channelQualityMapper.insert(channelQuality);
            System.out.println();
        }
             
    }
    //渠道表数据从excel到mysql
    @RequestMapping("/imporlDetail")
    //@Transactional
    public void read4() throws Exception {
        //file
        File file = new File("E:\\js\\File\\2018-01\\渠道质量评估分析明细-报价大全12月样例数据.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
        //获取表中sheet,从0开始
       XSSFSheet sheet = wb.getSheetAt(3);
       //int count = sheet.getLastRowNum();
       int count2 = sheet.getPhysicalNumberOfRows();
      // System.out.println(count+"???");
      // System.out.println(count2);
        //共38行数据
       for (int i =4; i <38; i++) {
           //获取开始行数,从0开始
            XSSFRow row = sheet.getRow(i);
            ChannelDetail channelDetail = new ChannelDetail();
            //row.getCell(0),获取第一列数据,从0开始
            channelDetail.setChannelId(row.getCell(0).getRichStringCellValue().getString());
            channelDetail.setChannelName(row.getCell(1).getRichStringCellValue().getString());
            channelDetail.setDauRatio((float)row.getCell(3).getNumericCellValue()); 
           /* if(row.getCell(3).getCellType()==1){
            	
            	channelDetail.setDauRatio(null); 
            }*/
            channelDetail.setDauScore((float)row.getCell(5).getNumericCellValue());
            channelDetail.setNewAuNum((int)(row.getCell(6).getNumericCellValue()));
            channelDetail.setNewAuRatio((float)row.getCell(7).getNumericCellValue());
            channelDetail.setNewAuScore((float)row.getCell(9).getNumericCellValue());
            channelDetail.setDaySevencnRatio((float)row.getCell(11).getNumericCellValue());
            channelDetail.setDaySevencnScore((float)row.getCell(13).getNumericCellValue());
            channelDetail.setDaySevenunRatio((float)row.getCell(15).getNumericCellValue()); 
            channelDetail.setDaySevenunScore((float)row.getCell(17).getNumericCellValue());
            channelDetail.setMorrowKeepRatio((float)row.getCell(20).getNumericCellValue());
            channelDetail.setMorrowKeepScore((float)row.getCell(21).getNumericCellValue());
            channelDetail.setSevenKeepRatio((float)row.getCell(23).getNumericCellValue());
            //没有Y,跳一列
            channelDetail.setSevenKeepScore((float)(row.getCell(25).getNumericCellValue()));
           System.out.println((float)(row.getCell(25).getNumericCellValue())+"-------");
            
            channelDetail.setMonthKeepRatio((float)row.getCell(27).getNumericCellValue());
            System.out.println((float)row.getCell(27).getNumericCellValue()+"~~");
            channelDetail.setMonthKeepScore((float)row.getCell(28).getNumericCellValue());
             channelDetail.setAvgUaTimeRatio((float)row.getCell(30).getNumericCellValue());
            channelDetail.setAvgUaTimeScore((float)row.getCell(31).getNumericCellValue());
            
            channelDetail.setAvgUaPnRatio((float)row.getCell(33).getNumericCellValue());
            channelDetail.setAvgUaPnScore((float)row.getCell(34).getNumericCellValue());
            
            channelDetail.setDaySevenbccRatio((float)row.getCell(37).getNumericCellValue());
            channelDetail.setDaySevenbccScore((float)row.getCell(38).getNumericCellValue());
            channelDetail.setDaySevenoucRatio((float)row.getCell(40).getNumericCellValue());
            channelDetail.setDaySevenoucScore((float)row.getCell(41).getNumericCellValue());
            channelDetail.setPlatform(1);
            channelDetail.setChannelDate("2017-12");
            /*channelDetail.setMonthKeepRatio((float)row.getCell(26).getNumericCellValue());
            channelDetail.setMonthKeepScore((float)row.getCell(27).getNumericCellValue());
             channelDetail.setAvgUaTimeRatio((float)row.getCell(29).getNumericCellValue());
            channelDetail.setAvgUaTimeScore((float)row.getCell(30).getNumericCellValue());
            
            channelDetail.setAvgUaPnRatio((float)row.getCell(32).getNumericCellValue());
            channelDetail.setAvgUaPnScore((float)row.getCell(33).getNumericCellValue());
            
            channelDetail.setDaySevenbccRatio((float)row.getCell(37).getNumericCellValue());
            channelDetail.setDaySevenbccScore((float)row.getCell(38).getNumericCellValue());
            channelDetail.setDaySevenoucRatio((float)row.getCell(40).getNumericCellValue());
            channelDetail.setDaySevenoucScore((float)row.getCell(41).getNumericCellValue());
            channelDetail.setPlatform(1);
            channelDetail.setChannelDate("2017-12");*/
            
            
           /* channelQuality.setChannelName(row.getCell(1).getRichStringCellValue().getString());
            channelQuality.setIndexScore(row.getCell(2).getNumericCellValue());
            channelQuality.setNumberScore(row.getCell(3).getNumericCellValue());
            channelQuality.setQualityScore(row.getCell(4).getNumericCellValue());
            channelQuality.setEfficiencyScore(row.getCell(5).getNumericCellValue());
            channelQuality.setTotalScore(row.getCell(6).getNumericCellValue());
            double numericCellValue = row.getCell(7).getNumericCellValue();
            channelQuality.setRank(Double.valueOf(numericCellValue).intValue());
            channelQuality.setScoreChange(null);
//            channelQuality.setScoreChange(Double.valueOf(row.getCell(8).getNumericCellValue()));
            channelQuality.setRankShange(null);
            channelQuality.setMonthTime("2017-11");
            channelQuality.setComeFrom(1);
            channelQuality.setChannelTime("2017-12");*/
            /*for(Cell cell: row) {
              switch (cell.getCellType()) {
                case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getRichStringCellValue().getString());
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.print(String.valueOf(cell.getDateCellValue()));
                        } else {
                            System.out.print(cell.getNumericCellValue());
                        }
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_BLANK:
                        System.out.print("null");
                        System.out.print("|");
                    case Cell.CELL_TYPE_ERROR:
                        System.out.print("");
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        System.out.print(cell.getRichStringCellValue());
                        System.out.print("|");
                        break;
                    default:
                        System.out.print(cell.getRichStringCellValue());
                }
            }*/
          //channelDetailMapper.insert(channelDetail);
            System.out.println();
        }
    } 
      //导入节假日到数据库 
       @RequestMapping("/importDate")
       //@Transactional
       public void read5() throws Exception {
           //file
           File file = new File("E:\\date.xlsx");
           XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
           //获取表中sheet,从0开始
          XSSFSheet sheet = wb.getSheetAt(0);
         
          for (int i =0; i <365; i++) {
              //获取开始行数,从0开始
               XSSFRow row = sheet.getRow(i);
               ImpHoliday as = new ImpHoliday();
     
               as.setDate(row.getCell(1).getDateCellValue());
               as.setStatus((byte)(0));
           imp.insert(as);  
              
               
              
          }
    }
}
