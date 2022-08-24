package org.example.allAnimals;

import org.example.typeAnimals.Birds;

public class Eagle extends Birds {

    public Eagle(String animalName) {
        super(animalName);
    }

    public String getAttack() {
        return "Пикирую!";
    }


}
