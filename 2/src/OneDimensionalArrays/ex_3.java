package OneDimensionalArrays;

public class ex_3 {
    public static void main(String[] args) {
        double[] array = {1.1, -1.1, 0.0, -2.2, 2.2, 0.0};
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveCounter++;
            } else if (array[i] < 0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        }

        System.out.println("Количество положительных элементов: " + positiveCounter);
        System.out.println("Количество отрицательных элементов: " + negativeCounter);
        System.out.println("Количество нулевых элементов: " + zeroCounter);
    }
}
