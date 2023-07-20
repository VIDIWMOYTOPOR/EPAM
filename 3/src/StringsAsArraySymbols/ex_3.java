package StringsAsArraySymbols;

public class ex_3 {
    public static void main(String[] args) {
        System.out.println("Количество цифр в строке: " + countDigits( "qwe123asd456"));
    }

    public static int countDigits(String str) {
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        return digitCount;
    }
}
