package com.blog.article.service;

import com.blog.article.entity.Article;

import java.util.List;

public interface ArticleService {
    public void create(Article article);
    public Article selectById(Article article);
    public List<Article> selectAllByAdminId(Article article);
    public Article update(Article article);
    public List<Article> selectAll();
}
