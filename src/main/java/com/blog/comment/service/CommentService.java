package com.blog.comment.service;

import com.blog.comment.entity.Comment;

import java.util.List;

public interface CommentService {
    public void create(Comment comment);
    public List<Comment> selectByArticleId(int articleId);
}
