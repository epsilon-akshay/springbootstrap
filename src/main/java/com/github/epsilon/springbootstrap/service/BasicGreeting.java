package com.github.epsilon.springbootstrap.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.spec.PSource;

@Service
public class BasicGreeting implements Greeting {

    private final String val ;

    public BasicGreeting(@Value("helllllll") String val) {
        this.val = val;
    }


    @Override
    public String sayHello() {
        System.out.println(val);
        return "basic hello";
    }
}
