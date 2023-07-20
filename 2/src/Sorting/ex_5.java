package Sorting;

import java.util.Arrays;

public class ex_5 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 4, 1, 9, 3, 6, 7};

        insertionSort(array);

        System.out.println("Результат сортировки вставками: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            int insertionIndex = binarySearch(array, key, 0, j);

            while (j >= insertionIndex) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static int binarySearch(int[] array, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
