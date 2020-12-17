package com.drogba.toby.beanTest.ex2;

import javax.annotation.PostConstruct;

// POJO
public class Hi {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @PostConstruct
    public void init() {
        System.out.println("Init");
    }
}
