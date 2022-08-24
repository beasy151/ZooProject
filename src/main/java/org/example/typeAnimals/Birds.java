package org.example.typeAnimals;

import org.example.Animal;

public class Birds extends Animal {
    @Override
    public final String getBreathe() {
        return "Пока лечу - дышу";
    }

    @Override
    public final String getMove() {
        return "Летаю по воздуху";
    }

    public Birds(String animalName) {
        super(animalName);
    }
}
