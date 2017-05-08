package com.webservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String returnLoginPage() {
        return "login-page";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String returnRegistrationPage() {
        return "registration-page";
    }
}
