package com.blog.group_icon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupIcon {
    private Integer iconId;
    private String url;
    private String createTime;
    private String updateTime;
}
