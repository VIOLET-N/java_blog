package com.blog.language.service;

import com.blog.language.entity.Language;

import java.util.List;

public interface LanguageService {
    public Language create(Language language);
    public int updateById(Language language);
    public int deleteById(Language language);
    public List<Language> selectLggAll();
}
