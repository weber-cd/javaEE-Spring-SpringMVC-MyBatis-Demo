package com.springmvc.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileFilter;
import java.nio.charset.StandardCharsets;

@Controller
public class Download {
    @RequestMapping("download")
    public ResponseEntity<byte[]> fileDownload(HttpServletRequest request, String filename) throws Exception{
        // 指定要下载的文件所在路径
        String path = request.getServletContext().getRealPath("/download");
        // 创建该文件对象
        File file = new File(path+File.separator + filename);
        // 设置响应头
        HttpHeaders headers = new HttpHeaders();
        // 通知浏览器以下载的方式打开文件
        headers.setContentDispositionFormData("attachment", new String(filename.getBytes(StandardCharsets.UTF_8),"ISO-8859-1"));

        // 定义以流的形式下载返回文件数据
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        // 使用spring mvc的responseentity对象封装返回对象
        return  new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.OK);
    }
}
