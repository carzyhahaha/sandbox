package com.orc.sandbox.post.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 评论类
 */
@Entity
@Data
public class Comment {

    @Id
    private Long id;

    // 父亲id（若该评论是针对某条评论时候使用， 若评论针对文章则忽略）
    private Long parentId;

    // 评论内容
    private String context;

    // 评论者id
    private Long userId;

    // 评论者昵称(做冗余避免查用户表带来的性能负担，
    // 用户修改昵称需要维护， 这个逻辑是否可行有待验证）
    private String userNickName;

    // 支持数
    private Integer support;

    // 反对数
    private Integer oppose;

    // 评论时间
    private Date createTime;


}
