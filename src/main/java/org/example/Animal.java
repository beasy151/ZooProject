package org.example;

public abstract class Animal {
    private String animalName;

    public String getAnimalName() {
        return animalName;
    }

    public abstract String getBreathe() ;

    public abstract String getMove();

    public Animal(String animalName) {
        this.animalName = animalName;
        Zoo.addNewAnimalAtList(this);
    }
}
