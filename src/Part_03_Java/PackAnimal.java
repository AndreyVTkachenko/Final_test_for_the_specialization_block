package Part_03_Java;

import java.util.List;

abstract class PackAnimal extends Animal {
    private List<String> commands;

    public PackAnimal(String name, String birthDate, List<String> commands) {
        super(name, birthDate);
        this.commands = commands;
    }

    public List<String> getCommands() {
        return commands;
    }

    @Override
    public List<String> listCommands() {
        return commands;
    }
}