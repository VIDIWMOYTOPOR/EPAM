package ArraysOfArrays;

public class ex_6 {
    public static void main(String[] args) {
        int n = 10;
        int[][] array = new int[n][n];
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = i; j < n - i; j++) {
                array[i][j] = 1;
            }

        }
        for (int i = n / 2; i < n; i++) {
            for (int j = n - i - 1; j < i + 1; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
