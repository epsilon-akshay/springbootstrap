package com.github.epsilon.springbootstrap.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("staging")
@Service("profileService")
public class ProfileStagingService implements Greeting {

    @Override
    public String sayHello() {
        return "profile staging";
    }
}
