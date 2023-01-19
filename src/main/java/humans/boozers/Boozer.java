package humans.boozers;

import com.saapby.example.one.additional.Bayarishnik;
import com.saapby.example.one.additional.Liver;
import com.saapby.example.one.humans.Human;

public class Boozer extends Human {

    private Liver liver = new Liver();
    protected Bayarishnik bayarishnik = new Bayarishnik();

    public void nassatVPadike() {
        System.out.println("Oh, someone urinated in the entrance again.");
    }
}
