package com.cameroncunning.didemo.controllers;

import com.cameroncunning.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello() {
        return greetingService.sayHello();
    }
}
