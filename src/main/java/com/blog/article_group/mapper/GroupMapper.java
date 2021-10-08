package com.blog.article_group.mapper;

import com.blog.article_group.entity.ArticleGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupMapper {
    public void create(ArticleGroup group);
    public List<ArticleGroup> selectAll();
    public int update(ArticleGroup group);
    public int delete(ArticleGroup group);
    public ArticleGroup selectByIdAndAllArticle(ArticleGroup articleGroup);
}
