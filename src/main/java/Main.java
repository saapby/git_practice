import humans.MainHumans;
import zoo.MainZoo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello Zoo!");
        MainZoo.main(args);
        System.out.println("Hello Human!");
        MainHumans.main(args);
    }
}
