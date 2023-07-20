package Sorting;

public class ex_8 {
    public static void main(String[] args) {
        int[] numerators = {3, 1, 2};
        int[] denominators = {4, 2, 3};

        sortFractions(numerators, denominators);

        System.out.println("Результат приведения дробей к общему знаменателю и упорядочивания:");
        for (int i = 0; i < numerators.length; i++) {
            System.out.println(numerators[i] + "/" + denominators[i]);
        }
    }

    public static void sortFractions(int[] numerators, int[] denominators) {
        int commonDenominator = findCommonDenominator(denominators);

        for (int i = 0; i < numerators.length; i++) {
            numerators[i] *= commonDenominator / denominators[i];
            denominators[i] = commonDenominator;
        }

        for (int i = 0; i < numerators.length - 1; i++) {
            for (int j = i + 1; j < numerators.length; j++) {
                if (numerators[i] > numerators[j]) {
                    swap(numerators, i, j);
                    swap(denominators, i, j);
                }
            }
        }
    }

    public static int findCommonDenominator(int[] denominators) {
        int result = denominators[0];

        for (int i = 1; i < denominators.length; i++) {
            result = lcm(result, denominators[i]);
        }

        return result;
    }

    public static int lcm(int a, int b) { //Наименьшее общее кратное
        return (a * b) / gcd(a, b);
    }

    public static int gcd(int a, int b) { //Наибольший общий делитель
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
