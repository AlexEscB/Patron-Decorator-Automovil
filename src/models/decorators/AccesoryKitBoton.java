package models.decorators;

import models.Components.KiaCarComponent;

public class AccesoryKitBoton extends AccesoryDecorator {

    public AccesoryKitBoton(KiaCarComponent carComponent) {
        super(carComponent, "Kit Boton Encendido + Alarma + 2 Controles Tipo Disparador", 1500000.0);
    }

    public void display() {
        super.display();
    }
}
