package Sorting;

import java.util.Arrays;

public class ex_2 {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 6, 7, 8};
        int[] secondArray = {2, 3, 4, 7, 10};
        int size = firstArray.length;

        firstArray = mergeArrays(firstArray, firstArray.length + secondArray.length);

        System.arraycopy(secondArray ,0, firstArray, size,secondArray.length );
        Arrays.sort(firstArray);

        System.out.println(Arrays.toString(firstArray));
    }
    public static int[] mergeArrays(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
