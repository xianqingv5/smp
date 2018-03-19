package com.yiche.smp.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class UploadDataUtil {
	public static  Map <String, String> processUpload(MultipartFile uploadFile,String uploadpath) throws IOException {
	        //获取上传文件的内容
	        byte[] content = uploadFile.getBytes();
	        //获取文件的名称
	        String originalFilename = uploadFile.getOriginalFilename();
	        //获取文件扩展名
	        String substring = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
	        //生成唯一的文件名称
	        String uuidName = UUID.randomUUID().toString();
	        //文件名+扩展名
	        String localfileName = uuidName+"."+substring;
	        
	        File dir = new File(uploadpath);
	        if (!dir.exists()) {
	            dir.mkdirs();
	        }
	        File file = new File(uploadpath + "/" + uuidName + "." + substring);
	      
	        FileOutputStream fileOutputStream = new FileOutputStream(file);
	        fileOutputStream.write(content);
	        fileOutputStream.close();
	        HashMap <String, String> map = new HashMap <>();
	        map.put("localfileName", localfileName);
	        map.put("path", file.toString());
	        map.put("filename", originalFilename);
	        return map;
	    }
}
