package modelos.decorators;

import modelos.Components.KiaCarComponent;

public class AccesoryRin13 extends AccesoryDecorator {

    public AccesoryRin13(KiaCarComponent carComponent) {
        super(carComponent, "Rin Aluminio 13\" Picanto (Todos los modelos)", 350000.0);
    }

    public void display() {
        super.display();
    }
}
