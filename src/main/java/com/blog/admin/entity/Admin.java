package com.blog.admin.entity;

import com.blog.utils.PowerState;
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
    private String avatarUrl;
    private PowerState power;
    private Integer githubId;
    private String url;
    private String nodeId;
    private String email;
    private String password;
}
