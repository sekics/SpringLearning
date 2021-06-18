package com.seki.spring;

public class User {

    private String userName;

//    public User(String userName) {
//        this.userName = userName;
//    }

    public void add(){
        System.out.println("Add something") ;
        System.out.println("Hello Spring") ;
    }
    //可以直接new该对象，但在spring中可以通过配置文件或者注解来生成对象
}
