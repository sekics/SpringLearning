package seki.spring.annoaop;

import org.springframework.stereotype.Component;

//被增强的类
@Component
public class User {
    public void add(){
        System.out.println("User add") ;
    }
}
