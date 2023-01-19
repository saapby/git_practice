package zoo.Animals;

import java.util.LinkedList;
import java.util.List;

public abstract class Animal {

    protected static List<IAnimal> zoo = new LinkedList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected List<IAnimal> createZoo(IAnimal iAnimal) {
        if (zoo.isEmpty()) {
            zoo.add(iAnimal);
        }
        return zoo;
    }

    public static List<IAnimal> getZoo() {
        return zoo;
    }
}
