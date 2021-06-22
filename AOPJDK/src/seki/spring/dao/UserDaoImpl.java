package seki.spring.dao;

public class UserDaoImpl implements UserDao{
    public int add( int a , int b ){
        return a + b ;
    }

    public String update(String ID){
        return ID ;
    }
}
