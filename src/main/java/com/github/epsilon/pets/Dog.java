package com.github.epsilon.pets;

import com.github.epsilon.springbootstrap.controller.PetController;
import org.springframework.stereotype.Service;

@Service
public class Dog implements Pets {
    private PetController s;

    @Override
    public String sayHello() {
        return "bow bow";
    }
}
