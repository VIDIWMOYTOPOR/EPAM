package OneDimensionalArrays;

import java.util.Arrays;

public class ex_8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                count++;
            }
        }

        System.out.println("Кол-во: " + count + "мин:  " + min);


        int[] newArray = new int[array.length - count];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                newArray[j] = array[i];
                j++;
            }
        }

        System.out.print(Arrays.toString(newArray));
    }
}
