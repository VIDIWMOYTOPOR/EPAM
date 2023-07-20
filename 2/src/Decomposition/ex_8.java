package Decomposition;

public class ex_8 {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 3, 6, 9, 1};

        int sum1 = calculateSum(array, 1, 3);
        int sum2 = calculateSum(array, 3, 5);
        int sum3 = calculateSum(array, 4, 6);

        System.out.println("Сумма D[1] + D[2] + D[3]: " + sum1);
        System.out.println("Сумма D[3] + D[4] + D[5]: " + sum2);
        System.out.println("Сумма D[4] + D[5] + D[6]: " + sum3);
    }

    public static int calculateSum(int[] array, int k, int m) {
        int sum = 0;

        for (int i = k; i <= m; i++) {
            sum += array[i];
        }

        return sum;
    }
}
