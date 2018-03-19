package com.yiche.smp.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yiche.smp.common.DataName;
import com.yiche.smp.common.DateParseUtil;
import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.uploadexcel.ReplaceVo;
import com.yiche.smp.common.uploadexcel.UploadExcelData;
import com.yiche.smp.common.util.UploadDataUtil;
import com.yiche.smp.core.service.FileExcleService;
import com.yiche.smp.core.service.ImPlatformService;
import com.yiche.smp.core.service.UserService;
import com.yiche.smp.core.service.ImpChannelConsumeDataSerivce;
import com.yiche.smp.core.service.ImpHolidayService;
import com.yiche.smp.domain.ImpChannelConsumeData;
import com.yiche.smp.domain.ImpChannelConsumeDataExample;
import com.yiche.smp.domain.ImpHoliday;
import com.yiche.smp.domain.ImpPlatform;
import com.yiche.smp.domain.User;
import com.yiche.smp.domain.YicheAppAppLeadsChannelDay;
import com.yiche.smp.domain.YicheAppAppLeadsChannelDayExample;
import com.yiche.smp.domain.YichePcwapAppLeadsChannelDay;
import com.yiche.smp.domain.YicheQuoteAppLeadsChannelDay;
import com.yiche.smp.mapper.ImpChannelConsumeDataMapper;
import com.yiche.smp.mapper.ImpHolidayMapper;
import com.yiche.smp.mapper.YicheAppAppLeadsChannelDayMapper;
import com.yiche.smp.mapper.YichePcwapAppLeadsChannelDayMapper;
import com.yiche.smp.mapper.YicheQuoteAppLeadsChannelDayMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@Api(value = "渠道消耗数据上传列表")
@PropertySource("classpath:uploadFile.properties")
@RequestMapping("/intelligent")
public class FileExcelController {
	private Logger logger = LoggerFactory.getLogger(FileExcelController.class);
	@Autowired
	private ImpChannelConsumeDataSerivce impChannelConsumeDataSerivce;
	@Autowired
	private UserService userService;
	@Autowired
	private ImPlatformService imPlatformService;
	@Autowired
	private ImpChannelConsumeDataMapper impMapper;
	@Autowired
	private YicheAppAppLeadsChannelDayMapper ycappmapper;
	@Autowired
	private YicheQuoteAppLeadsChannelDayMapper ycqappmapper;
	@Autowired
	private YichePcwapAppLeadsChannelDayMapper ycwappmapper;
	@Autowired
	private ImpHolidayService imPholisayService;
	@Value("${Exceluploadpath}")
	private String Exceluploadpath;

	@RequestMapping(value = "/selectUser", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			+ ";charset=utf-8", method = RequestMethod.POST)
	@ApiOperation(value = "代上传人列表")
	public ResultResponse selectUser() {
		Map<String, Object> map = new HashMap<>();

		map.put("data", userService.selectUser());

		return ResultResponse.success(map);
	}

	@RequestMapping(value = "/uploadExcelData", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			+ ";charset=utf-8", method = RequestMethod.POST)
	@ApiOperation(value = "文件上传")
	public ResultResponse uploadExcelData(UploadExcelData data, MultipartFile file, HttpServletRequest request,
			HttpSession session) {

		/**
		 * 校验数据文件名中三个部分的合理性；
		 */
		if (file == null) {
			logger.info("上传的文件为空");
			return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
		}
		List<ImpPlatform> list = imPlatformService.selectImPlatform();
		String name = file.getOriginalFilename();
		User user = (User) session.getAttribute("user");
		String[] names = name.split("-");
		// 平台名称
		String platname = names[0];
		// 责任人
		String username = names[2].substring(0, names[2].indexOf("."));
		// 日期
		String datename = names[1];
		//扩展名
		String subsing = name.substring(name.lastIndexOf(".") + 1);
		if(!subsing.equals("xlsx")){
			return ResultResponse.fail(DataName.FileFormatError);
		}
		
		List<Object> listname = new ArrayList<>();
		for (ImpPlatform implat : list) {
			listname.add(implat.getPlatformname());
		}
		if (!listname.contains(platname)) {
			return ResultResponse.fail(DataName.NameError);
		}
		boolean validDate = DateParseUtil.isValidDate(datename);
		if (validDate == false) {
			return ResultResponse.fail(DataName.DateError);
		}
		List<ReplaceVo> userlist = userService.selectUser();
		boolean b = false;
		for (ReplaceVo replaceVo : userlist) {
			if (replaceVo.getUserid().equals(username)) {
				b = true;
				break;
			}
		}
		if (!b) {
			return ResultResponse.fail(DataName.UserError);
		}

		if (data.getOpinion().equals("否")) {
			// 获取用户角色
			String userid = user.getUserid();
			if (!userid.equals(username)) {
				return ResultResponse.fail(DataName.DiffError);
			}

		}
		if (data.getOpinion().equals("是")) {
			if (!username.equals(data.getUserid())) {
				return ResultResponse.fail(DataName.NobelongError);
			}

		}
		
		//检测是否上传前一天的数据,同时加入节假日校验
		Date now = new Date();
		Date dateto = DateParseUtil.dateTodate(now, "yyyy-MM-dd");
		List<Date> listdate = new ArrayList<Date>();
		List<Date> dayto = dayto(listdate, dateto);
		List<String> stringtime = new ArrayList<>();
		for (Date date2 : dayto) {
			String dateTostring = DateParseUtil.dateTostring(date2, "yyyyMMdd");
			stringtime.add(dateTostring);
		}
		if(!stringtime.contains(datename)){
			return ResultResponse.fail(DataName.ChooseError);
		}
		
		//表上传到服务器
		Map<String, String> map;
		ImpChannelConsumeData imp = new ImpChannelConsumeData();
		try {
			map = UploadDataUtil.processUpload(file, Exceluploadpath);
			imp.setFilename(name);
			imp.setSavefilenmae(map.get("localfileName"));
			imp.setUploadtime(new Date());
			imp.setOperator(user.getUserid());
			imp.setFilepath(map.get("path"));
			imp.setStatus(true);
			imp.setMessage("成功");
			impMapper.insert(imp);
		} catch (IOException e) {
			logger.error("出现了异常：", e.getMessage(), e);
			return ResultResponse.fail(ErrorCodeMessage.FILEUPLOAD_ERROR);
		}
		
		//校验文件内数据内容日期是否和文件名填写的一致
		//XSSFWorkbook xw;
		try {
			File f = new File(imp.getFilepath());
			//xw = new XSSFWorkbook(new FileInputStream(f));	
			Workbook xw = WorkbookFactory.create(new FileInputStream(f));
	        if (xw instanceof XSSFWorkbook) {   //07版excel处理方法
	            XSSFWorkbook xWb = (XSSFWorkbook) xw;
	           
	        }else if(xw instanceof HSSFWorkbook){  //03版以后的excel处理方法
	            HSSFWorkbook hWb = (HSSFWorkbook) xw;
	        }
			// 获取表中sheet,从0开始
			Sheet sh = xw.getSheetAt(0);
			int RowNum = sh.getLastRowNum()+1;
			// int numberOfRows = sheet.getPhysicalNumberOfRows()-1;
			Boolean flag = false;
			for (int ii = 1; ii < RowNum; ii++) {
				Row r = sh.getRow(ii);
				Date d = r.getCell(0).getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String format = sdf.format(d);
					if(!format.equals(DateParseUtil.StringtoString(datename))){
						flag = true;
						break;
					}
			}
			if(flag){
			imp.setStatus(false);
			imp.setMessage("文件内日期与上传日期不符");
			ImpChannelConsumeDataExample example = new ImpChannelConsumeDataExample();
			example.createCriteria().andSavefilenmaeEqualTo(map.get("localfileName"));
			impMapper.updateByExampleSelective(imp, example);
			return ResultResponse.fail(DataName.FileError);
			}
		}catch (Exception e1) {
			imp.setStatus(false);
			imp.setMessage("读取excel文件失败,请检查文件格式");
			ImpChannelConsumeDataExample example = new ImpChannelConsumeDataExample();
			example.createCriteria().andSavefilenmaeEqualTo(map.get("localfileName"));
			impMapper.updateByExampleSelective(imp, example);
			e1.printStackTrace();
			return ResultResponse.fail(DataName.FileError);
		}

		try {
			if (platname.equals("易车APP")) {
				File file1 = new File(imp.getFilepath());
				XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file1));
				// 获取表中sheet,从0开始
				XSSFSheet sheet = wb.getSheetAt(0);
				int lastRowNum = sheet.getLastRowNum()+1;
				// int numberOfRows = sheet.getPhysicalNumberOfRows()-1;
				for (int i = 1; i < lastRowNum; i++) {
					YicheAppAppLeadsChannelDay ycapp = new YicheAppAppLeadsChannelDay();
					// 获取开始行数,从0开始
					XSSFRow row = sheet.getRow(i);
					Date date = row.getCell(0).getDateCellValue();
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					String formatDate = df.format(date);
					ycapp.setBt(formatDate);
					// ycapp.setBt(row.getCell(0).getRichStringCellValue().getString());
					ycapp.setChannelName(row.getCell(2).getRichStringCellValue().getString());
					ycapp.setAccountConsume((float) row.getCell(3).getNumericCellValue());
					ycapp.setAgencyRebate((float) row.getCell(4).getNumericCellValue());
					ycapp.setMediaRebate((float) row.getCell(5).getNumericCellValue());
					ycapp.setActualConsume((float) row.getCell(6).getNumericCellValue());
					int j = ycappmapper.updateByNameDate(ycapp);
					if(j==0){
						logger.info(platname+"没有匹配到这条数据:"+ycapp.getChannelName());
					}

				}

			}
			if (platname.equals("报价APP")) {
				File file1 = new File(imp.getFilepath());
				XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file1));
				// 获取表中sheet,从0开始
				XSSFSheet sheet = wb.getSheetAt(0);
				int lastRowNum = sheet.getLastRowNum()+1;
				// int numberOfRows = sheet.getPhysicalNumberOfRows()-1;
				for (int i = 1; i < lastRowNum; i++) {
					YicheQuoteAppLeadsChannelDay ycqapp = new YicheQuoteAppLeadsChannelDay();
					// 获取开始行数,从0开始
					XSSFRow row = sheet.getRow(i);
					Date date = row.getCell(0).getDateCellValue();
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					String formatDate = df.format(date);
					ycqapp.setBt(formatDate);
					// ycapp.setBt(row.getCell(0).getRichStringCellValue().getString());
					ycqapp.setChannelName(row.getCell(2).getRichStringCellValue().getString());
					ycqapp.setAccountConsume((float) row.getCell(3).getNumericCellValue());
					ycqapp.setAgencyRebate((float) row.getCell(4).getNumericCellValue());
					ycqapp.setMediaRebate((float) row.getCell(5).getNumericCellValue());
					ycqapp.setActualConsume((float) row.getCell(6).getNumericCellValue());
					int j = ycqappmapper.updateByNameDate(ycqapp);
					if(j==0){
						logger.info(platname+"没有匹配到这条数据:"+ycqapp.getChannelName());
					}
				}

			}
			if (platname.equals("PCWAP")) {
				File file1 = new File(imp.getFilepath());
				XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file1));
				// 获取表中sheet,从0开始
				XSSFSheet sheet = wb.getSheetAt(0);
				int lastRowNum = sheet.getLastRowNum()+1;
				// int numberOfRows = sheet.getPhysicalNumberOfRows()-1;
				for (int i = 1; i < lastRowNum; i++) {
					YichePcwapAppLeadsChannelDay ycwapp = new YichePcwapAppLeadsChannelDay();
					// 获取开始行数,从0开始
					XSSFRow row = sheet.getRow(i);
					Date date = row.getCell(0).getDateCellValue();
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					String formatDate = df.format(date);
					ycwapp.setDt(formatDate);
					// ycapp.setBt(row.getCell(0).getRichStringCellValue().getString());
					ycwapp.setChannelName(row.getCell(2).getRichStringCellValue().getString());
					ycwapp.setAccountConsume((float) row.getCell(3).getNumericCellValue());
					ycwapp.setAgencyRebate((float) row.getCell(4).getNumericCellValue());
					ycwapp.setMediaRebate((float) row.getCell(5).getNumericCellValue());
					ycwapp.setActualConsume((float) row.getCell(6).getNumericCellValue());
					int j = ycwappmapper.updateByNameDate(ycwapp);
					if(j==0){
						logger.info(platname+"没有匹配到这条数据:"+ycwapp.getChannelName());
					}
				}

			}

		} catch (Exception e) {
			imp.setStatus(false);
			imp.setMessage("未能找到匹配数据");
			ImpChannelConsumeDataExample example = new ImpChannelConsumeDataExample();
			example.createCriteria().andSavefilenmaeEqualTo(map.get("localfileName"));
			impMapper.updateByExampleSelective(imp, example);
			logger.error("出现了异常：", e.getMessage(), e);
			return ResultResponse.fail(ErrorCodeMessage.FILEWRITE_ERROR);
		}
		return ResultResponse.success("文件上传成功");
	}

	@RequestMapping(value = "/selectFileExcleList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			+ ";charset=utf-8", method = RequestMethod.POST)
	@ApiOperation(value = "上传数据列表查询")
	public ResultResponse selectFileExcleList() {
		List<ImpChannelConsumeData> fileExcleList = impChannelConsumeDataSerivce.selectFileExcle();
		Map<String, Object> map = new HashMap<>();

		map.put("data", fileExcleList);
		return ResultResponse.success(map);

	}

	@RequestMapping(value = "/dateVerify", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			+ ";charset=utf-8", method = RequestMethod.POST)
	@ApiOperation(value = "节假日查询")
	public ResultResponse dateVerify() throws ParseException {
		Date date = new Date();
		/*
		 * SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); String
		 * value = "2018-03-01"; Date parse = df.parse(value);
		 */
		Date dateto = DateParseUtil.dateTodate(date, "yyyy-MM-dd");

		List<Date> list = new ArrayList<Date>();
		List<Date> dayto = dayto(list, dateto);
		for (Date date2 : dayto) {
			String dateTostring = DateParseUtil.dateTostring(date2, "yyyy-MM-dd");
			System.out.println(dateTostring);
		}

		/*
		 * Date nextDay1 = DateParseUtil.getNextDay1(dateto); Date nextDay3 =
		 * DateParseUtil.getNextDay3(dateto); ImpHoliday datenow =
		 * imPholisayService.selectdate(dateto);
		 * 
		 * ImpHoliday datefront = imPholisayService.selectdate(nextDay1);
		 * ImpHoliday datelater = imPholisayService.selectdate(nextDay3);
		 * List<Date> dateHoliday =
		 * DateParseUtil.dateHoliday(datenow,datefront,datelater); for (Date
		 * date2 : dateHoliday) { Date dateTodate =
		 * DateParseUtil.dateTodate(date2,"yyyy-MM-dd"); }
		 */

		return ResultResponse.success(dayto);

	}

	private List<Date> dayto(List<Date> list, Date date) {
		Byte selectBynow = imPholisayService.selectBynow(date);
		if (selectBynow == 0 && (imPholisayService.selectBynow(DateParseUtil.getNextDay1(date)) != 1)) {
			list.add(DateParseUtil.getNextDay1(date));
			return list;
		}

		if (selectBynow == 1 && (imPholisayService.selectBynow(DateParseUtil.getNextDay1(date)) == 0)) {
			list.add(DateParseUtil.getNextDay1(date));
			return list;
		}
		if (selectBynow == 1 && (imPholisayService.selectBynow(DateParseUtil.getNextDay1(date)) == 1)) {
			list.add(DateParseUtil.getNextDay1(date));
			dayto(list, DateParseUtil.getNextDay1(date));
		}
		if (selectBynow == 0 && (imPholisayService.selectBynow(DateParseUtil.getNextDay1(date)) == 1)) {
			list.add(DateParseUtil.getNextDay1(date));
			dayto(list, DateParseUtil.getNextDay1(date));
		}
		return list;

	}
}
