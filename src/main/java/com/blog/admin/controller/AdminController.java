package com.blog.admin.controller;

import com.blog.admin.entity.Admin;
import com.blog.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin-manager")
public class AdminController {
    @Autowired
    private AdminService service;

    /**
     * 创建 admin 用户
     * 插入数据返回主键,主键会被封装到函数的 admin 形参中
     *
     * @param admin 创建 admin 所需的 username, password
     * @return 创建成功,返回创建的用户
     */
    @RequestMapping("/register")
    public Admin create(Admin admin){
        service.createAdmin(admin);
        return admin;
    }

    @RequestMapping("/login")
    public Admin EmailPwd(Admin admin){

        return service.selectByEmail(admin);
//        return null;
    }

    @RequestMapping("/select-id")
    public Admin SelectById(Admin admin){
        return service.selectById(admin);
    }

    @RequestMapping("/register-i")
    public Admin registerAdmin(Admin admin){
        System.out.println(admin);
        service.registerAdmin(admin);
        System.out.println(admin.getAdminId());
        if (admin.getAdminId() == null){
            return null;
        }
        return admin;
    }

    @RequestMapping("/up-info")
    public int updateInfo(Admin admin){
        return service.updateInfo(admin);
    }

    @RequestMapping("/slt-ghb")
    public Admin selectGithub(Admin admin){
        return service.selectGithub(admin);
    }

    @RequestMapping("/create-ghb")
    public Admin createAdminGithub(Admin admin){
        service.createAdminGithub(admin);
        return admin;
    }
}
