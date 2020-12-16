package com.drogba.toby.IoCTest.ex2;

public class Hello {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print(HelloPrint print) {
        print.print(name);
    }
}
