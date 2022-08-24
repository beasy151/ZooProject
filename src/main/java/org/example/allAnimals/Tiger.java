package org.example.allAnimals;

import org.example.typeAnimals.Mammal;

public class Tiger extends Mammal {
    public String getSound() {
        return "Рррррррр";
    }

    public Tiger(String animaName) {
        super(animaName);
    }
}
