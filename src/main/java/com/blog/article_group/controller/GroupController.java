package com.blog.article_group.controller;

import com.blog.article.entity.Article;
import com.blog.article_group.entity.ArticleGroup;
import com.blog.article_group.service.GroupService;
import com.blog.group_icon.entity.GroupIcon;
import com.blog.group_icon.service.GroupIconService;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService service;

    @Autowired
    private GroupIconService iconService;

    @RequestMapping("/create")
    public int create(ArticleGroup group, String imgUrl){
        GroupIcon groupIcon = new GroupIcon();
        groupIcon.setUrl(imgUrl);
        iconService.create(groupIcon);
        group.setIconId(groupIcon.getIconId());
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

    @RequestMapping("/group-and-article")
    public ArticleGroup selectByIdAndAllArticle(ArticleGroup group){
        return service.selectByIdAndAllArticle(group);
    }

    @RequestMapping("/group-a-f")
    public Article selectFirstArticle(ArticleGroup group){
        return service.selectFirstArticle(group);
    }
}
