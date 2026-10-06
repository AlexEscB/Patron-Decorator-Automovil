package models.decorators;

import models.Components.KiaCarComponent;

public class AccesoryAlarma extends AccesoryDecorator {

    public AccesoryAlarma(KiaCarComponent carComponent) {
        super(carComponent, "Alarma Matrix General 2 Controles", 205000.0);
    }

    public void display() {
        super.display();
    }
}
