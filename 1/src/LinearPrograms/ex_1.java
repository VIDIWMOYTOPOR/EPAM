package LinearPrograms;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();
        int z = ((a - 3) * b / 2) + c;
        System.out.println("Total = " + z);
        scanner.close();
    }
}