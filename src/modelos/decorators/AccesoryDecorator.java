package modelos.decorators;

import modelos.Components.KiaCarComponent;

public class AccesoryDecorator extends KiaCarComponent {
    
    protected KiaCarComponent carComponent;

    public AccesoryDecorator(KiaCarComponent carComponent, String name, double price) {
        super(name, price);
        this.carComponent = carComponent;
    }

    @Override
    public void display() {
        carComponent.display();
        System.out.println("Accesory: " + getName() + ", Price: " + getPrice());
    }

    @Override
    public double cost() {
        return carComponent.cost() + getPrice();
    }
    
}
