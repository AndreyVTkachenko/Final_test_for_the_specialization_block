package Part_03_Java;

import java.util.List;

public abstract class Animal {
    private String name;
    private String birthDate; // возможно следует заменить на String если возникнут сложности в дальнейшем
    List<String> commands;

    public Animal(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public abstract List<String> listCommands();

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String newCommand) {
    }
}
