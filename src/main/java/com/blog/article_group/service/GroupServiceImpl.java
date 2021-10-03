package com.blog.article_group.service;

import com.blog.article_group.entity.ArticleGroup;
import com.blog.article_group.mapper.GroupMapper;
import com.blog.utils.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupMapper dao;

    @Transactional
    @Override
    public void create(ArticleGroup group) {
        group.setUpdateTime(DateFormat.getNewDate());
        group.setCreateTime(DateFormat.getNewDate());
        dao.create(group);
    }

    @Override
    public List<ArticleGroup> selectAll() {
        return dao.selectAll();
    }

    @Transactional
    @Override
    public int update(ArticleGroup group) {
        group.setUpdateTime(DateFormat.getNewDate());
        return dao.update(group);
    }

    @Override
    public int delete(ArticleGroup group) {
        return dao.delete(group);
    }
}
