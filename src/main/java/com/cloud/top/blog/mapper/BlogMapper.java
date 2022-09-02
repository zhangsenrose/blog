package com.cloud.top.blog.mapper;


import com.cloud.top.blog.model.Blog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：zhangsw
 * @date ：2022/8/18
 */
@Mapper
public interface BlogMapper {

   int insert(Blog record);

   int insertSelective(Blog record);

}
