package org.example.typeAnimals;

import org.example.Animal;

public class Mammal extends Animal {
    @Override
    public String getBreathe() {
        return "Я дышу воздухом при помощи носа";
    }

    @Override
    public String getMove() {
        return "Бегаю по земле лапами";
    }

    public Mammal(String animaName) {
        super(animaName);
    }

}
