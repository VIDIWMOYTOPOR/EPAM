package StringAndStringBuilder;

import java.util.HashSet;
import java.util.Set;

public class ex_7 {
    public static void main(String[] args) {
        String str = "abc cde def";

        System.out.println("Исходная строка: " + str);
        System.out.println("Модифицированная строка: " + removeDuplicatesAndSpaces(str));
    }

    public static String removeDuplicatesAndSpaces(String str) {
        String strWithoutSpaces = str.replaceAll(" ", "");

        Set<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < strWithoutSpaces.length(); i++) {
            char c = strWithoutSpaces.charAt(i);
            uniqueChars.add(c);
        }

        StringBuilder modifiedStr = new StringBuilder();
        for (char c : uniqueChars) {
            modifiedStr.append(c);
        }

        return modifiedStr.toString();
    }
}
