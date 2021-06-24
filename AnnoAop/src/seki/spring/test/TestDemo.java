package seki.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import seki.spring.annoaop.User;
import seki.spring.annoaop.UserProxy;

public class TestDemo {

    @Test
    public void testUserProxy(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml") ;
        User user = context.getBean("user",User.class) ;
        user.add();
    }
}
