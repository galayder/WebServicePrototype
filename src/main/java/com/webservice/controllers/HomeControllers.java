package com.webservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeControllers {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String returnPage() {
        return "home-page";
    }
}
