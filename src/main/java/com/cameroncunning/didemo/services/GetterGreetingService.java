package com.cameroncunning.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello - I was injected by the getter";
    }
}
