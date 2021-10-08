package com.blog.article_group.entity;

import com.blog.article.entity.Article;
import com.blog.group_icon.entity.GroupIcon;
import com.blog.language.entity.Language;
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
    private String createTime;      // 创建
    private String updateTime;      // 更新时间
    private Integer iconId;
    private Integer lggId;

    private GroupIcon groupIcon;
    private Language language;
    private List<Article> articleList;
//    private List<Article> articleList; // 所有文章
}
