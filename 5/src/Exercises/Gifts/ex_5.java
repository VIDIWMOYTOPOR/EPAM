package Exercises.Gifts;

public class ex_5 {
    public static void main(String[] args) {
        Sweetness chocolate1 = new Chocolate("Milka", 100, 2.99, 30);
        Sweetness candy = new Candy("Lollipop", 50, 0.99, "Strawberry");
        Sweetness chocolate2 = new Chocolate("Kinder", 50, 1.49, 20);

        Gift gift = new Gift();
        gift.addSweetness(chocolate1);
        gift.addSweetness(candy);
        gift.addSweetness(chocolate2);

        System.out.println(gift);

        for (Sweetness sweetness : gift.getSweetnessList()) {
            System.out.println(sweetness);
        }

        System.out.println(gift.getPackaging());
    }
}
