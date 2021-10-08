package com.blog.language.service;

import com.blog.language.entity.Language;
import com.blog.language.mapper.LanguageMapper;
import com.blog.utils.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    private LanguageMapper dao;

    @Override
    public Language create(Language language) {
        language.setCreateTime(DateFormat.getNewDate());
        language.setUpdateTime(DateFormat.getNewDate());
        dao.create(language);
        return language;
    }

    @Override
    public int updateById(Language language) {
        language.setUpdateTime(DateFormat.getNewDate());
        return dao.updateById(language);
    }

    @Override
    public int deleteById(Language language) {
        return dao.deleteById(language);
    }

    @Override
    public List<Language> selectLggAll() {
        return dao.selectLggAll();
    }
}
