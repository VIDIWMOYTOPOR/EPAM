package ArraysOfArrays;

public class ex_3 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int k = 1;
        int p = 1;

        printRowAndColumn(array, k, p);
    }

    public static void printRowAndColumn(int[][] array, int row, int column) {
        int rows = array.length;
        int cols = array[0].length;

        if (row >= 0 && row < rows) {
            System.out.println("Строка " + (row + 1) + ":");
            for (int j = 0; j < cols; j++) {
                System.out.print(array[row][j] + " ");
            }
            System.out.println();
        }

        if (column >= 0 && column < cols) {
            System.out.println("Столбец " + (column + 1) + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(array[i][column]);
            }
        }
    }
}
