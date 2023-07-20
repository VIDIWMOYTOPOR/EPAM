package ArraysOfArrays;

import java.util.Arrays;

public class ex_1 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        printOddColumns(array);
    }

    public static void printOddColumns(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        for (int col = 0; col < cols; col += 2) {
            if (array[0][col] > array[rows - 1][col]) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(array[row][col] + " ");
                }
                System.out.println();
            }
        }
    }
}
