package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
public class FileUploadController {
    @RequestMapping("/fileUpload")
    public String handleFormUpload(@RequestParam("name") String name,
                                   @RequestParam("uploadfile") List<MultipartFile> uploadfile,
                                   HttpServletRequest request
    ){
        // 判断上传文件是否存在
        if(!uploadfile.isEmpty()){
            // 循环输出上传的文件
            for (MultipartFile file: uploadfile){
                // 获取上传文件的原始名称
                String originalFilename = file.getOriginalFilename();
                // 设置上传文件的保存地址目录
                String dirPath = request.getServletContext().getRealPath("/upload/");
                File filePath = new File(dirPath);
                // 如果保存文件的地址不存在，就先创建目录
                if(!filePath.exists()){
                    filePath.mkdirs();
                }
                // 使用uuid重新命名上传的文件名称(上传人_uuid_原始文件名称)
                String newFilename = name + "_"+ UUID.randomUUID() + "_" + originalFilename;
                try {
                    // 使用MultipartFile接口的方法完成文件上传到指定位置
                    file.transferTo(new File(dirPath + newFilename));
                }catch (Exception e) {
                    e.printStackTrace();
                    return "error";
                }
            }
            return "success";
        }else {
            return "error";
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}