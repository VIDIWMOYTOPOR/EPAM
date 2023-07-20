package Exercises.FlowerComposition;

import java.util.ArrayList;
import java.util.List;

class FlowerComposition {
    private List<Flower> flowers;
    private Package aPackage;

    public FlowerComposition() {
        flowers = new ArrayList<>();
        aPackage = new Package("Paper", 5.0);
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void setPackaging(Package aPackage) {
        this.aPackage = aPackage;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Flower flower : flowers) {
            totalPrice += flower.getPrice();
        }
        totalPrice += aPackage.getPrice();
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flower Composition:\n");
        for (Flower flower : flowers) {
            sb.append(flower.toString()).append("\n");
        }
        sb.append(aPackage.toString()).append("\n");
        sb.append("Total Price: ").append(getTotalPrice());
        return sb.toString();
    }
}
