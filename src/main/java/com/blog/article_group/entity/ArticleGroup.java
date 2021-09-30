package com.blog.article_group.entity;

import com.blog.article.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleGroup {
    private Integer articleGroupId; // 组 Id
    private String title;           // 组名
    private String updateTime;      // 创建,更新时间

    private List<Article> articleList; // 所有文章
}
