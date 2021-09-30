package com.blog.article.entity;


import com.blog.admin.entity.Admin;
import com.blog.utils.ArticleState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private Integer articleId;          // id
    private String title;               // 标题
    private String body;                // 内容
    private ArticleState articleState;  // 状态: 草稿, 发布, 删除
    private String createTime;           // 创建时间
    private String updateTime;          // 修改时间
    private Integer adminId;            // 作者 Id

    private Admin admin;        // 文章发布者 (文章) N -> 1 (作者)
}
