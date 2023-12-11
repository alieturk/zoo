package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Lion henk = new Lion("henk");
        animals.add(henk);
        Hippo elsa = new Hippo("elsa");
        animals.add(elsa);
        Pig dora = new Pig("dora");
        animals.add(dora);
        Tiger wally = new Tiger("wally");
        animals.add(wally);
        Zebra marty = new Zebra("marty");
        animals.add(marty);
        Donkey fred = new Donkey("fred");
        animals.add(fred);
        Snake snake = new Snake("snake");
        animals.add(snake);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();
        handleCommand(input, animals);
    }

    /**
     * Processes a given command and invokes actions on a list of animal objects.
     * The method handles the following commands:
     * - "hello": Greet all animals.
     * - "hello [name]": Greet a specific animal by name.
     * - "give leaves": Feed leaves to all herbivores.
     * - "give meat": Feed meat to all carnivores.
     * - "perform trick": Make all animals capable of performing tricks do so.
     * If the command is not recognized, it checks if it starts with "hello" followed by a name
     * and greets the specified animal. If the name is not found or the command is still not recognized,
     * it prints an "Unknown command" message.
     *
     * @param input
     * @param animals
     */
    private static void handleCommand(String input, List<Animal> animals) {
        String command = input.toLowerCase();

        switch (command) {
            case "hello":
                for (Animal animal : animals) {
                    animal.sayHello();
                }
                break;
            case "give leaves":
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    }
                }
                break;
            case "give meat":
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        ((Carnivore) animal).eatMeat();
                    }
                }
                break;
            case "perform trick":
                for (Animal animal : animals) {
                    if (animal instanceof TrickPerformer) {
                        ((TrickPerformer) animal).performTrick();
                    }
                }
                break;
            default:
                // Check if the command starts with "hello" followed by a name
                if (command.startsWith("hello ")) {
                    String name = command.substring(6);
                    Animal animal = findAnimalByName(name, animals);
                    if (animal != null) {
                        animal.sayHello();
                    } else {
                        System.out.println("Animal not found: " + name);
                    }
                } else {
                    System.out.println("Unknown command: " + input);
                }
                break;
        }
    }


    private static Animal findAnimalByName(String name, List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
}
