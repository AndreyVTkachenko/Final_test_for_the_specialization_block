package Part_03_Java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание реестра животных
        AnimalRegistry registry = new AnimalRegistry();

        // собаки
        Dog fido = new Dog("Fido", "2020-01-01", Arrays.asList("Sit", "Stay", "Fetch"));
        registry.addAnimal(fido);

        Dog buddy = new Dog("Buddy", "2018-12-10", Arrays.asList("Sit", "Paw", "Bark"));
        registry.addAnimal(buddy);

        Dog bella = new Dog("Bella", "2019-11-11", Arrays.asList("Sit", "Stay", "Roll"));
        registry.addAnimal(bella);

        // кошки
        Cat whiskers = new Cat("Whiskers", "2019-05-15", Arrays.asList("Sit", "Pounce"));
        registry.addAnimal(whiskers);

        Cat smudge = new Cat("Smudge", "2020-02-20", Arrays.asList("Sit", "Pounce", "Scratch"));
        registry.addAnimal(smudge);

        Cat oliver = new Cat("Oliver", "2020-06-30", Arrays.asList("Meow", "Scratch", "Jump"));
        registry.addAnimal(oliver);

        // хомяки
        Hamster hammy = new Hamster("Hammy", "2021-03-10", Arrays.asList("Roll", "Hide"));
        registry.addAnimal(hammy);

        Hamster peanut = new Hamster("Peanut", "2021-08-01", Arrays.asList("Roll", "Spin"));
        registry.addAnimal(peanut);

        // лошади
        Horse thunder = new Horse("Thunder", "2015-07-21", Arrays.asList("Trot", "Canter", "Gallop"));
        registry.addAnimal(thunder);

        Horse storm = new Horse("Storm", "2014-05-05", Arrays.asList("Trot", "Canter"));
        registry.addAnimal(storm);

        Horse blaze = new Horse("Blaze", "2016-02-29", Arrays.asList("Trot", "Jump", "Gallop"));
        registry.addAnimal(blaze);

        // верблюды
        Camel sandy = new Camel("Sandy", "2016-11-03", Arrays.asList("Walk", "Carry Load"));
        registry.addAnimal(sandy);

        Camel dune = new Camel("Dune", "2018-12-12", Arrays.asList("Walk", "Sit"));
        registry.addAnimal(dune);

        Camel sahara = new Camel("Sahara", "2015-08-14", Arrays.asList("Walk", "Run"));
        registry.addAnimal(sahara);

        // ослы
        Donkey eeyore = new Donkey("Eeyore", "2017-09-18", Arrays.asList("Walk", "Carry Load", "Bray"));
        registry.addAnimal(eeyore);

        Donkey burro = new Donkey("Burro", "2019-01-23", Arrays.asList("Walk", "Bray", "Kick"));
        registry.addAnimal(burro);

        // список с командами
        registry.listAllAnimals();
        System.out.println();


        // записываем в файл
        AnimalRegistryWriter writer = new AnimalRegistryWriter("C:\\Users\\gepat\\Documents\\Обучение в GeekBrains" +
                "\\Итоговая КР по блоку специализация\\Final_test_for_the_specialization_block\\src\\Part_03_Java\\" +
                "animal_registry.txt");
        writer.writeRegistryToFile(registry.getAnimals());


//        // всего
//        System.out.println("Общее количество животных в реестре: " + registry.getTotalAnimalsCount());
//        System.out.println();
//
//        // с днём рождения
//        registry.listAnimalsByBirthDate();
//        System.out.println();
//
//        // + команда
//        System.out.println("Текущие команды для " + fido.getName() + ":");
//        registry.listCommands(fido);
//        registry.trainCommand(fido, "Roll Over");
//        registry.listCommands(fido);
    }
}

