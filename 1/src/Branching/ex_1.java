package Branching;

public class ex_1 {
    public static void main(String[] args) {
        int firstAngle = 45;
        int secondAngle = 45;
        int thirdAngle = 180 - firstAngle - secondAngle;

        boolean exists = firstAngle + secondAngle + thirdAngle == 180;

        boolean rightAngle = firstAngle == 90 || secondAngle == 90 || thirdAngle == 90;

        if (exists) {
            System.out.println("Triangle exist");
            if (rightAngle) {
                System.out.println("Triangle is right angled");
            } else {
                System.out.println("Triangle is not right angled");
            }
        } else {
            System.out.println("Triangle doesn't exist");
        }
    }
}