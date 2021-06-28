package seki.spring.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import seki.spring.pojo.User;

import java.util.List;

public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUser() ;

    @Delete("delete from mybatis.user where id = #{uid}")
    int deleteUser(@Param("uid") int id) ;
}
