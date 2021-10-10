package com.blog.article.controller;

import com.blog.article.entity.Article;
import com.blog.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService service;

    /**
     * 创建 article
     * @return 返回包含 id 的 article
     */
    @RequestMapping("/create")
    public Article create(Article article){
        service.create(article);

        return article;
    }


    @RequestMapping("/select-id")
    public Article selectById(Article article){
        return service.selectById(article);
    }

    /**
     * 查询某个 admin 发布的所有 article
     * @param article 只包含 article 中的 adminId
     * @return 返回 article 的集合
     */
    @RequestMapping("/admin-all-article")
    public List<Article> selectAllByAdminId(Article article){
        return service.selectAllByAdminId(article);
    }

    @RequestMapping("/update")
    public Article update(Article article){
        return service.update(article);
//        return article;
    }
}
