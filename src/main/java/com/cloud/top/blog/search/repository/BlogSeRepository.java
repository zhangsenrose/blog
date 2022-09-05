package com.cloud.top.blog.search.repository;

import com.cloud.top.blog.search.BlogSeEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author ：zhangsw
 * @date ：2022/9/3
 */
public interface BlogSeRepository extends ElasticsearchRepository<BlogSeEntity, Long> {


}
