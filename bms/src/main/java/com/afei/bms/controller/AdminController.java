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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by cxm on 2017/10/30.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    public String  toAdminLogin() {
        return "/admin/login";
    }

    @RequestMapping(value = "/toMain",method = RequestMethod.GET)
    public String toAdminMain() {
        return "/admin/main";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest req, String userName, String password) {
        User user = userService.adminLogin(userName, password);
        if (user != null) {
            HttpSession session = req.getSession();
            UserSession us = new UserSession();
            us.setUserId(user.getId());
            us.setUserName(user.getName());
            session.setAttribute("user", us);
        }else{
            return BmsDto.WRONG_USER_PASSWORD;
        }
        return BmsDto.SUCCESS;
    }

}
