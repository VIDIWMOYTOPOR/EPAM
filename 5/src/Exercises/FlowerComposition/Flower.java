package Exercises.FlowerComposition;

abstract class Flower {
    private String name;
    private double price;

    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flower: " + name + ", price: " + price;
    }
}