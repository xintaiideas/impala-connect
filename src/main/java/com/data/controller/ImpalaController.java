package com.data.controller;

import com.data.model.Person;
import com.data.services.ImpalaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ImpalaController {

    @Resource
    private ImpalaService impalaService;

    @GetMapping("/test")
    public String insertPerson() {
        Person person = new Person();
        person.setId(1);
        person.setName("张三");
        impalaService.executeSql(person);
        return "新增记录成功！";
    }
}

