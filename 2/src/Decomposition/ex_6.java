package Decomposition;

public class ex_6 {
    public static void main(String[] args) {
        int a = 12;
        int b = 25;
        int c = 9;

        boolean arePrime = checkPrime(a, b, c);

        if (arePrime) {
            System.out.println("Числа являются взаимно простыми.");
        } else {
            System.out.println("Числа не являются взаимно простыми.");
        }
    }

    public static boolean checkPrime(int a, int b, int c) {
        int gcdAB = findGreatestCommonDivisor(a, b);
        int gcdABC = findGreatestCommonDivisor(gcdAB, c);

        return gcdABC == 1;
    }

    public static int findGreatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
