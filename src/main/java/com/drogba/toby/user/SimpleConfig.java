package com.drogba.toby.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfig {

    @Bean
    public Hello hello() {
        Hello hello = new Hello();
        hello.setText("hello~");
        return hello;
    }
}
