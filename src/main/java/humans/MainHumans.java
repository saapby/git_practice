package humans;

import humans.boozers.Boozer;

public class MainHumans {

    public static void main(String[] args) {
        System.out.println("---");
        System.out.println("0");
        Boozer seva = new Boozer();
        seva.setName("Uncle Seva");
        seva.setAge(50);
        seva.setSex("Muzhichara");
        seva.sayHelloToBitch();
        seva.nassatVPadike();
//        seva.liver;
//        seva.bayarishnik;

        System.out.println("---");
        System.out.println("1");
        Human man1 = seva;
//        man1.nassatVPadike();

        System.out.println("---");
        System.out.println("2");
        Human man2 = seva;
        Boozer boozer2 = (Boozer) man2;
        boozer2.sayHelloToBitch();
        boozer2.nassatVPadike();

        System.out.println("---");
        System.out.println("3");
        Human man3 = seva;
        boolean isBoozer = Boozer.class.isInstance(man3);
        if (isBoozer) {
            Boozer boozer3 = (Boozer) man3;
            boozer3.sayHelloToBitch();
            boozer3.nassatVPadike();
        }

        System.out.println("---");
        System.out.println("4");
        Human man4 = seva;
        Boozer boozer4 = (Boozer) man4;
        if (boozer4 != null) {
            boozer4.sayHelloToBitch();
            boozer4.nassatVPadike();
        }
    }
}
