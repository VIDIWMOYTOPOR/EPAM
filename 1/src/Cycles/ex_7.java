package Cycles;

import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение m: ");
        int m = scanner.nextInt();

        System.out.println("Введите значение n: ");
        int n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.println("Делители числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(j + " ");
                }
            }
        }
    }
}
