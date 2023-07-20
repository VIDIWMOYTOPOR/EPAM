package OneDimensionalArrays;

import java.util.Arrays;

public class ex_4 {
    public static void main(String[] args) {
        double[] array = {1.5, -2.3, 0.0, -4.1, 5.9};

        int min = 0;
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;
            }
        }

        double c = array[min];
        array[min] = array[max];
        array[max] = c;

        System.out.println("Измененный массив: " + Arrays.toString(array));
    }
}