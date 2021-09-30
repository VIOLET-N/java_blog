package com.blog.article.mapper;

import com.blog.article.entity.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
    public int create(Article article); // 创建文章
}
