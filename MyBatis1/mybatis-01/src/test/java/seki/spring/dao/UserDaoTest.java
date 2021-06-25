package seki.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import seki.spring.pojo.User;
import seki.spring.util.MybatisUtil;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){
        //第一步，获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;

        //执行
        UserMapper mapper = sqlSession.getMapper(UserMapper.class) ;
        List<User> userList = mapper.getUserList() ;
        for(User user:userList ){
            System.out.println(user.toString()) ;
        }
        sqlSession.close() ;
    }

    @Test
    public void getUserByID(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class) ;
            User user = userMapper.getUserById(1) ;
            System.out.println(user.toString()) ;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class) ;
            User user = new User(8,"shi","efg") ;
            userMapper.addUser(user) ;
            //删除插入修改需要提交事务
            sqlSession.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class) ;
        User user = new User(8,"su","cdf") ;
        int a = userMapper.updateUser(user) ;
        System.out.println(a) ;
        sqlSession.commit();
        sqlSession.close() ;
    }

    @Test
    public void updateUser2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession() ;
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class) ;
        HashMap<String,Object> map = new HashMap<String,Object>() ;
        map.put("userId",7) ;
        map.put("userPwd","hij") ;
        userMapper.updateUser2(map) ;
        sqlSession.commit();
        sqlSession.close();
    }
}
