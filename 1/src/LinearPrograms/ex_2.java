package LinearPrograms;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = scanner.nextDouble();
        System.out.println("Enter second number");
        double b = scanner.nextDouble();
        System.out.println("Enter third number");
        double c = scanner.nextDouble();
        double z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Total = " + z);
        scanner.close();
    }
}
