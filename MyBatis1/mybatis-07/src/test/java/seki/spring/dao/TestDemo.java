package seki.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import seki.spring.pojo.Blog;
import seki.spring.utils.IDutil;
import seki.spring.utils.MybatisUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDemo {

    @Test
    public void testAddBlog(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class) ;
        Blog blog = new Blog() ;
        blog.setId(IDutil.getID());
        blog.setAuthor("haku");
        blog.setTitle("KMeans");
        blog.setCreateTime(new Date());
        blog.setViews(1000);
        blogMapper.addBlog(blog) ;

        Blog blog1 = new Blog() ;
        blog1.setId(IDutil.getID());
        blog1.setAuthor("katsu");
        blog1.setTitle("LSH");
        blog1.setCreateTime(new Date());
        blog1.setViews(2000);
        blogMapper.addBlog(blog1) ;

        Blog blog2 = new Blog() ;
        blog2.setId(IDutil.getID());
        blog2.setAuthor("su");
        blog2.setTitle("CIT");
        blog2.setCreateTime(new Date());
        blog2.setViews(2000);
        blogMapper.addBlog(blog2) ;

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testQueryBlogIF(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class) ;
        Map<String,Object> map = new HashMap<String,Object>() ;
        map.put("views",1000) ;
        List<Blog> list = blogMapper.queryBlogIF(map) ;
        for( Blog blog : list ){
            System.out.println(blog.toString()) ;
        }
        sqlSession.close();
    }
}
