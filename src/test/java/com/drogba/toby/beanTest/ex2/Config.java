package com.drogba.toby.beanTest.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Autowired Hi hi;

    @Bean
    public Hi hi() {
        Hi hi = new Hi();
        hi.setText("hi~");
        return hi;
    }
}
