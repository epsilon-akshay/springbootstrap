package com.github.epsilon.springbootstrap.controller;

import com.github.epsilon.pets.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final Dog p;

    @Autowired
    public PetController(@Qualifier("dog") Dog p) {
        this.p = p;
    }

    public String sayHello() {
        System.out.println("----------petssss-----------");
        System.out.println(p.sayHello());
        return p.sayHello();
    }
}
