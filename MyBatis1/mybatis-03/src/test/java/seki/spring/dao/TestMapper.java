package seki.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import seki.spring.pojo.User;
import seki.spring.util.MybatisUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapper {

    static Logger logger =  Logger.getLogger(TestMapper.class) ;

    @Test
    public void TestGetUserById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class) ;
        User user = userMapper.getUserById(1) ;
        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
    public void TestLogger(){
        logger.info("Log info") ;
        logger.debug("Log debug") ;
    }

    @Test
    public void TestLimit(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class) ;
        Map<String,Integer> map = new HashMap<String,Integer>() ;
        map.put("startIndex",0) ;
        map.put("pageSize",2) ;
        List<User> list = userMapper.getUserByLimit(map) ;
        for(User user : list ){
            System.out.println(user.toString()) ;
        }
        sqlSession.close();
    }
}
