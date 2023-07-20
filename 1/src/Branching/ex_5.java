package Branching;

import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x");
        double x = scanner.nextInt();

        System.out.println("Result: " + F(x));
    }

    public static double F(double x) {
        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) + 6);
        }
    }
}
