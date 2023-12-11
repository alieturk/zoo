package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;

public class Snake extends Animal implements Carnivore {
    public String helloText;
    public String eatText;

    public Snake(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "Tsssssssss";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "Gagaagaggaagaga";
        System.out.println(eatText);
    }

}
