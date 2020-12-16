package com.drogba.toby.IoCTest.ex2;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JUnitTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HelloConfig.class);

        Hello hello = context.getBean(Hello.class); // true


        AnnotationConfigApplicationContext context2 =
                new AnnotationConfigApplicationContext(HelloConfig2.class);

        Hello hello2 = context2.getBean(Hello.class); // false
    }
}
