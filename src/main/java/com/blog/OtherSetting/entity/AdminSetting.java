package com.blog.OtherSetting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminSetting {
    private Integer articleNum; // 文章数
    private Integer groupNum; // 分类数
    private String indexList; // 首页打字机
    private String placard; // 公告
    private String signature; // 签名
    private String aboutMe; // 关于我的简介
}