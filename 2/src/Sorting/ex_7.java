package Sorting;

public class ex_7 {
    public static void main(String[] args) {
        double[] a = {1.5, 2.5, 3.5, 6.0, 7.0};
        double[] b = {1.0, 2.0, 4.0, 5.5, 6.5, 8.0};

        printInsertionPoints(a, b);
    }

    public static void printInsertionPoints(double[] a, double[] b) {
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                i++;
            } else {
                System.out.println(i);
                j++;
            }
        }

        while (j < b.length) {
            System.out.println(i);
            j++;
        }

        while (i < a.length) {
            System.out.println(b.length + a.length - i);
            i++;
        }
    }
}
