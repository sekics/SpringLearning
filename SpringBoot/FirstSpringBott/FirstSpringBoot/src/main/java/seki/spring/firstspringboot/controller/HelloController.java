package seki.spring.firstspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import seki.spring.firstspringboot.pojo.Car;

@RestController
public class HelloController {

    @Autowired
    private Car car;
    //请求方式：http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello(){
        return "hello,world!" ;
    }

    @RequestMapping("/car")
    public String getCar(){
        return car.toString() ;
    }

}
