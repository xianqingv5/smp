package com.yiche.smp.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.yiche.smp.domain.ImpHoliday;

/**
 * 日期格式化工具类
 */
public class DateParseUtil {
    public static Date dateTodate(Date date, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        String str = sdf.format(date);
        try {
            date = sdf.parse(str);
        } catch (Exception e) {
            return null;
        }
        return date;
    }

    public static String StringtoString(String s) throws Exception{
    	
    
	
    	Date date = new SimpleDateFormat("yyyyMMdd").parse(s);
			String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(date);
		
		
		return dateStr;
    }
    
    
    public static String dateTostring(Date date, String formatStr) {
        String strDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        strDate = sdf.format(date);
        return strDate;
    }


    /**
     * @param dateString Thu May 18 2017 00:00:00 GMT+0800 (中国标准时间)
     * @return "2017-10";
     */
    public static String parseTimeMonth(String dateString) {
        Date date = StrintParseToDate(dateString);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        return sdf.format(date);

    }

    /**
     * @param dateString Thu May 18 2017 00:00:00 GMT+0800 (CST)
     * @return "2017-10-11";
     */
    public static String parseTime(String dateString) {
        Date date = StrintParseToDate(dateString);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);

    }

    /**
     * @param dateString "Thu May 18 2017 00:00:00 GMT+0800 (CST)";
     * @return "2017/10/12"
     */
    public static String parseDate(String dateString) {
        Date date = StrintParseToDate(dateString);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(date);
    }

    private static Date StrintParseToDate(String dateString) {
        dateString = dateString.replace("GMT", "").replaceAll("\\(.*\\)", "");
        //将字符串转化为date类型，格式2016-10-12
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss z", Locale.ENGLISH);
        Date dateTrans = null;
        try {
            dateTrans = format.parse(dateString);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = sdf.format(dateTrans);
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    //获取前一天
    public static String DatetoString(Date date){
    	SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
    	
          Calendar calendar = Calendar.getInstance();  
          calendar.setTime(date);  
          calendar.add(Calendar.DAY_OF_MONTH, -1);  
          date = calendar.getTime();  
          //System.out.println(sdf.format(date));  
     return sdf.format(date); 
    }
    
    
   //校验String是否为指定的日期格式
    public static boolean isValidDate(String str) {
        boolean convertSuccess = true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        try {
            // 设置lenient为false.
            // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }
    
  //获取当前系统前一天日期
    public static Date getNextDay1(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.DAY_OF_MONTH, -1);  
        date = calendar.getTime();  
        return date;  
    } 
    //  获取当前系统当天日期
    public static Date getNextDay2(Date date) { 
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.DAY_OF_MONTH, 0);  
        date = calendar.getTime();  
        return date;  
    }  

	//获取当前系统下一天日期
    public static Date getNextDay3(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.DAY_OF_MONTH, 1);  
        date = calendar.getTime();  
        return date;  
    } 
   // 获取当前日期可上传日期时间集合
    public static List<Date> dateHoliday(ImpHoliday datenow,ImpHoliday datefront,ImpHoliday datelater){
    	Date now = datenow.getDate();
    	Byte statusnow = datenow.getStatus();
    	Date front = datefront.getDate();
    	Byte statusfront = datefront.getStatus();
    	Date later = datelater.getDate();
    	Byte statuslater = datelater.getStatus();
    	
    	List<Date> list = new ArrayList<Date>();
    	
    	if(statusnow==1&&statusfront==0){
    		list.add(front);
    	}
    	if(statusnow==0&&statusfront==1){
    		list.add(front);
    		list.add(getNextDay1(front));
    		list.add(getNextDay1(getNextDay1(front)));
    	}
    	if(statusnow==1&&statusfront==1){
    		list.add(front);
    		list.add(getNextDay1(front));
    		
    	}
    	if(statusnow==0&&statusfront==0){
    		list.add(front);
    		
    	}
    	
    	
    	return list;
    }
    
    
    
    
   public static void main(String[] args) throws Exception { 
	try {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				String value="2019-01-01";
				Date parse = df.parse(value);
				System.out.println(parse);
				getNextDay1(parse);
				System.out.println((getNextDay1(parse)));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   String parseTime = StringtoString("20180306");
	   System.out.println(parseTime);
	   boolean validDate = isValidDate("20180228");
	   System.out.println(validDate);
} 
}
