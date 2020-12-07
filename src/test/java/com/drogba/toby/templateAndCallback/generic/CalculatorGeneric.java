package com.drogba.toby.templateAndCallback.generic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculatorGeneric {
    private StringBuilder builder;

    public Integer calcSum(String filePath) throws IOException {
        LineCallbackGeneric<Integer> sumCallback = new LineCallbackGeneric<Integer>() {
            @Override
            public Integer doSomethingWithLine(String line, Integer value) {
                return value + Integer.parseInt(line);
            }
        };

        return lineReadTemplate(filePath , sumCallback , 0);
    }

    public Integer calcMultiply(String filePath) throws IOException {
        LineCallbackGeneric<Integer> multiplyCallback = new LineCallbackGeneric<Integer>() {
            @Override
            public Integer doSomethingWithLine(String line, Integer value) {
                return value * Integer.parseInt(line);
            }
        };

        return lineReadTemplate(filePath , multiplyCallback , 1);
    }

    public String concatenate(String filePath) throws IOException {
        LineCallbackGeneric<String> concatenateCallback = new LineCallbackGeneric<String>() {
            @Override
            public String doSomethingWithLine(String line, String value) {
                return String.valueOf(builder.append(line));
            }
        };

        return lineReadTemplate(filePath , concatenateCallback , "");
    }

    public <T> T lineReadTemplate(String filepath , LineCallbackGeneric<T> callback , T initVal) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
            T res = initVal;
            String line = null;
            while ((line = br.readLine()) != null) {
                res = callback.doSomethingWithLine(line , res);
            }
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
