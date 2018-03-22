package com.yiche.smp.api;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.yiche.smp.common.DataName;
import com.yiche.smp.common.DateParseUtil;
import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.datachange.ApplyData;
import com.yiche.smp.common.datachange.DataChangeVo;
import com.yiche.smp.common.datachange.DataRole;
import com.yiche.smp.common.util.UploadDataUtil;
import com.yiche.smp.core.service.DataChangeService;
import com.yiche.smp.core.service.ImPlatformService;
import com.yiche.smp.core.service.UserService;
import com.yiche.smp.domain.Apply;
import com.yiche.smp.domain.ApplyChannelChange;
import com.yiche.smp.domain.ImpPlatform;
import com.yiche.smp.domain.User;
import com.yiche.smp.domain.YicheAppAppLeadsChannelDay;
import com.yiche.smp.domain.YichePcwapAppLeadsChannelDay;
import com.yiche.smp.domain.YicheQuoteAppLeadsChannelDay;
import com.yiche.smp.mapper.YicheAppAppLeadsChannelDayMapper;
import com.yiche.smp.mapper.YichePcwapAppLeadsChannelDayMapper;
import com.yiche.smp.mapper.YicheQuoteAppLeadsChannelDayMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@Api("数据修正")
@PropertySource("classpath:uploadFile.properties")
public class DataChangeController {
	private Logger logger = LoggerFactory.getLogger(DataChangeController.class);
	@Autowired
	private UserService userService;
	@Autowired
	private DataChangeService dataChangeService;
	@Autowired
	private ImPlatformService imPlatformService;
	@Value("${uploadpath}")
	private String uploadpath;
	@Autowired
	private YicheAppAppLeadsChannelDayMapper ycappmapper;
	@Autowired
	private YicheQuoteAppLeadsChannelDayMapper ycqappmapper;
	@Autowired
	private YichePcwapAppLeadsChannelDayMapper ycwappmapper;

	@RequestMapping(value = "/intelligent/ApplyDataChange", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			+ ";charset=utf-8", method = RequestMethod.POST)
	@ApiOperation(value = "初始化数据修正的下拉框")
	public ResultResponse getAllSelectData() {
		List<User> selectUser = userService.selectUserByRole();
		List<ImpPlatform> platformlist = imPlatformService.selectImPlatform();
		DataChangeVo vo = new DataChangeVo(selectUser, platformlist);
		Map<String, Object> result = new HashMap<>();
		result.put("data", vo);
		return ResultResponse.success(result);

	}

	@RequestMapping(value = "/intelligent/ApplyDataSubmit", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			+ ";charset=utf-8", method = RequestMethod.POST)
	@ApiOperation(value = "数据修正提交")
	public ResultResponse applyDataSubmit(ApplyData applyData, MultipartFile file, HttpSession session) {

		if (applyData == null || file == null) {
			logger.info("表格内容为空");
			return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
		}
		Map<String, String> map = null;
		try {
			map = UploadDataUtil.processUpload(file, uploadpath);

		} catch (IOException e) {
			ResultResponse.fail(ErrorCodeMessage.FILEUPLOAD_ERROR);
			e.printStackTrace();
		}
		Integer result = dataChangeService.applyDataSubmit(applyData, map, session);
		if (result == null || result == 0) {
			logger.info("保存数据修正申请失败，数据数写入失败");
			return ResultResponse.fail(ErrorCodeMessage.APPLY_MESSAGE_ADD_ERROR);
		} else {
			return ResultResponse.success();
		}

	}

	@RequestMapping(value = "/intelligent/getDataChangeList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			+ ";charset=utf-8", method = RequestMethod.POST)
	@ApiOperation("获取当前操作人的数据修正申请或修正列表")
	public ResultResponse getDataChangeList(HttpServletRequest request) {
		// 获取用户信息
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			logger.info("获取数据修正申请列表时session中没有拿到用户对象");
			return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
		}
		List<ApplyChannelChange> applyLists = dataChangeService.selectAllByUserId(user);
		if (applyLists == null) {
			logger.info("获取数据修正申请列表时查询列表得到空");
			return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_FUNCTION_NO_ACCESS);
		}
		DataRole dr = new DataRole();
		dr.setList(applyLists);
		dr.setRole(user.getRole());
		HashMap<String, Object> map = new HashMap<>();
		map.put("data", dr);
		return ResultResponse.success(map);

	}

	@RequestMapping(value = "/intelligent/lookDataChangeDetail", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			+ ";charset=utf-8", method = RequestMethod.POST)
	@ApiOperation("获取展示详情")
	public ResultResponse lookDataChangeDetail(@RequestBody Map<String, String> map) {
		String id = map.get("id");
		if (id == null) {
			logger.info("获取展示详情时传参为空");
			return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
		}
		int a = Integer.parseInt(id);
		ApplyChannelChange applyChannelChange = dataChangeService.selectOneById(a);
		logger.info("详情内容：" + applyChannelChange.toString());
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("data", applyChannelChange);
		return ResultResponse.success(map1);
	}

	/*
	 * @RequestMapping(value = "/intelligent/selectDataChangeHandleList",
	 * produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8",
	 * method = RequestMethod.POST)
	 * 
	 * @ApiOperation(value = "数据处理部门实施岗角色 的数据修正处理页的列表查询") public ResultResponse
	 * selectDataChangeHandleList(HttpSession session) { //获取用户信息 User user =
	 * (User) session.getAttribute("user"); if (user == null) { return
	 * ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
	 * } List<ApplyChannelChange> applyChannelChange =
	 * dataChangeService.selectBoostHandelList(user); Map<String, Object> map =
	 * new HashMap<>(); map.put("data", applyChannelChange); return
	 * ResultResponse.success(map); }
	 */

	@RequestMapping(value = "/intelligent/DateChangeCheck", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			+ ";charset=utf-8", method = RequestMethod.POST)
	@ApiOperation(value = "申请信息审核")
	public ResultResponse dateChangeCheck(@RequestBody ApplyChannelChange applyChannelChange, HttpSession session) {
		try {
			// 获取用户信息
			User user = (User) session.getAttribute("user");
			if (user == null) {
				return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_GET_USER_MESSAGE_ERROR);
			}
			int i = dataChangeService.changeCheckMes(applyChannelChange, user);
					if(i==0){
						return ResultResponse.fail(ErrorCodeMessage.APPLY_MESSAGE_CHECK_ERROR);
					}
		} catch (Exception e) {
			logger.info("信息审核失败{" + e.getMessage() + "}");
			return ResultResponse.fail(ErrorCodeMessage.APPLY_MESSAGE_CHECK_ERROR);
		}
		Integer status = applyChannelChange.getStatus();
		if(status==1||status==2){
			return ResultResponse.success();
		}
		if(status==-1||status==-2||status==-3){
			return ResultResponse.error("审核未通过");
		}
		Integer id = applyChannelChange.getId();
		ApplyChannelChange selectOneById = dataChangeService.selectOneById(id);
		String filepath = selectOneById.getFilepath();
		Date time = selectOneById.getApplystarttime();
		String applychannel = selectOneById.getApplychannel();
		/*File f = new File(filepath);
		XSSFWorkbook xw;
		try {
			xw = new XSSFWorkbook(new FileInputStream(f));
			// 获取表中sheet,从0开始
			Sheet sh = xw.getSheetAt(0);
			int RowNum = sh.getLastRowNum() + 1;
			Boolean flag = false;
			for (int ii = 1; ii < RowNum; ii++) {
				Row r = sh.getRow(ii);
				Date d = r.getCell(0).getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String format = sdf.format(d);
				if (!format.equals(DateParseUtil.dateTostring(time, "yyyy-MM-dd"))) {
					flag = true;
					break;
				}
			}
			if (flag) {
				return ResultResponse.fail(DataName.FileError);
			}

		} catch (IOException e) {
			e.printStackTrace();
			return ResultResponse.error("读取excel文件失败,请检查文件格式");
		}*/
		try {
			if (applychannel.equals("易车APP")) {
				File file1 = new File(filepath);
				XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file1));
				// 获取表中sheet,从0开始
				XSSFSheet sheet = wb.getSheetAt(0);
				int lastRowNum = sheet.getLastRowNum() + 1;
				for (int i = 1; i < lastRowNum; i++) {
					YicheAppAppLeadsChannelDay ycapp = new YicheAppAppLeadsChannelDay();
					// 获取开始行数,从0开始
					XSSFRow row = sheet.getRow(i);
					Date date = row.getCell(0).getDateCellValue();
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					String formatDate = df.format(date);
					ycapp.setBt(formatDate);
					ycapp.setChannelName(row.getCell(2).getRichStringCellValue().getString());
					ycapp.setAccountConsume((float) row.getCell(3).getNumericCellValue());
					ycapp.setAgencyRebate((float) row.getCell(4).getNumericCellValue());
					ycapp.setMediaRebate((float) row.getCell(5).getNumericCellValue());
					ycapp.setActualConsume((float) row.getCell(6).getNumericCellValue());
					int j = ycappmapper.updateByNameDate(ycapp);

				}

			}
			if (applychannel.equals("报价APP")) {
				File file1 = new File(filepath);
				XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file1));
				// 获取表中sheet,从0开始
				XSSFSheet sheet = wb.getSheetAt(0);
				int lastRowNum = sheet.getLastRowNum() + 1;
				for (int i = 1; i < lastRowNum; i++) {
					YicheQuoteAppLeadsChannelDay ycqapp = new YicheQuoteAppLeadsChannelDay();
					// 获取开始行数,从0开始
					XSSFRow row = sheet.getRow(i);
					Date date = row.getCell(0).getDateCellValue();
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					String formatDate = df.format(date);
					ycqapp.setBt(formatDate);
					ycqapp.setChannelName(row.getCell(2).getRichStringCellValue().getString());
					ycqapp.setAccountConsume((float) row.getCell(3).getNumericCellValue());
					ycqapp.setAgencyRebate((float) row.getCell(4).getNumericCellValue());
					ycqapp.setMediaRebate((float) row.getCell(5).getNumericCellValue());
					ycqapp.setActualConsume((float) row.getCell(6).getNumericCellValue());
					int j = ycqappmapper.updateByNameDate(ycqapp);
				}

			}
			if (applychannel.equals("PCWAP")) {
				File file1 = new File(filepath);
				XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file1));
				// 获取表中sheet,从0开始
				XSSFSheet sheet = wb.getSheetAt(0);
				int lastRowNum = sheet.getLastRowNum() + 1;
				for (int i = 1; i < lastRowNum; i++) {
					YichePcwapAppLeadsChannelDay ycwapp = new YichePcwapAppLeadsChannelDay();
					// 获取开始行数,从0开始
					XSSFRow row = sheet.getRow(i);
					Date date = row.getCell(0).getDateCellValue();
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					String formatDate = df.format(date);
					ycwapp.setDt(formatDate);
					ycwapp.setChannelName(row.getCell(2).getRichStringCellValue().getString());
					ycwapp.setAccountConsume((float) row.getCell(3).getNumericCellValue());
					ycwapp.setAgencyRebate((float) row.getCell(4).getNumericCellValue());
					ycwapp.setMediaRebate((float) row.getCell(5).getNumericCellValue());
					ycwapp.setActualConsume((float) row.getCell(6).getNumericCellValue());
					int j = ycwappmapper.updateByNameDate(ycwapp);
				}

			}

		} catch (Exception e) {
			logger.error("出现了异常：", e.getMessage(), e);
			return ResultResponse.fail(ErrorCodeMessage.FILEWRITE_ERROR);
		}
		return ResultResponse.success();
	}
	
	@RequestMapping(value ="/intelligent/downloadExcel", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.GET)
    @ApiOperation("数据修正申请中上传附件的下载")
    public void downloadEnclosure(Integer applyId, HttpServletResponse response) {
        if (applyId == null) {
            logger.info("下载上传附件时传入的id为空");
            return;
        }
        //获取上传的附件
        ApplyChannelChange applyChannelChange = dataChangeService.selectOneById(applyId);
        String filepath = applyChannelChange.getFilepath();
        String filename = applyChannelChange.getFilename();       
        UploadDataUtil.processDownload(response, filepath, filename);
    }
}
