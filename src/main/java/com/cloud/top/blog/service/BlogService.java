package com.cloud.top.blog.service;

import com.cloud.top.blog.model.Blog;

import java.util.List;

/**
 * @author ：zhangsw
 * @date ：2022/8/18
 */
public interface BlogService {

    Blog addBlog(Blog blog);

    List<Blog> all();


}
