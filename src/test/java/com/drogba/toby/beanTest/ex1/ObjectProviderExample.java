package com.drogba.toby.beanTest.ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectProviderExample {

    @Bean
    public BeanClass beanClass() {
        return new BeanClass("drogba");
    }

    public static class BeanClass {
        private final String name;

        public BeanClass(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "BeanClass{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
