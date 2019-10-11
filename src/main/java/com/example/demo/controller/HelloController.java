package com.example.demo.controller;

import com.example.demo.pojo.Person;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/get")
    public String get(){
        System.out.println(person.getName()+" "+person.getAge());

        return "success";
    }

    @RequestMapping("/get2")
    public User get2(){
        User user=new User();
        user.setName("瓜田李下");
        user.setAge(22);

        return user;
    }
}
