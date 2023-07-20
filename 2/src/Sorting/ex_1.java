package Sorting;

import java.util.Arrays;

public class ex_1 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10};

        int k = 2;

        firstArray = mergeArrays(firstArray, firstArray.length + secondArray.length);

        for (int i = firstArray.length - 1 - secondArray.length; i >= k; i--) {
            firstArray[i + secondArray.length] = firstArray[i];
        }


        for (int i = 0; i < secondArray.length; i++) {
            firstArray[k + 1 + i] = secondArray[i];
        }

        System.out.println(Arrays.toString(firstArray));
    }

    public static int[] mergeArrays(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
