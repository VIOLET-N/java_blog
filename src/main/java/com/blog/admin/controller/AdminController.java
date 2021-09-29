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

    /**
     * 登录
     * 要求:
     * 登录失败->判断是 username 错误还是 password 错误
     * 登录成功 -> 返回 admin 对象给前台
     * 实现该接口
     * @param admin 用户名和密码
     * @return
     */
    @RequestMapping("/login")
    public Admin login(Admin admin){


        return null;
    }
}
