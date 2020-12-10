package com.drogba.toby.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

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

        // DynamicProxy
        Hello dynamicProxyHello = (Hello) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[]{Hello.class},
                new UppercaseHandler(new HelloTarget())
        );

        assertThat(dynamicProxyHello.sayHello("drogba") , is("HELLO DROGBA"));
        assertThat(dynamicProxyHello.sayHi("drogba") , is("HI DROGBA"));
        assertThat(dynamicProxyHello.sayThankYou("drogba") , is("THANKYOU DROGBA"));

        // Extended DynamicProxy
        Hello extendedDynamicProxy = (Hello) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[]{Hello.class},
                new ExtendedUppercaseHandler(new HelloTarget())
        );

        assertThat(extendedDynamicProxy.sayHello("maluda") , is("HELLO MALUDA"));
        assertThat(extendedDynamicProxy.sayHi("maluda") , is("HI MALUDA"));
        assertThat(extendedDynamicProxy.sayMoney(100) , is(100));
    }
}
