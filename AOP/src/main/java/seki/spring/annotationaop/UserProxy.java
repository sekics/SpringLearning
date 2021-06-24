package seki.spring.annotationaop;

//增强类
public class UserProxy {

    //前置通知

    public void before(){
        System.out.println("Before add") ;
    }
}
