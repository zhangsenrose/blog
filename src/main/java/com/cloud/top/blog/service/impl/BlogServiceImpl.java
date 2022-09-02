package com.cloud.top.blog.service.impl;

import com.cloud.top.blog.mapper.BlogMapper;
import com.cloud.top.blog.model.Blog;
import com.cloud.top.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author ：zhangsw
 * @date ：2022/8/18
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;


    @Override
    public Blog addBlog(Blog blog) {
        blog.setCreateTime(LocalDateTime.now()).setModifyTime(LocalDateTime.now());
        blog.setCreateBy("admin").setModifyBy("admin");
        blogMapper.insert(blog);
        return blog;
    }
}
