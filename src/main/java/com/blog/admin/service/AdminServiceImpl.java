package com.blog.admin.service;

import com.blog.admin.entity.Admin;
import com.blog.admin.mapper.AdminMapper;
import com.blog.utils.PowerState;
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
        admin.setPower(PowerState.USER);
        return dao.createAdmin(admin);
    }

    @Override
    public void registerAdmin(Admin admin) {
        admin.setPower(PowerState.USER);
        dao.registerAdmin(admin);
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

    @Override
    public Admin selectByEmail(Admin admin) {

        return dao.selectByEmail(admin);
    }

    @Override
    public int updateInfo(Admin admin) {
        return dao.updateInfo(admin);
    }

    @Override
    public Admin selectGithub(Admin admin) {
        return dao.selectGithub(admin);
    }

    @Override
    public void createAdminGithub(Admin admin) {
        admin.setPower(PowerState.USER);
        dao.createAdminGithub(admin);
    }
}
