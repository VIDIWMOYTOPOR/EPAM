package Decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex_12 {
    public static void main(String[] args) {
        System.out.println("Массив A: " + Arrays.toString(generateArray(5, 100)));
    }

    public static int[] generateArray(int K, int N) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (sumOfDigits(i) == K) {
                list.add(i);
            }
        }

        int[] A = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            A[i] = list.get(i);
        }

        return A;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
