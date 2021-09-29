package com.blog.admin.mapper;

import com.blog.admin.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 管理员接口
 * createAdmin: 创建管理员
 * selectById: 查询管理员
 * login: 分时判断,此处只查询含 username 的 admin, service 层判断密码正确性
 * delete: 根据 id 删除 admin
 */
@Mapper
public interface AdminMapper {
    public int createAdmin(Admin admin);
    public Admin selectById(Admin admin);
    public Admin login(Admin admin);
    public int delete(Admin admin);
}
