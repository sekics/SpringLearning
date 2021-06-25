package seki.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import seki.spring.pojo.User;
import seki.spring.utils.MybatisUtil;

import java.util.List;

public class TestUserMapper {

    @Test
    public void testGetUserList(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class) ;
        List<User> userList = userMapper.getUserList() ;
        for(User user : userList){
            System.out.println(user.toString());
        }
        sqlSession.close();
    }
}
