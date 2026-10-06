package modelos.decorators;

import modelos.Components.KiaCarComponent;

public class AccesoryRin14Gris extends AccesoryDecorator {

    public AccesoryRin14Gris(KiaCarComponent carComponent) {
        super(carComponent, "Rin Aluminio 14\" Gris Mecanizado (Picanto - Soluto - Sephia)", 500000.0);
    }

    public void display() {
        super.display();
    }
}
