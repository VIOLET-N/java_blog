package com.blog.article.service;

import com.blog.article.entity.Article;
import com.blog.article.mapper.ArticleMapper;
import com.blog.utils.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper dao;


    @Override
    public void create(Article article) {
        String dateNow = DateFormat.getNewDate();
        article.setCreateTime(dateNow);
        article.setUpdateTime(dateNow);
        dao.create(article);
    }

    @Override
    public Article selectById(Article article) {
        return dao.selectById(article);
    }

    @Override
    public List<Article> selectAllByAdminId(Article article) {
        return dao.selectAllByAdminId(article);
    }

    @Override
    public Article update(Article article) {
        article.setUpdateTime(DateFormat.getNewDate());
        dao.update(article);
        return article;
    }

    @Override
    public List<Article> selectAll() {
        return dao.selectAll();
    }
}
