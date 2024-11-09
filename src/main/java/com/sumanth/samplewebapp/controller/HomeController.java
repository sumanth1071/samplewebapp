// This is a Home page acts as a controller
// for the web application
package com.sumanth.samplewebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    // @ResponseBody we can use this return response instead of RestController
    public String greet() {
        return "Welcome to Spring Boot";
    }

    @RequestMapping("/about")
    public String about() {
        return "I am learning Spring";
    }
}
