package com.github.epsilon.springbootstrap.controller;

import com.github.epsilon.springbootstrap.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjected {
    private Greeting g;


    public Greeting getG() {
        return g;
    }
    @Autowired
    @Qualifier("setterBasedGreeting")
    public void setG(Greeting g) {
        this.g = g;
    }

    public String sayHello() {
        System.out.println("----------setterr-------");
        System.out.println(g.sayHello());
        return g.sayHello();
    }
}
