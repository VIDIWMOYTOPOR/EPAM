package StringsAsArraySymbols;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex_4 {
    public static void main(String[] args) {
        System.out.println("Количество чисел в строке: " + countNumbers("There are 123 numbers in this string"));
    }

    public static int countNumbers(String str) {
        String regex = "\\b\\d+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        int numberCount = 0;
        while (matcher.find()) {
            numberCount++;
        }

        return numberCount;
    }
}
