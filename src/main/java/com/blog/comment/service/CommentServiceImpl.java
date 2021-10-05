package com.blog.comment.service;

import com.blog.comment.entity.Comment;
import com.blog.comment.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper dao;

    @Override
    public void create(Comment comment) {
        dao.create(comment);
    }

    @Override
    public List<Comment> selectByArticleId(int articleId) {
        return dao.selectByArticleId(articleId);
    }
}
