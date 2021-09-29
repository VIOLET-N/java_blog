package com.blog.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Integer adminId;
    private String username;
    private String password;
}
