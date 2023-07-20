package OneDimensionalArrays;

public class ex_5 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 4};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }
}
