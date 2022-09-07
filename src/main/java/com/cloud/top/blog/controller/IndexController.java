package com.cloud.top.blog.controller;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("index1")
    public String index() {
        return "/view/index";
    }

    @RequestMapping("index2")
    public String index2() {
        return "/view/blogManagement";
    }

    @GetMapping("data1")
    @ResponseBody
    public Map<String, Object> data1(String page, String limit) throws IOException {

        System.out.println(page + "=====" + limit);
        Map<String, Object> ret = new HashMap<>();

        ret.put("code", 0);
        ret.put("msg", "");
        ret.put("count", 3000000);


        final File file = ResourceUtils.getFile("classpath:data.json");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String temp;
        StringBuilder builder = new StringBuilder();
        while ((temp = reader.readLine()) != null) {
            builder.append(temp);
        }

        String jsonStr = builder.toString();

        System.out.println(jsonStr);

        final JSONObject jsonObject = JSONObject.parseObject(jsonStr);


        final Object data = jsonObject.get("data");

        ret.put("data", data);

        return  ret;
    }

}
