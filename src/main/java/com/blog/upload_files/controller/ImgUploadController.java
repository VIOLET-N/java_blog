package com.blog.upload_files.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/upload")
public class ImgUploadController {
    @RequestMapping("/article-img")
    public String uploadImg(HttpServletRequest request, MultipartFile imgFile) {
        // 获取文件在服务器中的存储路径
        File dir = new File("/home/violet/io/");
        // 获取原文件名
        String oldFilename = imgFile.getOriginalFilename();
        String suffix = null;
        if (oldFilename != null){
            suffix = oldFilename.substring(oldFilename.lastIndexOf("."));
        }
        String fileName = UUID.randomUUID() + suffix;

        File file = new File(dir, fileName);

        try {
            imgFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "/upload_img/" + fileName;
    }
}
