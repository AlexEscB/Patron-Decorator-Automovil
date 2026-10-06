package models.decorators;

import models.Components.KiaCarComponent;

public class AccesoryTapete extends AccesoryDecorator {

    public AccesoryTapete(KiaCarComponent carComponent) {
        super(carComponent, "Tapete Tres Piezas Alfombra Picanto (2018 - 2023)", 92000.0);
    }

    public void display() {
        super.display();
    }
}
