package models.Components;

public class KiaZenithAT extends KiaCarComponent {

    public KiaZenithAT() {
        super("Kia Zenith AT", 69990000.00);
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