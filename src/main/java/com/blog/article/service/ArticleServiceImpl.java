package com.blog.article.service;

import com.blog.article.entity.Article;
import com.blog.article.mapper.ArticleMapper;
import com.blog.utils.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper dao;


    @Override
    public int create(Article article) {
        String dateNow = DateFormat.getNewDate();
        article.setCreateTime(dateNow);
        article.setUpdateTime(dateNow);
        return dao.create(article);
    }
}
