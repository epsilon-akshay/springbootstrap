package com.github.epsilon.pets;

import org.springframework.stereotype.Service;

@Service
public class Cat implements Pets{
    @Override
    public String sayHello() {
        return "meow meow";
    }
}
