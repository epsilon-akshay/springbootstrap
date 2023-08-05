package com.github.epsilon.springbootstrap.controller;

import com.github.epsilon.springbootstrap.service.BasicGreeting;
import com.github.epsilon.springbootstrap.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    @Qualifier("basicGreeting")
    private Greeting g;

    public String sayHello() {
        System.out.println("----------basic--------");
        System.out.println(g.sayHello());
        return g.sayHello();
    }
}
