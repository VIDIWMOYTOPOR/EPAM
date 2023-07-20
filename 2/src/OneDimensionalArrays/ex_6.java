package OneDimensionalArrays;

public class ex_6 {
    public static void main(String[] args) {
        double[] array = {1.5, 2.3, 3.7, 4.1, 5.9};

        double sum = 0.0;
        for (int i = 2; i < array.length; i++) {
            if (isPrime(i)) {
                System.out.println(array[i]);
                sum += array[i];
            }
        }

        System.out.println("Сумма чисел с простыми порядковыми номерами: " + sum);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
