package Decomposition;

public class ex_11 {
    public static void main(String[] args) {
        System.out.println(compareDigitCount(123456, 987654321));
    }

    public static String compareDigitCount(int firstNumber, int secondNumber) {
        int firstDigitCount = String.valueOf(firstNumber).length();
        int secondDigitCount = String.valueOf(secondNumber).length();

        if (firstDigitCount > secondDigitCount) {
            return "В числе " + firstNumber + " больше цифр, чем в числе " + secondNumber + ".";
        } else if (firstDigitCount < secondDigitCount) {
            return "В числе " + secondNumber + " больше цифр, чем в числе " + firstNumber + ".";
        } else {
            return "В числах " + firstNumber + " и " + secondNumber + " одинаковое количество цифр.";
        }
    }
}
