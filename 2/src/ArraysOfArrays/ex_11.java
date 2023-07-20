package ArraysOfArrays;

public class ex_11 {
    public static void main(String[] args) {
        int[][] array = new int[10][20];

        for (int i = 0; i < array.length; ++i) {
            int k = 0;
            for (int j = 0; j < array[i].length; ++j) {
                array[i][j] = (int) (Math.random() * 15);
                if (array[i][j] == 5) {
                    k++;
                }
            }
            if (k >= 3) {
                System.out.println("строка  : " + (i + 1));
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
