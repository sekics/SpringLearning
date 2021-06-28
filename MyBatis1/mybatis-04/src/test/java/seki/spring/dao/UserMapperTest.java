package seki.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import seki.spring.pojo.User;
import seki.spring.util.MybatisUtil;

import java.util.List;

public class UserMapperTest {

    @Test
    public void Test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class) ;
        List<User> users = userMapper.getUser() ;
        for(User user:users){
            System.out.println(user.toString());
        }
        sqlSession.close() ;
    }
}
