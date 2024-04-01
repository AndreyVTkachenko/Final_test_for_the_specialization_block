package Part_03_Java;

import Part_03_Java.controller.AnimalRegistry;
import Part_03_Java.model.*;
import Part_03_Java.view.ConsoleInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Создаем экземпляры каждого животного в соответствии с таблицами для предварительного заполнения реестра
        Dog fido = new Dog("Fido", "2020-01-01", List.of("Sit", "Stay", "Fetch"));
        Cat whiskers = new Cat("Whiskers", "2019-05-15", List.of("Sit", "Pounce"));
        Hamster hammy = new Hamster("Hammy", "2021-03-10", List.of("Roll", "Hide"));
        Dog buddy = new Dog("Buddy", "2018-12-10", List.of("Sit", "Paw", "Bark"));
        Cat smudge = new Cat("Smudge", "2020-02-20", List.of("Sit", "Pounce", "Scratch"));
        Hamster peanut = new Hamster("Peanut", "2021-08-01", List.of("Roll", "Spin"));
        Dog bella = new Dog("Bella", "2019-11-11", List.of("Sit", "Stay", "Roll"));
        Cat oliver = new Cat("Oliver", "2020-06-30", List.of("Meow", "Scratch", "Jump"));
        Horse thunder = new Horse("Thunder", "2015-07-21", List.of("Trot", "Canter", "Gallop"));
        Camel sandy = new Camel("Sandy", "2016-11-03", List.of("Walk", "Carry Load"));
        Donkey eeyore = new Donkey("Eeyore", "2017-09-18", List.of("Walk", "Carry Load", "Bray"));
        Horse storm = new Horse("Storm", "2014-05-05", List.of("Trot", "Canter"));
        Camel dune = new Camel("Dune", "2018-12-12", List.of("Walk", "Sit"));
        Donkey burro = new Donkey("Burro", "2019-01-23", List.of("Walk", "Bray", "Kick"));
        Horse blaze = new Horse("Blaze", "2016-02-29", List.of("Trot", "Jump", "Gallop"));
        Camel sahara = new Camel("Sahara", "2015-08-14", List.of("Walk", "Run"));

        registry.addAnimal(fido);
        registry.addAnimal(whiskers);
        registry.addAnimal(hammy);
        registry.addAnimal(buddy);
        registry.addAnimal(smudge);
        registry.addAnimal(peanut);
        registry.addAnimal(bella);
        registry.addAnimal(oliver);
        registry.addAnimal(thunder);
        registry.addAnimal(sandy);
        registry.addAnimal(eeyore);
        registry.addAnimal(storm);
        registry.addAnimal(dune);
        registry.addAnimal(burro);
        registry.addAnimal(blaze);
        registry.addAnimal(sahara);

        ConsoleInterface consoleInterface = new ConsoleInterface(registry);
        consoleInterface.start();
    }
}
