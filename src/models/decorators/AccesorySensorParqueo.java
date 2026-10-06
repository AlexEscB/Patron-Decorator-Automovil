package models.decorators;

import models.Components.KiaCarComponent;

public class AccesorySensorParqueo extends AccesoryDecorator {

    public AccesorySensorParqueo(KiaCarComponent carComponent) {
        super(carComponent, "Sensor de Parqueo", 150000.0);
    }

    public void display() {
        super.display();
    }
}
