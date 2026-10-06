package models.decorators;

import models.Components.KiaCarComponent;

public class AccesoryPernos extends AccesoryDecorator {

    public AccesoryPernos(KiaCarComponent carComponent) {
        super(carComponent, "Pernos de Seguridad STARLOCK", 156100.0);
    }

    public void display() {
        super.display();
    }
}
