package seki.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import seki.spring.dao.UserDao;

@Service
public class UserService {

    //根据类型注入
    @Autowired
    @Qualifier(value="userDaoImpl")
    private UserDao userDao ;

    @Value(value = "Seki")
    private String name ;
//    @Resource
//    private UserDao userDao ;

    public void add(){
        System.out.println("Service add") ;
        userDao.add() ;
    }
}
