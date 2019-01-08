package com.itheima.demo.controller;

import com.itheima.demo.entity.User;
import com.itheima.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapperController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
        return users;
    }
}
