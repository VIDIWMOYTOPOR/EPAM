package ArraysOfArrays;

public class ex_7 {
    public static void main(String[] args) {
        int n = 7;
        double[][] array = new double[n][n];
        int countPositive = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.sin((i * i - j * j) / n);
                if (array[i][j] > 0){
                    countPositive++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%7.2f",array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Кол-во положительных элементов: " + countPositive);
    }
}
