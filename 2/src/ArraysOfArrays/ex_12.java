package ArraysOfArrays;

import java.util.Arrays;
import java.util.Comparator;

public class ex_12 {
    public static void main(String[] args) {
        Integer[][] array = new Integer[4][5];

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                array[i][j] = (int) (Math.random() * 5) + 1;
            }
        }
        printArray(array);

        for (int i = 0; i < array.length; ++i) {
            if (i % 2 == 0) {
                Arrays.sort(array[i], Comparator.naturalOrder());
            } else {
                Arrays.sort(array[i], Comparator.reverseOrder());
            }
        }

        printArray(array);
    }

    public static void printArray(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
