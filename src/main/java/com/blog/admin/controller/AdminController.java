package com.blog.admin.controller;

import com.blog.admin.entity.Admin;
import com.blog.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin-manager")
public class AdminController {
    @Autowired
    private AdminService service;

    /**
     * 创建 admin 用户
     * @param admin 创建 admin 所需的 username, password
     * @return 创建成功,返回创建的用户
     */
    @RequestMapping("/register")
    public Admin create(Admin admin){
        int adminId = service.createAdmin(admin);
        System.out.println(adminId);
        return service.selectById(adminId);
    }

    @RequestMapping("/login")
    public Admin login(Admin admin){
        return null;
    }
}
