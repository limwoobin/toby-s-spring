package com.drogba.toby.IoCTest.ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class HelloConfig2 {

    @Bean
    public Hello hello() {
        Hello hello = new Hello();
        hello.setName("zz");
        hello.print(helloPrint());
        System.out.println(helloPrint() == helloPrint());
        return hello;
    }

    @Bean
    public HelloPrint helloPrint() {
        return new HelloPrint();
    }
}
