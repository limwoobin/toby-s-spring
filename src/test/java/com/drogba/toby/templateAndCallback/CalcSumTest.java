package com.drogba.toby.templateAndCallback;


import com.drogba.toby.templateAndCallback.generic.CalculatorGeneric;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalcSumTest {
    Calculator calculator;
    CalculatorGeneric calculatorGeneric;
    String numFilePath;
    String stringFilePath;

    @BeforeEach
    public void setUp() {
        this.calculator = new Calculator();
        this.calculatorGeneric = new CalculatorGeneric();
        this.numFilePath = "C:\\workspace\\toby_spring\\src\\test\\java\\com\\drogba\\toby\\templateAndCallback\\numbers.txt";
        this.stringFilePath = "C:\\workspace\\toby_spring\\src\\test\\java\\com\\drogba\\toby\\templateAndCallback\\strings.txt";
    }

    @Test
    public void sumOfNumbers() throws IOException {
        assertThat(calculator.calcSum(this.numFilePath) , is(10));
        assertThat(calculator.calcMultiply(this.numFilePath) , is(24));
    }

    @Test
    public void testOfGeneric() throws IOException {
        assertThat(calculatorGeneric.calcSum(this.numFilePath) , is(10));
        assertThat(calculatorGeneric.calcMultiply(this.numFilePath) , is(24));
        assertThat(calculatorGeneric.concatenate(this.stringFilePath) , is("abcd"));
    }
}
