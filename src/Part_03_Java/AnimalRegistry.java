package Part_03_Java;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals;

    public AnimalRegistry() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAllAnimals() {
        System.out.println("\n" + "Список всех животных:");
        for (Animal animal : animals) {
            System.out.println("Имя: " + animal.getName() + ", Тип: " + animal.getClass().getSimpleName());
            List<String> commands = animal.listCommands();
            if (commands != null) {
                System.out.println("Команды: " + commands);
            }
        }
    }

    public void listCommands(Animal animal) {
        System.out.println("Команды для " + animal.getName() + ":");
        List<String> commands = animal.listCommands();
        if (commands != null) {
            for (String command : commands) {
                System.out.println(command);
            }
        }
    }

    public void trainCommand(Animal animal, String newCommand) {
        animal.addCommand(newCommand);
        System.out.println("Новая команда \"" + newCommand + "\" получена для " + animal.getName());
    }

    public int getTotalAnimalsCount() {
        return animals.size();
    }
}
