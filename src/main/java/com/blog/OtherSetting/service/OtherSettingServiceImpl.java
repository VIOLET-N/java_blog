package com.blog.OtherSetting.service;

import com.blog.OtherSetting.entity.AdminSetting;
import com.blog.OtherSetting.mapper.OtherSettingMapper;
import com.blog.article.mapper.ArticleMapper;
import com.blog.article_group.mapper.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherSettingServiceImpl implements OtherSettingService {

    @Autowired
    private OtherSettingMapper otherSettingMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
   private GroupMapper groupMapper;

    @Override
    public int update(AdminSetting adminSetting) {
        return otherSettingMapper.update(adminSetting);
    }

    @Override
    public AdminSetting select() {
        return otherSettingMapper.select();
    }

    @Override
    public AdminSetting indexData() {
        AdminSetting adminSetting = otherSettingMapper.indexData();
        adminSetting.setArticleNum(articleMapper.selectNum());
        adminSetting.setGroupNum(groupMapper.selectNum());
        return adminSetting;
    }

    @Override
    public AdminSetting aboutMe() {
        return otherSettingMapper.aboutMe();
    }
}
