package models.Components;

public class KiaZenithAT extends KiaCarComponent {

    public KiaZenithAT() {
        super("Kia Zenith AT", 22000.0);
    }

    @Override
    public void display() {
        System.out.println("Car Model: " + getName() + ", Price: " + getPrice());
    }

    @Override
    public double cost() {
        return getPrice();
    }
    
}