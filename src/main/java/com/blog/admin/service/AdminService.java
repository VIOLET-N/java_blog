package com.blog.admin.service;

import com.blog.admin.entity.Admin;

/**
 * service 层
 *
 * 重载了 selectById  方法
 */
public interface AdminService {
    public int createAdmin(Admin admin);
    public void registerAdmin(Admin admin);
    public Admin selectById(Admin admin);
    public Admin selectById(int id);
    public Admin login(Admin admin);
    public int delete(Admin admin);
    public Admin selectByEmail(Admin admin);
}
