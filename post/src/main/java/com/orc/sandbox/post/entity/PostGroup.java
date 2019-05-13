package com.orc.sandbox.post.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 分组 （只设计一层分组， 多层 emmm... 以后看心情吧...）
 */
@Entity
@Data
public class PostGroup {

    @Id
    private Long id;

    // 分组名
    private String name;

    // 描述
    private String detail;

    // 文章数
    private Integer postNum;

    // 排序号
    private Integer sort;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;
}
