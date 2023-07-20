package Decomposition;

public class ex_15 {
    public static void main(String[] args) {
        findIncreasingNumbers(4);
    }

    public static void findIncreasingNumbers(int n) {
        int start = (int) Math.pow(10, n - 1);
        int end = (int) Math.pow(10, n);

        for (int i = start; i < end; i++) {
            if (isIncreasingNumber(i)) {
                System.out.println(i + " является числом с возрастающими цифрами.");
            }
        }
    }

    public static boolean isIncreasingNumber(int number) {
        int lastDigit = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit <= lastDigit) {
                return false;
            }
            lastDigit = digit;
            number /= 10;
        }

        return true;
    }
}
