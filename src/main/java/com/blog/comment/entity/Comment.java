package com.blog.comment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Integer commentId;
    private String body;
    private Integer articleId;  // 文章 Id
    private Integer adminId;    // 发布者
    private Integer replyTo;    // 对谁发布,被回复者 Id
}
