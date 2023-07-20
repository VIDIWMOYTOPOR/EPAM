package OneDimensionalArrays;

import java.util.Arrays;

public class ex_2 {
    public static void main(String[] args) {
        double[] array = {1.5, 2.3, 3.7, 4.1, 5.9};
        double z = 3.0;

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }

        System.out.println("Количество замен: " + counter);
        System.out.println("Измененная последовательность: " + Arrays.toString(array));
    }
}
