package com.drogba.toby.IoCTest.ex1;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
