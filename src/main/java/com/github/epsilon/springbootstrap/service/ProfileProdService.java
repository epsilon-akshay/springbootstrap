package com.github.epsilon.springbootstrap.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("profileService")
public class ProfileProdService implements Greeting {
    @Override
    public String sayHello() {
        return "profile prod";
    }
}
