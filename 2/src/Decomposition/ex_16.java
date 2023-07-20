package Decomposition;

public class ex_16 {
    public static void main(String[] args) {

        int sum = calculateSumOfOddNumbers(3);
        int evenDigitCount = countEvenDigits(sum);

        System.out.println("Сумма n-значных чисел, содержащих только нечетные цифры: " + sum);
        System.out.println("Количество четных цифр в сумме: " + evenDigitCount);
    }

    public static int calculateSumOfOddNumbers(int n) {
        int start = (int) Math.pow(10, n - 1);
        int end = (int) Math.pow(10, n);
        int sum = 0;

        for (int i = start; i < end; i++) {
            if (hasOnlyOddDigits(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean hasOnlyOddDigits(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

    public static int countEvenDigits(int number) {
        int count = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }

        return count;
    }
}
