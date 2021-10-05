package com.blog.comment.mapper;

import com.blog.comment.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    public void create(Comment comment);
    public List<Comment> selectByArticleId(int articleId);
}
