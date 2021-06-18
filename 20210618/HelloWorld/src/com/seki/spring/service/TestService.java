package com.seki.spring.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml") ;
        UserService userService = context.getBean("userService",UserService.class) ;
        userService.add() ;
    }
}
