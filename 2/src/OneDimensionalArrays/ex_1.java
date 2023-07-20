package OneDimensionalArrays;

public class ex_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }

        System.out.println("Сумма элементов, кратных " + k + ": " + sum);
    }
}