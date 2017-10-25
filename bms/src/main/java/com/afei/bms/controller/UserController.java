package com.afei.bms.controller;

import com.afei.bms.dto.BmsDto;
import com.afei.bms.dto.UserSession;
import com.afei.bms.entity.User;
import com.afei.bms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
        return modelAndView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String register(HttpServletRequest req, String userName, String password) {
        User user = userService.save(userName, password);
        if (user != null) {
            HttpSession session = req.getSession();
            UserSession userSession = new UserSession();
            userSession.setUserId(user.getId());
            userSession.setUserName(user.getName());
            session.setAttribute("user", userSession);
            return BmsDto.SUCCESS;
        }else {
            return BmsDto.INVALID_USERNAME;
        }
    }

    @RequestMapping(value = "/toMain", method = RequestMethod.GET)
    public String toMain() {
        return "main";
    }

}
