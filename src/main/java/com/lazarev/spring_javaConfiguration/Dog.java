package com.lazarev.spring_javaConfiguration;

public class Dog {

    private String name="";

    private double mass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        if (mass<=0) throw new RuntimeException("wrong mass for dog");
        this.mass = mass;
    }

    public void gav(){
        System.out.println("Gav");
    }
}
