package com.drogba.toby;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class JUnitTest3 {

    @Test
    void test() {
        List<String> list = Arrays.asList("a" , "b" , "c");
        System.out.println(list.toString());
    }
}
