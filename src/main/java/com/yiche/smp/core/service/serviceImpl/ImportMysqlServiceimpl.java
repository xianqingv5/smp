package com.yiche.smp.core.service.serviceImpl;

import com.yiche.smp.core.service.ImportMySqlService;
import com.yiche.smp.domain.ChannelDetail;
import com.yiche.smp.mapper.ChannelDetailMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/8
 */
@Service
public class ImportMysqlServiceimpl implements ImportMySqlService {
    @Autowired
    private ChannelDetailMapper channelDetailMapper;
    // @Autowired
    // private ChannelQualityMapper channelqualityMapper;

    @Override
    public void importData() {
        File file = new File("E:\\资料\\统计项目资料\\智能投放\\新数据\\渠道质量评估分析明细-报价大全11月样例数据.xlsx");
        try {
            XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
            XSSFSheet sheet = wb.getSheetAt(3);
            for (int i = 20; i < 23; i++) {
                Row row = sheet.getRow(i);
                ChannelDetail channelDetail1 = new ChannelDetail();
                channelDetail1.setChannelId(row.getCell(0).getCellType() == Cell.CELL_TYPE_BLANK?"": row.getCell(0).getStringCellValue());
                channelDetail1.setChannelName(row.getCell(1).getCellType() == Cell.CELL_TYPE_BLANK?"":row.getCell(1).getStringCellValue());
               /* channelDetail1.setNewAcRatio(row.getCell(2).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(2).getNumericCellValue());
                channelDetail1.setNewAcScore(row.getCell(3).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(3).getNumericCellValue());
                channelDetail1.setDaySevenocRatio(row.getCell(4).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(4).getNumericCellValue());
                channelDetail1.setDaySevenocScore(row.getCell(5).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(5).getNumericCellValue());
                channelDetail1.setDaySevenucRatio(row.getCell(6).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(6).getNumericCellValue());
                channelDetail1.setDaySevenucScore(row.getCell(7).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(7).getNumericCellValue());
                */
               if(row.getCell(3) !=null){
                   channelDetail1.setDauRatio(row.getCell(3).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(3).getNumericCellValue());
               }
                channelDetail1.setDauScore(row.getCell(5).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(5).getNumericCellValue());
                channelDetail1.setNewAuNum(row.getCell(6).getCellType() == Cell.CELL_TYPE_BLANK?0:(int) row.getCell(6).getNumericCellValue());
                if(row.getCell(7) !=null){
                    channelDetail1.setNewAuRatio(row.getCell(7).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(7).getNumericCellValue());

                }
                channelDetail1.setNewAuScore(row.getCell(9).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(9).getNumericCellValue());
                if(row.getCell(11) !=null){
                    channelDetail1.setDaySevencnRatio(row.getCell(11).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(11).getNumericCellValue());

                }
                channelDetail1.setDaySevencnScore(row.getCell(13).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(13).getNumericCellValue());
               if(row.getCell(15) !=null){
                   channelDetail1.setDaySevenunRatio(row.getCell(15).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(15).getNumericCellValue());

               }
                channelDetail1.setDaySevenunScore(row.getCell(17).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(17).getNumericCellValue());

                channelDetail1.setMorrowKeepRatio(row.getCell(20).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(20).getNumericCellValue());
                channelDetail1.setMorrowKeepScore(row.getCell(21).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(21).getNumericCellValue());

                channelDetail1.setSevenKeepRatio(row.getCell(23).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(23).getNumericCellValue());
                /*int cellType = row.getCell(24).getCellType();
                System.out.println(cellType);
                System.out.println(Double.valueOf(row.getCell(24).getStringCellValue()));
                System.out.println(DataCalculationUtils.doubleDeal(Double.valueOf(row.getCell(24).getStringCellValue())));

               channelDetail1.setSevenKeepScore(row.getCell(24).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) DataCalculationUtils.doubleDeal(row.getCell(24).getNumericCellValue()));

               */ channelDetail1.setMonthKeepRatio(row.getCell(26).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(26).getNumericCellValue());
                channelDetail1.setMonthKeepScore(row.getCell(27).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(27).getNumericCellValue());

                channelDetail1.setAvgUaTimeRatio(row.getCell(29).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(29).getNumericCellValue());
                channelDetail1.setAvgUaTimeScore(row.getCell(30).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(30).getNumericCellValue());

                channelDetail1.setAvgUaPnRatio(row.getCell(32).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(32).getNumericCellValue());
                channelDetail1.setAvgUaPnScore(row.getCell(33).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(33).getNumericCellValue());

                channelDetail1.setDaySevenbccRatio(row.getCell(36).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(36).getNumericCellValue());
                channelDetail1.setDaySevenbccScore(row.getCell(37).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(37).getNumericCellValue());

                channelDetail1.setDaySevenoucRatio(row.getCell(39).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(39).getNumericCellValue());
                channelDetail1.setDaySevenoucScore(row.getCell(40).getCellType() == Cell.CELL_TYPE_BLANK?0f:(float) row.getCell(40).getNumericCellValue());
                channelDetail1.setPlatform(1);
                channelDetail1.setChannelDate("2017-11");
                channelDetailMapper.insert(channelDetail1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      /*  File file = new File("C:\\Users\\Administrator\\Desktop\\渠道质量评估分析明细-报价大全10月样例数据.xlsx");
        try {
            XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
            XSSFSheet sheet = wb.getSheetAt(2);
            for (int i = 0; i < 30; i++) {
                Row row = sheet.getRow(i);
                ChannelQuality channelDetail1 = new ChannelQuality();
                channelDetail1.setChannelNumber(row.getCell(0).getCellType() == Cell.CELL_TYPE_BLANK ? "" : row.getCell(0).getStringCellValue());
                channelDetail1.setChannelName(row.getCell(1).getCellType() == Cell.CELL_TYPE_BLANK ? "" : row.getCell(1).getStringCellValue());
                channelDetail1.setIndexScore(row.getCell(2).getCellType() == Cell.CELL_TYPE_BLANK ? 0d : (float) row.getCell(2).getNumericCellValue());
                channelDetail1.setNumberScore(row.getCell(3).getCellType() == Cell.CELL_TYPE_BLANK ? 0d : (float) row.getCell(3).getNumericCellValue());
                channelDetail1.setQualityScore(row.getCell(4).getCellType() == Cell.CELL_TYPE_BLANK ? 0d : (float) row.getCell(4).getNumericCellValue());
                channelDetail1.setEfficiencyScore(row.getCell(5).getCellType() == Cell.CELL_TYPE_BLANK ? 0d : (float) row.getCell(5).getNumericCellValue());
                channelDetail1.setTotalScore(row.getCell(6).getCellType() == Cell.CELL_TYPE_BLANK ? 0f : row.getCell(6).getNumericCellValue());
                channelDetail1.setRank(row.getCell(7).getCellType() == Cell.CELL_TYPE_BLANK ? 0 : (int) row.getCell(7).getNumericCellValue());
                channelDetail1.setMonthTime("2017-9");
                channelDetail1.setComeFrom(1);
                channelqualityMapper.insert(channelDetail1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
    }
}
