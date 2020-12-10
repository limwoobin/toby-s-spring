package com.drogba.toby.proxy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ProxyTest {

    @Test
    public void simpleProxy() {
        Hello hello = new HelloTarget();
        assertThat(hello.sayHello("Toby") , is("Hello Toby"));
        assertThat(hello.sayHi("Toby") , is("Hi Toby"));
        assertThat(hello.sayThankYou("Toby") , is("ThankYou Toby"));

        Hello proxyHello = new HelloUppercase(new HelloTarget());
        assertThat(proxyHello.sayHello("Toby") , is("HELLO TOBY"));
        assertThat(proxyHello.sayHi("Toby") , is("HI TOBY"));
        assertThat(proxyHello.sayThankYou("Toby") , is("THANKYOU TOBY"));
    }
}
