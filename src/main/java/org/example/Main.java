package org.example;


import org.example.allAnimals.Goat;
import org.example.allAnimals.Tiger;
import org.example.typeAnimals.Fishes;

public class Main {
    public static void main(String[] args) throws Exception {
        Goat goat = new Goat("Горный козел");
        Tiger tiger = new Tiger("Тигр");
        Fishes fishes = new Fishes("Рыбина");

        Zoo.runMainMenu();



    }
}