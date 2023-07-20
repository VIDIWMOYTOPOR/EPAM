package LinearPrograms;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double x = scanner.nextDouble();
        System.out.println("Enter second number");
        double y = scanner.nextDouble();
        double z = ((Math.sin(x) + Math.cos(y)) / Math.cos(x) - Math.sin(y) * Math.tan(x * y));
        System.out.println("Total = " + z);
        scanner.close();
    }
}
