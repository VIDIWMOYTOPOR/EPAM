package Exercises.Gifts;

abstract class Sweetness {
    private String name;
    private double weight;
    private double price;

    public Sweetness(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sweetness: [name=" + name + ", weight=" + weight + ", price=" + price + "]";
    }
}
