package com.lazarev.spring_avtoConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext("com.lazarev.spring_avtoConfiguration");

        Cat myCat=context.getBean(Cat.class);

        Dog dog= (Dog) context.getBean("dog");

        //if we define 2 or mre bean for Frog class
        Frog frog=context.getBean("frog-kvasha",Frog.class);

        dog.gav();
        frog.say();
    }

}
