package Part_03_Java;

import java.util.List;

public abstract class PackAnimal extends Animal {
    public PackAnimal(String name, String birthDate, List<String> commands) {
        super(name, birthDate);
        this.commands = commands;
    }

    @Override
    public List<String> listCommands() {
        return commands;
    }
}
