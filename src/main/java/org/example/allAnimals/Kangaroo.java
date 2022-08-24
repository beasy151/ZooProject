package org.example.allAnimals;

import org.example.typeAnimals.Mammal;

public class Kangaroo extends Mammal {
    public Kangaroo(String animaName) {
        super(animaName);
    }

    public void makeHighJump() {
        System.out.println("Юхууу, как высоко!");
    }


}
