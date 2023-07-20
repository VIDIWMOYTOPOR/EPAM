package OneDimensionalArrays;

import java.util.Arrays;

public class ex_10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        compressArray(array);

        System.out.println("Результат сжатия массива:" + Arrays.toString(array));
    }

    public static void compressArray(int[] array) {
        int j = 0;

        for (int i = 0; i < array.length; i += 2) {
            array[j] = array[i];
            j++;
        }

        for (int i = j; i < array.length; i++) {
            array[i] = 0;
        }
    }
}
