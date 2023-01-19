package zoo.Animals;

public class Dog extends Animal implements IAnimal {

    @Override
    public void roar() {
        System.out.println("woof-woof");
    }
}
