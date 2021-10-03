package com.blog.group_icon.controller;

import com.blog.group_icon.entity.GroupIcon;
import com.blog.group_icon.service.GroupIconService;
import com.blog.utils.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/g-icon")
public class GroupIconController {
    @Autowired
    private GroupIconService service;

    @RequestMapping("/create")
    public int create(GroupIcon icon){
        service.create(icon);
        return icon.getIconId();
    }

    @RequestMapping("/select-id")
    public GroupIcon selectById(GroupIcon icon){
        return service.selectById(icon);
    }

    @RequestMapping("/update")
    public int updateById(GroupIcon icon){
        icon.setUpdateTime(DateFormat.getNewDate());
        return service.updateById(icon);
    }

    @RequestMapping("delete")
    public int deleteById(GroupIcon icon){
        return service.deleteById(icon);
    }
}
