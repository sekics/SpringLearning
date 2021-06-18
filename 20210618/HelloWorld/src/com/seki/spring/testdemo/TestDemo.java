package com.seki.spring.testdemo;
import com.seki.spring.Book;
import com.seki.spring.User;
import com.seki.spring.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml") ;
        Book book = context.getBean("book",Book.class) ;
        System.out.println(book.toString()) ;
    }

    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml") ;
        Order order = context.getBean("order",Order.class) ;
        System.out.println(order.toString()) ;
    }
}
