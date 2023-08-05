package com.github.epsilon.springbootstrap.controller;

import com.github.epsilon.springbootstrap.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {

    private final Greeting g;

    @Autowired
    public ProfileController(@Qualifier("profileService") Greeting g) {
        this.g = g;
    }

    public String sayHello() {
        System.out.println("----------profile--------");
        System.out.println(g.sayHello());
        return g.sayHello();
    }
}
