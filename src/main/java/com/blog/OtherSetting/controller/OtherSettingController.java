package com.blog.OtherSetting.controller;

import com.blog.OtherSetting.entity.AdminSetting;
import com.blog.OtherSetting.service.OtherSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/setting")
public class OtherSettingController {
    @Autowired
    private OtherSettingService service;

    @RequestMapping("/update")
    public int update(AdminSetting adminSetting){
        return service.update(adminSetting);
    }

    @RequestMapping("/set-index")
    public AdminSetting select(){
        return service.select();
    }

    @RequestMapping("/slt-index")
    public AdminSetting indexData(){
        return service.indexData();
    }

    @RequestMapping("/about")
    public AdminSetting aboutMe(){
        return service.aboutMe();
    }
}
