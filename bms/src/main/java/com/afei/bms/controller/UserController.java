package com.afei.bms.controller;

import com.afei.bms.dto.BmsDto;
import com.afei.bms.entity.User;
import com.afei.bms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by cxm on 2017/10/19.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView  login(String userName, String password) {
        ModelAndView modelAndView = new ModelAndView("a");

        System.out.println(userName);
        System.out.println(password);
        System.out.println("login1");
        return modelAndView;
    }

    @RequestMapping(value = "/toRegister", method = RequestMethod.GET)
    public ModelAndView  toRegister() {
        ModelAndView modelAndView = new ModelAndView("register");
        System.out.println("toRegister");
        return modelAndView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @ResponseBody
    public String register(String userName, String password) {

//        User user = new User();
//        user.setName(userName);
//        user.setPassword(password);
//        userService.save(user);
        return BmsDto.SUCCESS;
    }

}
