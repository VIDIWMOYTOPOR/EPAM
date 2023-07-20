package ArraysOfArrays;

public class ex_16 {
    public static void main(String[] args) {

        int n = 3;

        int[][] magicSquare = new int[n][n];

        int row = n - 1;
        int col = n / 2;
        int num = 1;

        while (num <= n * n) {
            magicSquare[row][col] = num;
            num++;

            int nextRow = (row + 1) % n;
            int nextCol = (col + 1) % n;

            if (magicSquare[nextRow][nextCol] != 0) {
                row = (row - 1 + n) % n;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
