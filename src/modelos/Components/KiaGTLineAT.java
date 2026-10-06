package modelos.Components;

public class KiaGTLineAT extends KiaCarComponent {

    public KiaGTLineAT() {
        super("Kia GT Line AT", 25000.0);
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
