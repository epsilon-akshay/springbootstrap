package com.github.epsilon.springbootstrap.controller;

import com.github.epsilon.springbootstrap.service.BasicGreeting;
import com.github.epsilon.springbootstrap.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjected {
    private final Greeting g;

    @Autowired
    public ConstructorInjected(@Qualifier("constructorGreeting") Greeting g) {
        this.g = g;
    }

    public String sayHello() {
        System.out.println("---------------constructor---------");
        System.out.println(g.sayHello());
        return g.sayHello();
    }
}
