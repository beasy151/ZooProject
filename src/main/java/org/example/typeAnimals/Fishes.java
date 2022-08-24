package org.example.typeAnimals;

import org.example.Animal;

public class Fishes extends Animal {
    @Override
    public String getBreathe() {
        return "Я фильрую воздух жабрами";
    }

    @Override
    public String getMove() {
        return "Плаваю в воде";
    }

    public Fishes(String animalName) {
        super(animalName);
    }
}
