package com.blog.OtherSetting.mapper;

import com.blog.OtherSetting.entity.AdminSetting;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OtherSettingMapper {
    public int update(AdminSetting adminSetting);
    public AdminSetting select();
    public AdminSetting indexData();
    public AdminSetting aboutMe();
}
