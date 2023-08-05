package com.github.epsilon.springbootstrap.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreeting implements Greeting {

    @Override
    public String sayHello() {
        return "primary hello";
    }
}
