package org.example.allAnimals;

import org.example.typeAnimals.Fishes;

public class Dolphin extends Fishes {
    public Dolphin(String animalName) {
        super(animalName);
    }

    public String haveEchoLocators() {
        return "Я все слышу";
    }

}
