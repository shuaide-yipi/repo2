package com.itheima.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickStartController {

    @Value("${person.name:yukang}")
    private String name;
    @Value("${person.age:22}")
    private Integer age;

    @RequestMapping("/quick")
    public String quick(){
        return "name="+name+"age="+age;
    }
}
