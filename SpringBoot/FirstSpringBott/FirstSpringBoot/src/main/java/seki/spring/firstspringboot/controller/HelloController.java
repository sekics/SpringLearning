package seki.spring.firstspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //请求方式：http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello(){
        return "hello,world!" ;
    }
}
