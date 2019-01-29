package com.lazarev.spring_javaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);//(MyConfig.class,MyConfig2.class);//or path to package with config

        Cat myCat=context.getBean(Cat.class);//will be searched bean with name "cat" in config files

        Dog dog= (Dog) context.getBean("getDog");//name like method

        Frog frog= (Frog) context.getBean("froggy");//use our name

        dog.gav();
        frog.say();

        Dog dog_killer= (Dog) context.getBean("dog-killer");
        System.out.println(dog_killer.getName());
    }

}
