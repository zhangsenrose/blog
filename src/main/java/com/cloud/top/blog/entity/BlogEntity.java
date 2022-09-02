package com.cloud.top.blog.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ：zhangsw
 * @date ：2022/8/18
 */
@Data
public class BlogEntity {

    private Long id;

    private String title;

    private String content;

    private String tag;

    private String category;

    private String type;

    private String visibility;

    private String createBy;

    private String modifyBy;

    private LocalDateTime createTime;

    private LocalDateTime modifyTime;
}
