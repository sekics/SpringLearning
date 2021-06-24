package seki.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate ;

    public void addMoney(String id,int m){
        String sql = "update t_account set money = money + ? where id = ?" ;
        jdbcTemplate.update(sql,m,id) ;
    }

    public void reduceMoney(String id,int m){
        String sql = "update t_account set money = money - ? where id = ?" ;
        jdbcTemplate.update(sql,m,id) ;
    }
}
