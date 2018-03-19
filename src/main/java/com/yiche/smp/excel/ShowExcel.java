package com.yiche.smp.excel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.mysql.fabric.Response;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.common.util.NewExcel;
import com.yiche.smp.core.service.ImpChannelConsumeDataSerivce;
import com.yiche.smp.domain.ImpChannelConsumeData;

import io.swagger.annotations.Api;

@RestController
@Api("excel预览")
public class ShowExcel {
	@Autowired
	private ImpChannelConsumeDataSerivce impChannelConsumeDataSerivce;
    @RequestMapping(value = "/resource/getExcel", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8",method = RequestMethod.POST)
	public ResultResponse getExcel(@RequestBody Map<String,String>map) {
    	//String filePath = "E:\\js\\File\\2018-01\\渠道质量评估分析明细-易车12月样例数据(1).xlsx";
    	String id = map.get("id");
    	int a = Integer.parseInt(id);
        	ImpChannelConsumeData data = impChannelConsumeDataSerivce.selectFileExcelById(a);
        	String filepath = data.getFilepath();
    	
    String html= NewExcel.readExcelToHtml(filepath,null,true);
    	
    	 /*response.setCharacterEncoding("utf-8");

         try {
			response.getWriter().print(html);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	
    	
    	return ResultResponse.success(html);
     
    }
}
