package com.github.epsilon.springbootstrap;

import com.github.epsilon.springbootstrap.controller.*;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Set;

@ComponentScan(basePackages = {"com.github.epsilon.springbootstrap", "com.github.epsilon.pets"})
@SpringBootApplication
public class SpringbootstrapApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootstrapApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        myController.sayHello();

        SetterInjected mySetterController = (SetterInjected) ctx.getBean("setterInjected");

        mySetterController.sayHello();

        ConstructorInjected myConsController = (ConstructorInjected) ctx.getBean("constructorInjected");
        myConsController.sayHello();

        ProfileController myProfileController = (ProfileController) ctx.getBean("profileController");
        myProfileController.sayHello();

        PetController petController = (PetController) ctx.getBean("petController");
        petController.sayHello();

    }


}
