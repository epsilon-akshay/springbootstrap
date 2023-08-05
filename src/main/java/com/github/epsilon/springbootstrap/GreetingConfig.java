package com.github.epsilon.springbootstrap;

import com.github.epsilon.springbootstrap.service.BasicGreeting;
import com.github.epsilon.springbootstrap.service.ConstructorGreeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {

    @Bean
    ConstructorGreeting constructorGreeting() {
        System.out.println("config constructor");
        return new ConstructorGreeting();
    }


}
