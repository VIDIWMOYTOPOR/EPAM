package Decomposition;

public class ex_17 {
    public static void main(String[] args) {
        System.out.println("Количество действий: " + countSubtractionSteps(987));
    }

    public static int countSubtractionSteps(int number) {
        int steps = 0;

        while (number != 0) {
            int digitSum = sumOfDigits(number);
            number -= digitSum;
            steps++;
        }

        return steps;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
