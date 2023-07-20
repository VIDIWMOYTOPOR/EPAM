package Sorting;

import java.util.Arrays;

public class ex_6 {
    public static void main(String[] args) {
        double[] array = {5.2, 2.1, 8.7, 4.3, 1.9, 9.6, 3.5};

        shellSort(array);

        System.out.println("Результат сортировки Шелла: " + Arrays.toString(array));
    }

    public static void shellSort(double[] array) {
        int k = array.length / 2;

        while (k > 0) {
            for (int i = k; i < array.length; i++) {
                double temp = array[i];
                int j = i;

                while (j >= k && array[j - k] > temp) {
                    array[j] = array[j - k];
                    j -= k;
                }

                array[j] = temp;
            }

            k /= 2;
        }
    }
}
