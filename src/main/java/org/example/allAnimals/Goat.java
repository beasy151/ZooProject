package org.example.allAnimals;

import org.example.typeAnimals.Mammal;

public class Goat extends Mammal {
    void doShit() {
        System.out.println("Смотри, как на гору залез");
    }

    public Goat(String animalName) {
        super(animalName);
    }
}
