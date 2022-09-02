package com.cloud.top.blog.controller;

import com.cloud.top.blog.model.Blog;
import com.cloud.top.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhangsw
 * @date ：2022/8/18
 */
@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

   @PostMapping("/addBlog")
   public Blog addBlog(@RequestBody Blog blog){
       return blogService.addBlog(blog);
   }
}
