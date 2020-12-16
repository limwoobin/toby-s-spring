package com.drogba.toby.IoCTest.ex1;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.support.StaticApplicationContext;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

public class JUnitTest {
    @Test
    public void test() {
        StaticApplicationContext ac = new StaticApplicationContext();
        ac.registerSingleton("hello1" , Hello.class);

        Hello hello1 = ac.getBean("hello1" , Hello.class);
        assertThat(hello1 , is(notNullValue()));

        BeanDefinition helloDef = new RootBeanDefinition(Hello.class);
        helloDef.getPropertyValues().addPropertyValue("name" , "Spring");
        ac.registerBeanDefinition("hello2" , helloDef);

        Hello hello2 = ac.getBean("hello2" , Hello.class);
        assertThat(hello2.sayHello() , is("Hello Spring"));

        System.out.println(hello1.sayHello());
        System.out.println(hello2.sayHello());
    }

    @Test
    public void registerBeanWithDependency() {
        StaticApplicationContext ac = new StaticApplicationContext();

        ac.registerBeanDefinition("printer" , new RootBeanDefinition(StringPrinter.class));

        BeanDefinition helloDef = new RootBeanDefinition(Hello.class);
        helloDef.getPropertyValues().addPropertyValue("name" , "Spring");
        helloDef.getPropertyValues().addPropertyValue("printer" ,
                new RuntimeBeanReference("printer"));

        ac.registerBeanDefinition("hello" , helloDef);

        Hello hello = ac.getBean("hello" , Hello.class);
        hello.print();

        assertThat(ac.getBean("printer").toString() , is("Hello Spring"));
    }
}
