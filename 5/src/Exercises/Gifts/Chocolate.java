package Exercises.Gifts;

class Chocolate extends Sweetness {
    private int cocoaPercentage;

    public Chocolate(String name, double weight, double price, int cocoaPercentage) {
        super(name, weight, price);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public String toString() {
        return "Chocolate: [name=" + getName() + ", weight=" + getWeight() + ", price=" + getPrice() + ", cocoaPercentage=" + cocoaPercentage + "]";
    }
}