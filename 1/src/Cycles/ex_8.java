package Cycles;

import java.util.HashSet;
import java.util.Set;

public class ex_8 {
    public static void main(String[] args) {
        int firstNumber = 123456;
        int secondNumber = 567891;

        Set<Integer> firstDigits = getUniqueDigits(firstNumber);

        Set<Integer> secondDigits = getUniqueDigits(secondNumber);

        firstDigits.retainAll(secondDigits);

        System.out.println("Цифры, входящие в оба числа:");
        for (int digit : firstDigits) {
            System.out.print(digit + " ");
        }
    }

    private static Set<Integer> getUniqueDigits(int number) {
        Set<Integer> digits = new HashSet<>();
        while (number > 0) {
            int digit = number % 10;
            digits.add(digit);
            number /= 10;
        }
        return digits;
    }
}
