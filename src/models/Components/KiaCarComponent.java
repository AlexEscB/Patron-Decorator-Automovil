package models.Components;

public abstract class KiaCarComponent {
    private String name;
    private double price;

    public KiaCarComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public abstract void display();

    public abstract double cost();
}