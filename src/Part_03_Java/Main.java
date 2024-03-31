package Part_03_Java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание реестра животных
        AnimalRegistry registry = new AnimalRegistry();

        // Добавление животных в реестр
        Dog dog = new Dog("Fido", "2020-01-01", Arrays.asList("Sit", "Stay", "Fetch"));
        registry.addAnimal(dog);

        Cat cat = new Cat("Whiskers", "2019-05-15", Arrays.asList("Sit", "Pounce"));
        registry.addAnimal(cat);

        Hamster hamster = new Hamster("Hammy", "2021-03-10", Arrays.asList("Roll", "Hide"));
        registry.addAnimal(hamster);

        Horse horse = new Horse("Thunder", "2015-07-21", Arrays.asList("Trot", "Canter", "Gallop"));
        registry.addAnimal(horse);

        Camel camel = new Camel("Sandy", "2016-11-03", Arrays.asList("Walk", "Carry Load"));
        registry.addAnimal(camel);

        Donkey donkey = new Donkey("Eeyore", "2017-09-18", Arrays.asList("Walk", "Carry Load", "Bray"));
        registry.addAnimal(donkey);

        // Вывод списка всех животных
        registry.listAllAnimals();

        // Вывод списка команд для каждого животного
        registry.listCommands(dog);
        registry.listCommands(cat);
        registry.listCommands(hamster);
        registry.listCommands(horse);
        registry.listCommands(camel);
        registry.listCommands(donkey);

        // Обучение новой команды
        registry.trainCommand(dog, "Roll Over");
        registry.listCommands(dog);

        // Вывод общего количества животных в реестре
        System.out.println("Общее количество животных в реестре: " + registry.getTotalAnimalsCount());
    }
}

