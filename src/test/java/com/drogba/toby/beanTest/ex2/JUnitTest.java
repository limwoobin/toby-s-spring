package com.drogba.toby.beanTest.ex2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class JUnitTest {

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Hi hi = context.getBean(Hi.class);
        System.out.println(hi.getText());
    }
}
