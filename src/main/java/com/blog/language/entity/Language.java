package com.blog.language.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {
    private Integer lggId;
    private String lggName;
    private String createTime;
    private String updateTime;
}
