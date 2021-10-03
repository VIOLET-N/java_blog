package com.blog.group_icon.service;

import com.blog.group_icon.entity.GroupIcon;
import com.blog.group_icon.mapper.GroupIconMapper;
import com.blog.utils.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupIconServiceImpl implements GroupIconService {
    @Autowired
    private GroupIconMapper dao;

    @Override
    public void create(GroupIcon icon) {
        icon.setCreateTime(DateFormat.getNewDate());
        icon.setUpdateTime(DateFormat.getNewDate());
        dao.create(icon);
    }

    @Override
    public GroupIcon selectById(GroupIcon icon) {
        return dao.selectById(icon);
    }

    @Override
    public int updateById(GroupIcon icon) {
        return dao.updateById(icon);
    }

    @Override
    public int deleteById(GroupIcon icon) {
        return dao.deleteById(icon);
    }
}
