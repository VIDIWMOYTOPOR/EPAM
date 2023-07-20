package ArraysOfArrays;

public class ex_9 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {1, 2, 3, 5},
                {1, 2, 3, 6}
        };
        printArray(arr);

        int[] sum = new int[arr[0].length];
        int arrayLength = arr[0].length;
        int column = 0;

        while (arrayLength > 0) {
            for (int i = 0; i < arr.length; ++i) {
                sum[column] += arr[i][column];
            }
            column++;
            arrayLength--;
        }
        System.out.println();
        for (var i : sum) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(findMax(sum));
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int findMax(int[] sum) {
        int max = 0;
        for (int i = 0; i < sum.length; ++i) {
            if (sum[i] > sum[max]) {
                max = i;
            }
        }
        return max + 1;
    }
}
