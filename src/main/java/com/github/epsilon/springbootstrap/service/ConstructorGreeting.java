package com.github.epsilon.springbootstrap.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreeting implements Greeting{
@Override
    public String sayHello() {
        return "constructor hello";
    }
}
