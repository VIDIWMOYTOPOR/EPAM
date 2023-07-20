package OneDimensionalArrays;

public class ex_7 {
    public static void main(String[] args) {
        double[] array = {1.5, 2.7, 3.7, 4.1, 5.9, 6.6};
        double max = array[0] + array[array.length - 1];

        double sum;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            sum = (array[i] + array[j]);
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("max(a1 + a2n, a2 + a2n−1 ... an + an+1) = " + max);
    }
}
