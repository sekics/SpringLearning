package seki.spring.dao;

import org.springframework.stereotype.Repository;

@Repository(value="userDaoImpl")
public class UserDaoImpl implements UserDao{
    public void add(){
        System.out.println("UserDaoImpl add") ;
    }
}
