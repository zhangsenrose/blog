package com.cloud.top.blog.search;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

/**
 * @author ：zhangsw
 * @date ：2022/9/2
 */
@Data
@Document(indexName = "blog", shards = 3, replicas = 1)
public class BlogSeEntity {

    @Id
    private Long id;

    @Field(type = FieldType.Text)
    private String title;

    @Field(type = FieldType.Text)
    private String content;

    @Field(type = FieldType.Text)
    private String tag;

    @Field(type = FieldType.Text)
    private String category;

    private String type;

    private String visibility;

    private String createBy;

    private String modifyBy;

    private LocalDateTime createTime;

    private LocalDateTime modifyTime;

}
