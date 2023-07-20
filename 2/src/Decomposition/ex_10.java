package Decomposition;

import java.util.Arrays;

public class ex_10 {
    public static void main(String[] args) {
        System.out.println("Массив цифр числа N: " + Arrays.toString(formDigitsArray(123456789)));
    }

    public static int[] formDigitsArray(int n) {
        int digitCount = String.valueOf(n).length();

        int[] digits = new int[digitCount];

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;
    }
}
