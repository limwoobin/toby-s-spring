package com.drogba.toby;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class JUnitTest {
    static JUnitTest testObject;

    @Test
    public void test1() {
        assertThat(this , is(not(sameInstance(testObject))));
    }

    @Test
    public void test2() {
        assertThat(this , is(not(sameInstance(testObject))));
    }

    @Test
    public void test3() {
        assertThat(this , is(not(sameInstance(testObject))));
    }
}
