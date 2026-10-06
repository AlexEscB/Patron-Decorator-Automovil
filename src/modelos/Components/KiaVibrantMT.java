package modelos.Components;

public class KiaVibrantMT extends KiaCarComponent {

    public KiaVibrantMT() {
        super("Kia Vibrant MT", 15000.0);
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
