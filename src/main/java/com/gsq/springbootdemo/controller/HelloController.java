package com.gsq.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/11.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello Spring Boot";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
