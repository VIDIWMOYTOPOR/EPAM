package Sorting;

import java.util.Arrays;

public class ex_4 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 4, 1, 9, 3, 6, 7};

        int swaps = exchangeSort(array);

        System.out.println("Результат сортировки обменами: " + Arrays.toString(array));
        System.out.println("Количество перестановок: " + swaps);
    }

    public static int exchangeSort(int[] array) {
        int swaps = 0;

        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                    swaps++;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return swaps;
    }

}
