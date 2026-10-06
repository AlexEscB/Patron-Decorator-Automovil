package models.decorators;

import models.Components.KiaCarComponent;

public class AccesoryPortabicicletas extends AccesoryDecorator {

    public AccesoryPortabicicletas(KiaCarComponent carComponent) {
        super(carComponent, "Portabicicletas X2 Puestos (Todos los modelos)", 910000.0);
    }

    public void display() {
        super.display();
    }
}
