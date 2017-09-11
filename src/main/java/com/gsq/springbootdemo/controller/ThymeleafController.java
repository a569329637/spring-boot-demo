package com.gsq.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/9/11.
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://localhost:8080");
        return "index";
    }
}
