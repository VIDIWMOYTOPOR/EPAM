package Sorting;

import java.util.Arrays;

public class ex_3 {
    public static void main(String[] args) {
        int[] array = {2, 6, 1, 3, 4, 7, 5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }
}
