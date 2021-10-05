package com.blog.comment.controller;

import com.blog.comment.entity.Comment;
import com.blog.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService service;

    @RequestMapping("/create")
    public int create(Comment comment){
        service.create(comment);
        return comment.getCommentId();
    }

    @RequestMapping("/select-article-id")
    public List<Comment> selectByArticleId(Integer articleId){
        if (articleId == null){
            return null;
        }
        return service.selectByArticleId(articleId);
    }
}
