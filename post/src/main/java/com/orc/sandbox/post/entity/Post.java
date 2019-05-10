package com.orc.sandbox.post.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 帖子类
 */
@Entity
@Data
public class Post {

    @Id
    private Long id;

    // 分组id
    private Long groupId;

    // 标题
    private String title;

    // 内容
    private String context;

    // 摘要
    private String digest;

    // 创建者id；
    private Long userId;

    // 阅读数
    private Integer view;

    // 支持数
    private Integer support;

    // 反对数
    private Integer oppose;

    // 上一个帖子id 博主可以编辑文章连结顺序， 若为空则按照创建时间排序
    private Long prePostId;

    // 下一个帖子id
    private Long nextPostId;

    // 评论数
    private Integer comment;

    // 排序号
    private Integer sort;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;



}
