package com.blog.article_group.controller;

import com.blog.article.entity.Article;
import com.blog.article_group.entity.ArticleGroup;
import com.blog.article_group.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService service;

    @RequestMapping("/create")
    public int create(ArticleGroup group){
        service.create(group);
        return group.getArticleGroupId();
    }

    @RequestMapping("/select")
    public List<ArticleGroup> selectAll(){
        return service.selectAll();
    }

    @RequestMapping("/update")
    public int update(ArticleGroup group){
        return service.update(group);
    }

    @RequestMapping("/delete")
    public int delete(ArticleGroup group){
        return service.delete(group);
    }
}
