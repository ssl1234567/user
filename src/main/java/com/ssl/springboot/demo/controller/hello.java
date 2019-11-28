package com.ssl.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class hello {
    @Autowired
    DataSource dataSource;
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("dataSource = " + dataSource);
        System.out.println("nihao");
        return "hh";
    }
}
