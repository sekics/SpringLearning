package seki.spring.dao;

import seki.spring.pojo.Blog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(Blog blog) ;
    List<Blog> queryBlogIF(Map<String,Object> map) ;
}
