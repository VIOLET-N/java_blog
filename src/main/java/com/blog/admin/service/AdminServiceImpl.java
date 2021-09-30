package com.blog.admin.service;

import com.blog.admin.entity.Admin;
import com.blog.admin.mapper.AdminMapper;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper dao;

    @Transactional
    @Override
    public int createAdmin(Admin admin) {
        return dao.createAdmin(admin);
    }

    @Override
    public Admin selectById(Admin admin) {

        return dao.selectById(admin);
    }

    @Override
    public Admin selectById(int id) {
        Admin admin = new Admin();
        admin.setAdminId(id);
        return dao.selectById(admin);
    }

    @Override
    public Admin login(Admin admin) {
        return dao.login(admin);
    }

    @Override
    public int delete(Admin admin) {
        return dao.delete(admin);
    }
}
