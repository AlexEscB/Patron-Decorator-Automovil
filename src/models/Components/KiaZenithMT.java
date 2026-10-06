package models.Components;

public class KiaZenithMT extends KiaCarComponent {

    public KiaZenithMT() {
        super("Kia Zenith MT", 64990000.00);
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
