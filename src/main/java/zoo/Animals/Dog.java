package zoo.Animals;

public class Dog extends Animal implements IAnimal {

    public Dog() {
        zoo.add(this);
    }
    @Override
    public void roar() {
        System.out.println("woof-woof");
    }
}
