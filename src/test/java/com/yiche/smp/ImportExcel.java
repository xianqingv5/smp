package com.yiche.smp;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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


    public static void main(String[] args) throws IOException {
        //file
        File file = new File("C:\\Users\\Administrator\\Desktop\\渠道质量评估分析明细-报价大全10月样例数据.xlsx");
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
        }

        /*//读取图片
        List<XSSFPictureData> pictures = wb.getAllPictures();
        for (int i = 0; i < pictures.size(); i++) {
            XSSFPictureData pictureData = pictures.get(i);
            byte[] picData = pictureData.getData();
            System.out.println("image-size:" + picData.length);
        }*/
    }
}