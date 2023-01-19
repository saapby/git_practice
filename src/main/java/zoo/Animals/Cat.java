package zoo.Animals;

public class Cat extends Animal implements IAnimal {

    public Cat() {
        zoo.add(this);
    }

    @Override
    public void roar() {
        System.out.println("meow-meow");
    }
}
