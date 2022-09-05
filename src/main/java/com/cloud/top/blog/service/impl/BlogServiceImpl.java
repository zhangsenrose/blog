package com.cloud.top.blog.service.impl;

import com.cloud.top.blog.mapper.BlogMapper;
import com.cloud.top.blog.model.Blog;
import com.cloud.top.blog.search.BlogSeEntity;
import com.cloud.top.blog.search.repository.BlogSeRepository;
import com.cloud.top.blog.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author ：zhangsw
 * @date ：2022/8/18
 */
@Service
@Slf4j
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private BlogSeRepository blogSeRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Blog addBlog(Blog blog) {
        blog.setCreateTime(LocalDateTime.now()).setModifyTime(LocalDateTime.now());
        blog.setCreateBy("admin").setModifyBy("admin");
        blogMapper.insert(blog);
        log.info("insert result id : {}", blog.getId());
        BlogSeEntity blogSeEntity = new BlogSeEntity();
        modelMapper.map(blog, blogSeEntity);
        blogSeRepository.save(blogSeEntity);
        return blog;
    }

    @Override
    public List<Blog> all() {
        return blogMapper.selectAll();
    }
}
