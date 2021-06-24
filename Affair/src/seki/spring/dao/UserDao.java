package seki.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    void addMoney(String id,int m) ;
    void reduceMoney(String id,int m) ;
}
