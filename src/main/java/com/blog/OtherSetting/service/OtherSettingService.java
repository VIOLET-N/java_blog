package com.blog.OtherSetting.service;

import com.blog.OtherSetting.entity.AdminSetting;

public interface OtherSettingService {
    public int update(AdminSetting adminSetting);
    public AdminSetting select();
    public AdminSetting indexData();
    public AdminSetting aboutMe();
}
