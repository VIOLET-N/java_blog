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
     * 插入数据返回主键,主键会被封装到函数的 admin 形参中
     *
     * @param admin 创建 admin 所需的 username, password
     * @return 创建成功,返回创建的用户
     */
    @RequestMapping("/register")
    public Admin create(Admin admin){
        service.createAdmin(admin);
        return service.selectById(admin.getAdminId());
    }

    /**
     * 登录
     * 要求:
     *   登录失败 -> 判断是 username 错误还是 password 错误
     *   登录成功 -> 返回 admin 对象给前台
     * 实现该接口
     * @param admin 登录时输入的用户名和密码
     * @return admin 对象
     */
    @RequestMapping("/login")
    public Admin login(Admin admin){


        return null;
    }
}
