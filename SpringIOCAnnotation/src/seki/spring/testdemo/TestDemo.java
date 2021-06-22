package seki.spring.testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import seki.spring.service.UserService;

public class TestDemo {

    @Test
    public void testDao(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService",UserService.class) ;
        System.out.println(userService) ;
        userService.add();
    }
}
