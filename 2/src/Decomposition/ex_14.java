package Decomposition;

public class ex_14 {
    public static void main(String[] args) {
        findArmstrongNumbers(1000);
    }

    public static void findArmstrongNumbers(int k) {
        for (int i = 1; i <= k; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i + " является числом Армстронга.");
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int n = number;
        int digitCount = countDigits(number);
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        return sum == n;
    }

    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}
