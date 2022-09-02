package com.cloud.top.blog.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author ：zhangsw
 * @date ：2022/8/18
 */
@Data
@Accessors(chain = true)
public class Blog {

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
