package zoo.Animals;

public class Cat extends Animal implements IAnimal {

    @Override
    public void roar() {
        System.out.println("meow-meow");
    }
}
