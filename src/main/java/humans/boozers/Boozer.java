package humans.boozers;

import humans.Human;
import humans.additional.Bayarishnik;
import humans.additional.Liver;

public class Boozer extends Human {

    private Liver liver = new Liver();
    protected Bayarishnik bayarishnik = new Bayarishnik();

    public void nassatVPadike() {
        System.out.println("Oh, someone urinated in the entrance again.");
    }
}
