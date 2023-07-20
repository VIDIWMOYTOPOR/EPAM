package Decomposition;

public class ex_13 {
    public static void main(String[] args) {
        printTwinPrimes(10); //n,2n
    }

    public static void printTwinPrimes(int n) {
        for (int i = n; i <= 2 * n - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println(i + " и " + (i + 2) + " являются близнецами.");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
