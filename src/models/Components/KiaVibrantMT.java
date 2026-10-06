package models.Components;

public class KiaVibrantMT extends KiaCarComponent {

    public KiaVibrantMT() {
        super("Kia Vibrant MT", 57990000.00);
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
