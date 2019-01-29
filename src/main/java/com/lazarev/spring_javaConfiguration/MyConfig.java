package com.lazarev.spring_javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Cat cat() {
        return new Cat();
    }

    //bean name like method name by default
    @Bean
    public Dog getDog() {
        return new Dog();
    }

    @Bean(name = "froggy")
    public Frog getFrog() {
        return new Frog();
    }

    @Bean("dog-killer")
    public Dog getDogKiller(Frog thisFrogWillBeKilled){
        Dog dog=new Dog();
        dog.setName(dog.getName()+"-killer");
        System.out.println("thisFrogWillBeKilled");
        return dog;
    }
}
