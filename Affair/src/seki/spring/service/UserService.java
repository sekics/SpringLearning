package seki.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import seki.spring.dao.UserDao;
import seki.spring.entity.User;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void Deal(User add, User reduce,int m){
        userDao.reduceMoney(reduce.getId(),m);
        userDao.addMoney(add.getId(),m);
    }
}
