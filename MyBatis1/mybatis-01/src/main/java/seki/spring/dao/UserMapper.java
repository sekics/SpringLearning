package seki.spring.dao;

import seki.spring.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //模糊查询用户
    List<User> getUserLikeList(String value) ;

    //获取全部用户
    List<User> getUserList() ;

    //根据id查询用户
    User getUserById(int id) ;

    //插入一个用户
    int addUser(User user) ;

    //更改用户
    int updateUser(User user) ;

    //通过id修改密码
    int updateUser2(Map<String,Object> map) ;

    int deleteUser(int id) ;
}
