package Part_03_Java;

import java.util.List;

class Hamster extends Pet{
    public Hamster(String name, String birthDate, List<String> commands) {
        super(name, birthDate, commands);
    }

    @Override
    public List<String> listCommands() {
        return null;
    }
}
