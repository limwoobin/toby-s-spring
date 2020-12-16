package com.drogba.toby;

import org.junit.jupiter.api.Test;

import java.util.Hashtable;

public class JUnitTest3 {

    @Test
    void test() {
        Hashtable<String , String> hashtable = new Hashtable<>();
        hashtable.put("a" , "a");
        hashtable.put("a" , "b");
    }
}
