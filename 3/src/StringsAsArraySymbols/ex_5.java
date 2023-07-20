package StringsAsArraySymbols;

public class ex_5 {
    public static void main(String[] args) {
        String str = "  This   is  a    test   string   ";

        System.out.println("Исходная строка: " + str);
        System.out.println("Обработанная строка: " + removeExtraSpaces(str));
    }

    public static String removeExtraSpaces(String str) {
        return str
                .trim()
                .replaceAll("\\s+", " ");
    }
}
