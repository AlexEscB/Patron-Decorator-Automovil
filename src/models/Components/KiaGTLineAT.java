package models.Components;

public class KiaGTLineAT extends KiaCarComponent {

    public KiaGTLineAT() {
        super("Kia GT Line AT", 72990000.00);
    }

    @Override
    public void display() {
        System.out.println("Car Model: " + getName() + ", Price: " + getPrice() + " COP");
    }

    @Override
    public double cost() {
        return getPrice();
    }   
    
}
