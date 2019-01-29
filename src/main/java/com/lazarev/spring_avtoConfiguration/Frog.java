package com.lazarev.spring_avtoConfiguration;

import org.springframework.stereotype.Component;

@Component("frog-kvasha")
public class Frog {

    private String frogName;

    public String getFrogName() {
        return frogName;
    }

    public void setFrogName(String frogName) {
        this.frogName = frogName;
    }

    public void say(){
        System.out.println("Kva");
    }
}
