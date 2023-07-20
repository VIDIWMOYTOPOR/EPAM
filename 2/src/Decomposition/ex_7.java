package Decomposition;

public class ex_7 {
    public static void main(String[] args) {
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9: " + sumOfOddFactorials(1, 9));
    }

    public static int sumOfOddFactorials(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i += 2) {
            sum += factorial(i);
        }

        return sum;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
