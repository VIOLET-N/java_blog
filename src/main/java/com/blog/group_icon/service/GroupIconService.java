package com.blog.group_icon.service;

import com.blog.group_icon.entity.GroupIcon;

public interface GroupIconService {
    public void create(GroupIcon icon);
    public GroupIcon selectById(GroupIcon icon);
    public int updateById(GroupIcon icon);
    public int deleteById(GroupIcon icon);
}
