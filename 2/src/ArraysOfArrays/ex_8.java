package ArraysOfArrays;

public class ex_8 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        int firstColumn = 1;
        int secondColumn = 4;

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                int k = 0;
                if ((j + 1) == firstColumn) {
                    k = array[i][secondColumn - 1];
                    array[i][secondColumn - 1] = array[i][firstColumn - 1];
                    array[i][firstColumn - 1] = k;
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
}
