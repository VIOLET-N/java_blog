package com.blog.language.controller;

import com.blog.language.entity.Language;
import com.blog.language.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lgg")
public class LanguageController {
    @Autowired
    private LanguageService service;

    @RequestMapping("/create")
    public int create(Language language){
        service.create(language);
        return language.getLggId();
    }

    @RequestMapping("/update-id")
    public int updateById(Language language){
        return service.updateById(language);
    }

    @RequestMapping("/delete")
    public int deleteById(Language language){
        return service.deleteById(language);
    }

    @RequestMapping("/lgg-all")
    public List<Language> selectLggAll(){
        return service.selectLggAll();
    }
}
