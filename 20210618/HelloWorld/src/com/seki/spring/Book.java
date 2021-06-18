package com.seki.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Book {
    private String bName;
    private String bAuthor;

    //第一种属性注入（依赖注入）的方式，对象创建好后使用set方法
    public void setBName(String bName){
        this.bName = bName;
    }
    public void setbAuthor(String bAuthor){
        this.bAuthor = bAuthor ;
    }

    public String getbName() {
        return bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }
//第二种属性注入（依赖注入）的方式，使用有参构造器
//    public Book(String bName){
//        this.bName = bName ;
//    }
    public String toString(){
        return "[bName:" +  this.bName + " bAuthor : " + this.bAuthor + "]" ;
    }
}
