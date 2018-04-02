package com.yiche.smp.api;

import com.yiche.smp.common.BoostApplyStatus;
import com.yiche.smp.common.ErrorCodeMessage;
import com.yiche.smp.common.ResultResponse;
import com.yiche.smp.core.service.AgainstApplyService;
import com.yiche.smp.domain.Apply;
import com.yiche.smp.domain.Boost;
import com.yiche.smp.mapper.BoostMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Lenovo on 2017/12/7.
 */
@CrossOrigin(origins = "*")
@RestController
@Api("文件上传")
@PropertySource("classpath:uploadFile.properties")
public class UploadFileController {
    private Logger logger = LoggerFactory.getLogger(AgainstApplyController.class);
    @Value("${uploadpath}")
    private String uploadpath;
    @Autowired
    private BoostMapper boostMapper;
    @Autowired
    private AgainstApplyService againstApplyService;

    @RequestMapping(value = "/upload/uncheatAttachment", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "反作弊申请填写表单上传附件")
    public ResultResponse fileUpload(MultipartFile file, HttpServletRequest request) {
        try {
            if (file == null) {
                logger.info("反作弊申请填写表单上传附件时传参为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            Map <String, String> map = processUpload(file);
            return ResultResponse.success(map);
        } catch (IOException e) {
            logger.error("出现了异常：", e.getMessage(), e);
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_ERROR);
        }
    }

    @RequestMapping(value = "/upload/boost", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "补量实施上传文件")
    public ResultResponse fileUpload(MultipartFile file, HttpServletRequest request, Integer boostId) {
        try {
            if (file == null) {
                logger.info("补量实施上传文件时上传的文件为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            if (boostId == null) {
                logger.info("补量实施上传文件时传入的id为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            Map <String, String> map = processUpload(file);
            //上传文件后改变boostd的文件链接
            Boost boost = boostMapper.selectByPrimaryKey(boostId);
            boost.setUploadfilepath(map.get("path"));
            boost.setFileName(map.get("filename"));
            //文件上传成功的状态
            boost.setStatus(BoostApplyStatus.CARRY_DEPT_OPTION_UPLOAD.getCode());
            boostMapper.updateByPrimaryKey(boost);
            return ResultResponse.success("文件上传成功");
        } catch (IOException e) {
            logger.error("出现了异常：", e.getMessage(), e);
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_ERROR);
        }
    }

    @RequestMapping(value = "/upload/apply", produces = MediaType.APPLICATION_JSON_UTF8_VALUE + ";charset=utf-8", method = RequestMethod.POST)
    @ApiOperation(value = "反作弊上传文件")
    public ResultResponse fileUpload2(MultipartFile file, HttpServletRequest request, Integer applyId) {
        try {
            if (file == null) {
                logger.info("反作弊上传文件时上传文件为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            if (applyId == null) {
                logger.info("反作弊上传文件时传入的id为空");
                return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_INVALID_PARAMETER);
            }
            Map <String, String> map = processUpload(file);
            //上传文件后改变apply的文件链接
            //                System.out.println("传的参数是：" + applyId);
            Apply apply = againstApplyService.selectOneById(applyId);
            //                System.out.println("apply:" + apply.toString() + "---------------------");
            apply.setUploadFilePath(map.get("path"));
            apply.setFilename(map.get("filename"));
            //改变状态为已完成
            apply.setStatus(1);
            againstApplyService.updateByApply(apply);
            return ResultResponse.success("文件上传成功");

        } catch (IOException e) {
            logger.error("出现了异常：", e.getMessage(), e);
            return ResultResponse.fail(ErrorCodeMessage.DB_SERVICE_ERROR);
        }
    }

    private  Map <String, String> processUpload(MultipartFile uploadFile) throws IOException {
        //获取上传文件的内容
        byte[] content = uploadFile.getBytes();
        //获取文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        //获取文件扩展名
        String substring = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        //生成唯一的文件名称
        String uuidName = UUID.randomUUID().toString();
        logger.info("上传路径" + uploadpath);
        File dir = new File(uploadpath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file = new File(uploadpath + "/" + uuidName + "." + substring);
        logger.info(file.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(content);
        fileOutputStream.close();
        HashMap <String, String> map = new HashMap <>();
        map.put("path", file.toString());
        map.put("filename", originalFilename);
        return map;
    }

}
