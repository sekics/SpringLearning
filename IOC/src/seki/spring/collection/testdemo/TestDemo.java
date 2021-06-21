package seki.spring.collection.testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import seki.spring.collection.Course;
import seki.spring.collection.Student;
import seki.spring.collection.autowire.Emp;
import seki.spring.collection.bean.Order;
import seki.spring.collection.factorybean.MyBean;

public class TestDemo {
    @Test
    public void testStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student stu = context.getBean("student",Student.class) ;
        System.out.println(stu.toString()) ;
    }
    @Test
    public void testMyBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml") ;
        //普通bean
//        MyBean myBean = context.getBean("MyBean",MyBean.class) ;
//        System.out.println(myBean) ;
        //工厂bean
        Course course = context.getBean("MyBean",Course.class) ;
        System.out.println(course) ;
    }

    @Test
    public void testBean(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml") ;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml") ;
        Order order = context.getBean("orders",Order.class) ;
        System.out.println("bean creation finished!") ;
        context.close() ;
    }

    @Test
    public void testAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml") ;
        Emp emp = context.getBean("emp",Emp.class) ;
        emp.test();
    }
}
