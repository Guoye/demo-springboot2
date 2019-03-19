package com.zhangguoye.demo.controller;

import com.zhangguoye.demo.dao.UserDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    private UserDao userDao;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        if (userDao != null) {
            int a = userDao.queryUsers().size();
            String size = String.valueOf(a);
            return size;
        }
        return "xxxxx";

    }
}
