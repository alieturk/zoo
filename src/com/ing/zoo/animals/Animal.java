package com.ing.zoo.animals;

public abstract class Animal {
    protected String name;
    protected String helloText;

    public Animal(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println(helloText);
    }

    public String getName() {
        return name;
    }
}
