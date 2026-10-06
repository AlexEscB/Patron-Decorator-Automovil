package modelos.decorators;

import modelos.Components.KiaCarComponent;

public class AccesoryMalla extends AccesoryDecorator {

    public AccesoryMalla(KiaCarComponent carComponent) {
        super(carComponent, "Malla de Carga", 110000.0);
    }

    public void display() {
        super.display();
    }
    
}
