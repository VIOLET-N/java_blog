package com.blog.language.mapper;

import com.blog.language.entity.Language;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LanguageMapper {
    public void create(Language language);
    public int updateById(Language language);
    public int deleteById(Language language);
    public List<Language> selectLggAll();
}
