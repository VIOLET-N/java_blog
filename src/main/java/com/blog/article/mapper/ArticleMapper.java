package com.blog.article.mapper;

import com.blog.article.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    public void create(Article article); // 创建文章
    public Article selectById(Article article); // id 查询
    public List<Article> selectAllByAdminId(Article article); // 查询对应 admin 的所有文章
    public int update(Article article); // 更新文章,返回 Id
    public int deleteById(Article article);
    public List<Article> selectAll();  // 查询所有文章倒序
}
