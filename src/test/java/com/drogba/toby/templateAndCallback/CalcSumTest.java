package com.drogba.toby.templateAndCallback;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalcSumTest {
    Calculator calculator;
    String numFilePath;

    @BeforeEach
    public void setUp() {
        this.calculator = new Calculator();
        this.numFilePath = "C:\\workspace\\toby_spring\\src\\test\\java\\com\\drogba\\toby\\templateAndCallback\\numbers.txt";
    }

    @Test
    public void sumOfNumbers() throws IOException {
        assertThat(calculator.calcSum(this.numFilePath) , is(10));
        assertThat(calculator.calcMultiply(this.numFilePath) , is(24));
    }
}
