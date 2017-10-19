package com.afei.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by cxm on 2017/10/19.
 */
@Controller("/nlost")
public class UserController {

    @RequestMapping(name = "/login", method = RequestMethod.POST)
    public void login(HttpServletRequest req, String userName, String password){
        System.out.println(userName);
        System.out.println(password);
    }

    @RequestMapping(name = "/login", method = RequestMethod.GET)
    public void fen(HttpServletRequest req, String userName, String password){
        System.out.println(userName);
        System.out.println(password);
    }
}
