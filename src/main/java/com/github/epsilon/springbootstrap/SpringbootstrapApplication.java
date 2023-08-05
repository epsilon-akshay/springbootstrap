package com.github.epsilon.springbootstrap;

import com.github.epsilon.springbootstrap.controller.ConstructorInjected;
import com.github.epsilon.springbootstrap.controller.MyController;
import com.github.epsilon.springbootstrap.controller.ProfileController;
import com.github.epsilon.springbootstrap.controller.SetterInjected;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

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

    }


}
