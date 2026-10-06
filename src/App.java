import models.Components.*;
import models.decorators.*;

public class App {
    public static void main(String[] args) throws Exception {

        KiaCarComponent kiaGT = new KiaGTLineAT();
        kiaGT.display();
        System.out.println("Total Cost: $" + kiaGT.cost());

        KiaCarComponent c1 = new AccesoryAlarma(kiaGT);;
        c1.display();
        System.out.println("Total Cost: $" + c1.cost());

        KiaCarComponent c2 = new AccesoryTapete(c1);
        c2.display();
        System.out.println("Total Cost: $" + c2.cost());

    }
}
