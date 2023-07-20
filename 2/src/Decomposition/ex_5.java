package Decomposition;

public class ex_5 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3, 1};

        int secondLargest = findSecondLargest(array);

        System.out.println("Второе по величине число в массиве: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }
}
