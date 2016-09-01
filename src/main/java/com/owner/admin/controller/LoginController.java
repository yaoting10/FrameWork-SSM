package com.owner.admin.controller;

import com.owner.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String siginAdmin() {
        System.out.println(userService.countUser());
        return "login";
    }

    @RequestMapping(value = "/signed", method = RequestMethod.GET)
    public String signed() {
        return "index";
    }
}
