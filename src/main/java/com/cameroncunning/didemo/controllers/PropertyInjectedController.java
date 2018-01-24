package com.cameroncunning.didemo.controllers;

import com.cameroncunning.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl myGreetingService;


    public String sayHello() {
        return myGreetingService.sayHello();
    }

}
