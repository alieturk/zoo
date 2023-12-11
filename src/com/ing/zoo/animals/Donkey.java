package com.ing.zoo.animals;
import com.ing.zoo.interfaces.Herbivore;

public class Donkey extends Animal implements Herbivore {
    public String helloText;
    public String eatText;

    public Donkey(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "OIOIOIOIOI";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "chew chew(happy donkey noises)";
        System.out.println(eatText);
    }

}
