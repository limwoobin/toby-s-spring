package com.drogba.toby.beanTest.ex1;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Provider {

    public Provider(ObjectFactory<ObjectProviderExample.BeanClass> factory) {
        ObjectProviderExample.BeanClass object = factory.getObject();
        System.out.println(object);
    }

    public Provider(ObjectProvider<ObjectProviderExample.BeanClass> provider) {
        ObjectProviderExample.BeanClass ifAvailable = provider.getIfAvailable();
        ObjectProviderExample.BeanClass ifUnique = provider.getIfUnique();
        System.out.println(ifAvailable);
        System.out.println(ifUnique);
    }
}
