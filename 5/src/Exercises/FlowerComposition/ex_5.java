package Exercises.FlowerComposition;

public class ex_5 {
    public static void main(String[] args) {
        FlowerComposition composition = new FlowerComposition();
        composition.addFlower(new Rose(10.0));
        composition.addFlower(new Tulip(8.0));

        Package pac = new Package("Cellophane", 3.0);
        composition.setPackaging(pac);

        System.out.println(composition);
    }
}
