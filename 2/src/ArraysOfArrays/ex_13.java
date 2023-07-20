package ArraysOfArrays;

import java.util.Arrays;
import java.util.Comparator;

public class ex_13 {
    public static void main(String[] args) {
        int[][] array = new int[4][5];

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                array[i][j] = (int) (Math.random() * 5) + 1;
            }
        }

        printArray(array);

        for (int i = 0; i < array[0].length; ++i) {
            if (i % 2 == 0) {
                ascSort(array, i);
            } else {
                descSort(array, i);
            }
        }

        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void descSort(int[][] arr, int pos) {
        int[] buf = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            buf[i] = arr[i][pos];
        }

        Arrays.sort(buf);

        for (int i = 0; i < arr.length; ++i) {
            arr[i][pos] = buf[i];
        }
    }

    public static void ascSort(int[][] array, int position) {
        Integer[] buf = new Integer[array.length];
        for (int i = 0; i < array.length; ++i) {
            buf[i] = array[i][position];
        }

        Arrays.sort(buf, Comparator.reverseOrder());

        for (int i = 0; i < array.length; ++i) {
            array[i][position] = buf[i];
        }
    }
}
