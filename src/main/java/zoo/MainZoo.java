package zoo;

import zoo.Animals.Animal;
import zoo.Animals.Cat;
import zoo.Animals.Dog;
import zoo.Animals.IAnimal;

import java.util.List;

public class MainZoo {

    public static void main(String[] args) {
        System.out.println("My ideal zoo:\n");
        Cat cat = new Cat();
        cat.setName("Matroskin");

        Dog dog = new Dog();
        dog.setName("Sharik");

        List<IAnimal> zoo = Animal.getZoo();
        zoo.forEach(iAnimal -> {
            System.out.print(iAnimal.getName() + " roars: ");
            iAnimal.roar();
        });


    }
}
