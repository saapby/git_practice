package zoo.Animals;

public class Boozer extends Animal implements IAnimal {

    public Boozer() {
        zoo.add(this);
    }

    @Override
    public void roar() {
        System.out.println("Idddiii Nahooooy!");
    }
}
