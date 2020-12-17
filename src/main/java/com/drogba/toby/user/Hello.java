package com.drogba.toby.user;

import javax.annotation.PostConstruct;

public class Hello {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @PostConstruct
    public void init() {
        System.out.println("Test Init");
    }
}
