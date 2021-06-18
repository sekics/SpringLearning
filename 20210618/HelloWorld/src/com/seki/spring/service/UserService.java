package com.seki.spring.service;

import com.seki.spring.dao.UserDao;

public class UserService {

    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("Service Add") ;
        userDao.update();
    }

}
