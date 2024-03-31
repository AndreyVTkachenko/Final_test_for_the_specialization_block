package Part_03_Java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AnimalRegistryWriter {
    private String filePath;

    public AnimalRegistryWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeRegistryToFile(List<Animal> animals) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Animal animal : animals) {
                writer.write(animal.getName() + "; " + animal.getBirthDate() + "; " + String.join(", ", animal.getCommands()));
                writer.newLine();
            }
            System.out.println("Реестр животных сохранен в файл: " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении реестра животных в файл");
            e.printStackTrace();
        }
    }
}


