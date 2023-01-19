package zoo;

import zoo.Animals.*;

import java.util.Arrays;
import java.util.List;

public class MainZoo {

    public static void main(String[] args) {
        System.out.println("My ideal zoo:\n");
        Cat cat = new Cat();
        cat.setName("Matroskin");

        Dog dog = new Dog();
        dog.setName("Sharik");

        Boozer boozer = new Boozer();
        boozer.setName("Dyadya Fedya");

        List<IAnimal> zoo = Arrays.asList(cat, dog, boozer);
        zoo.forEach(iAnimal -> {
            System.out.print(iAnimal.getName() + " roars: ");
            iAnimal.roar();
        });
    }
}
