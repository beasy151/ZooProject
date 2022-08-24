package org.example.allAnimals;

import org.example.typeAnimals.Birds;

public class Colibri extends Birds {
    public Colibri(String animalName) {
        super(animalName);
    }

    public String drinkFromFlower() {
        return "Do you want some juice?";
    }
}
