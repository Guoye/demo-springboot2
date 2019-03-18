package com.zhangguoye.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world!";
    }
}
