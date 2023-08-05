package com.github.epsilon.springbootstrap.service;

import lombok.Data;

@Data
public class ConstructorGreeting implements Greeting{

    @Override
    public String sayHello() {
        return "constructor hello";
    }
}
