package seki.spring.dao;

import seki.spring.pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getUserById(int id) ;
    List<User> getUserByLimit(Map<String,Integer> map) ;
}
