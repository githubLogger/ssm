package com.log.ssm.controller;

import com.log.ssm.bean.User;
import com.log.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //依赖注入
    @Autowired
    private UserService userService;

    @RequestMapping(value = "selectUserByName")
    public User selectUserByName() {
        //调用dao层
        User user = userService.findUserByName("wx");
        return user;
    }
    @RequestMapping(value = "selectUserById")
    public User selectUserById() {
        //调用dao层
        User user = userService.findById(1);
        return user;
    }
    @RequestMapping(value = "addUser")
    public String addUser() {
        //调用dao层
        User user=new User("log",18);
        int count=userService.add(user);
        return "受影响条数："+count;
    }
    @RequestMapping(value = "delUserByName")
    public String delUserByName() {
        //调用dao层
        int count=userService.delByName("log");
        return "受影响条数："+count;
    }

}
