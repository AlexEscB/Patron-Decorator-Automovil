package models.decorators;

import models.Components.KiaCarComponent;

public class AccesoryTiroArrastre extends AccesoryDecorator {

    public AccesoryTiroArrastre(KiaCarComponent carComponent) {
        super(carComponent, "Tiro de Arrastre (Todos los modelos)", 810000.0);
    }

    public void display() {
        super.display();
    }
}
