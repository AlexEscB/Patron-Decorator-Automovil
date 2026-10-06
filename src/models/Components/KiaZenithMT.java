package models.Components;

public class KiaZenithMT extends KiaCarComponent {

    public KiaZenithMT() {
        super("Kia Zenith MT", 20000.0);
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
