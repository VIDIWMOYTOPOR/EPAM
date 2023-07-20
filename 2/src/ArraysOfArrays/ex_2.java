package ArraysOfArrays;

public class ex_2 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printDiagonalElements(array);
    }

    public static void printDiagonalElements(int[][] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            System.out.print(array[i][i] + " ");
        }
    }
}
