package org.example;

import org.example.typeAnimals.Birds;
import org.example.typeAnimals.Fishes;
import org.example.typeAnimals.Mammal;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private static ArrayList<Animal> zooResidents = new ArrayList<>();

    public static void addNewAnimalAtList(Animal animal) {
        zooResidents.add(animal);
    }

    private static void printZooAnimals() {
        for (Animal animal: zooResidents) {
            System.out.println( (zooResidents.indexOf(animal)+1) + " - " + animal.getAnimalName());
        }
    }

    /*Метод для теста*/
    public static int getCountAnimalsAtList() {
        return zooResidents.size();
    }

    /*Меню выбора типа юзера (1-сотрудник, 2-посетитель)*/
    public static void runMainMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Если вы сотрудник зоопарка, введите - 1. Если вы посетитель, введите - 2. " +
                    "Для выхода нажмите - 0:");
            String inputNumberOfMenu = scanner.nextLine();

            if (inputNumberOfMenu.equals("1")) {
                checkPassword();

            } else if (inputNumberOfMenu.equals("2")) {
                //Запускаем меню посетителя
                runClientMenu();
            } else if (inputNumberOfMenu.equals("0")) {
                break;
            }

        }
    }

    private static void checkPassword() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль для работы в системе: ");
        String inputPassword = scanner.nextLine();
        if (inputPassword.equals(Props.getPassword())) {
            //запускаем меню для сотрудника
            runWorkerMenu();
        } else {
            throw new Exception("Попытка взлома системы! Завершение работы программы");
        }
    }

    /*Продублировал метод проверки пароля, чтобы его в TestNG погонять*/
    public static Boolean checkInputPasswordisNotEmpty(String input) {
        return (input.isEmpty()) ? false : true;
    }

    /*Аналогично метод для TestNG с Exception */
    public static Boolean checkInputPasswordIsCorrect(String input) throws Exception {
        if (input.equals(Props.getPassword())) {
            //запускаем меню для сотрудника
            return true;
        } else {
            throw new Exception("Попытка взлома системы! Завершение работы программы");
        }
    }

    /*Меню для работника*/
    private static void runWorkerMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Если вы хотите увидеть список животных, нажмите - 1. " +
                    "Для добавления животного, нажмите - 2. " + "Выйти в главное меню - 0");
            String inputWorkerMenu = scanner.nextLine();
            if (inputWorkerMenu.equals("1")) {
                printZooAnimals();
            } else if (inputWorkerMenu.equals("2")) {
                //метод по добавлению животного
                addNewAnimalToZoo();
            } else if (inputWorkerMenu.equals("0")) {
                break;
            }
        }
    }

    /*Добавление нового животного работником, новый класс не создается!*/
    private static void addNewAnimalToZoo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите класс животного: \nМлекопитающее - 1\nРыбы - 2\nПтицы - 3\n" +
                "Введите число: ");
        String inputTypeAnimal = scanner.nextLine();
        System.out.println("Введите его название: ");
        switch (inputTypeAnimal) {
            case "1": new Mammal(scanner.nextLine()); break;
            case "2": new Fishes(scanner.nextLine()); break;
            case "3": new Birds(scanner.nextLine()); break;
        }

    }

    /*Меню для посетителя*/
    private static void runClientMenu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nВ нашем зоопарке Вы можете увидеть: \n");
            printZooAnimals();
            System.out.println("\nВыйти в главное меню - 0. " +
                    "Чтобы узнать информацию о соответствующем животном, введите его номер: ");

            try {
                int animalNumber = scanner.nextInt();
                scanner.nextLine();

                if (animalNumber == 0) {
                    break;
                } else if (animalNumber > 0 && animalNumber <= Zoo.zooResidents.size()) {
                    System.out.printf("I'm %s.\nMoving: %s.\nBreathing: %s.\n",
                            Zoo.zooResidents.get(animalNumber - 1).getAnimalName(),
                            Zoo.zooResidents.get(animalNumber - 1).getMove(),
                            Zoo.zooResidents.get(animalNumber - 1).getBreathe());
                } else {
                    System.out.println("Проверьте корректность ввода!\n");
                }

            } catch (Exception e) {
                throw new RuntimeException("Некорректный формат введенного значения!");
            }
        }

    }

}
