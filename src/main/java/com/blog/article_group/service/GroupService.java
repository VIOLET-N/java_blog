package com.blog.article_group.service;

import com.blog.article.entity.Article;
import com.blog.article_group.entity.ArticleGroup;

import java.util.List;

public interface GroupService {
    public void create(ArticleGroup group);
    public List<ArticleGroup> selectAll();
    public int update(ArticleGroup group);
    public int delete(ArticleGroup group);
    public ArticleGroup selectByIdAndAllArticle(ArticleGroup group);
    public Article selectFirstArticle(ArticleGroup group);
}
