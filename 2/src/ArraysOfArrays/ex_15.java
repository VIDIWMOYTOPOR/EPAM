package ArraysOfArrays;

public class ex_15 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        int max;
        max = findMax(array);
        System.out.println("Макс: " + max);

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
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

    public static int findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
