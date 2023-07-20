package Exercises.Gifts;

class Candy extends Sweetness {
    private String flavor;

    public Candy(String name, double weight, double price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "Candy: [name=" + getName() + ", weight=" + getWeight() + ", price=" + getPrice() + ", flavor=" + flavor + "]";
    }
}
