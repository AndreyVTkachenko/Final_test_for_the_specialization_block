package Part_03_Java;

import java.util.List;

public class Camel extends PackAnimal {
    public Camel(String name, String birthDate, List<String> commands) {
        super(name, birthDate, commands);
    }

    @Override
    public List<String> listCommands() {
        return getCommands();
    }
}
