package com.yiche.smp;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiche.smp.domain.ChannelQuality;
import com.yiche.smp.mapper.ChannelQualityMapper;
import com.yiche.smp.mapper.SellTrendMapper;
import com.yiche.smp.mapper.ShopAvgCluesMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application.properties"})
public class ImportExcel {
	     @Autowired
	    private ShopAvgCluesMapper shopAvgCluesMapper;
	    @Autowired
	    private SellTrendMapper selltrendMapper;
	    @Autowired
	    private ChannelQualityMapper channelQualityMapper;

   // public static void main(String[] args) throws IOException {
	    
	  // @RequestMapping("/imporlQuality")
	    public void read3() throws Exception {
       /* //file
        File file = new File("E:\\微信接收\\File\\2018-01\\渠道质量评估分析明细-报价大全12月样例数据.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = wb.getSheetAt(0);

        //for (int i = 2; i <= 30 ; i++) {
        XSSFRow row = sheet.getRow(1);
        for (Cell cell : row) {
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
            //  }
            System.out.println();
        }*/

        /*//读取图片
        List<XSSFPictureData> pictures = wb.getAllPictures();
        for (int i = 0; i < pictures.size(); i++) {
            XSSFPictureData pictureData = pictures.get(i);
            byte[] picData = pictureData.getData();
            System.out.println("image-size:" + picData.length);
        }*/
    	
    	
    	
    	 //file
        File file = new File("E:\\微信接收\\File\\2018-01\\渠道质量评估分析明细-报价大全12月样例数据.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = wb.getSheetAt(2);

        sheet.getRow(1);
        for (int i =1; i < 30; i++) {
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
            channelQualityMapper.insert(channelQuality);
            System.out.println();
        }
    }
}