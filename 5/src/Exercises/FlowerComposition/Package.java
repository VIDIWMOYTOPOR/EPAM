package Exercises.FlowerComposition;

class Package {
    private String material;
    private double price;

    public Package(String material, double price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Packaging: " + material + ", price: " + price;
    }
}