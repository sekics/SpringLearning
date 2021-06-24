package seki.spring.annoaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//增强的类
//Component申明类
@Component
//Aspect申明代理对象
@Aspect
public class UserProxy {

    //切入点抽取
    @Pointcut(value = "execution(* seki.spring.annoaop.User.add(..))")
    public void pointdemo(){

    }
    //前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("Before add") ;
    }
    //最终通知，有无异常均执行
    @After(value = "execution(* seki.spring.annoaop.User.add(..))")
    public void after(){
        System.out.println("After add") ;
    }
    //后置通知，方法完成后执行
    @AfterReturning(value = "execution(* seki.spring.annoaop.User.add(..))")
    public void afterReturning(){
        System.out.println("AfterReturning") ;
    }

    @AfterThrowing(value = "execution(* seki.spring.annoaop.User.add(..))")
    public void afterThrowing(){
        System.out.println("AfterThrowing!") ;
    }

    @Around(value = "execution(* seki.spring.annoaop.User.add(..))")
    public void aroung(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("Around : Before add") ;
        //执行被增强方法
        proceedingJoinPoint.proceed() ;

        System.out.println("Around : After add") ;
    }
}
