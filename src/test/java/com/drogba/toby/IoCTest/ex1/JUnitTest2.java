package com.drogba.toby.IoCTest.ex1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

public class JUnitTest2 {
    private static String basePath = "C:\\workspace\\toby_spring\\src\\test\\resources\\";

    @Test
    public void test() {
        ApplicationContext parent = new GenericXmlApplicationContext(basePath + "parentContext.xml");

        GenericApplicationContext child = new GenericApplicationContext(parent);

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(child);
        reader.loadBeanDefinitions(basePath + "childContext.xml");
        child.refresh();

        Printer printer = child.getBean("printer" , Printer.class);
        assertThat(printer , is(notNullValue()));
    }
}
