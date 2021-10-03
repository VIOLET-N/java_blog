package com.blog.group_icon.mapper;

import com.blog.group_icon.entity.GroupIcon;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroupIconMapper {
    public void create(GroupIcon icon);
    public GroupIcon selectById(GroupIcon icon);
    public int updateById(GroupIcon icon);
    public int deleteById(GroupIcon icon);
}
