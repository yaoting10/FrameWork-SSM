package com.owner.website.controller;

import com.owner.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with ECCS
 * User : Ting.Yao
 * Date : 2015/3/24.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginAdmin() {
        System.out.println(userService.countUser());
        return "login";
    }


    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String error() {
        return "error/error";
    }



}
