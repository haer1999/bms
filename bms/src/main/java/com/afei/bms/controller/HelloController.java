package com.afei.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cxm on 2017/10/12.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        return "a";
    }
}
