package com.cloud.top.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("index1")
    public String index() {
        return "/view/index";
    }


}
