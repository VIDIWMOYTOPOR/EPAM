package StringAndStringBuilder;

public class ex_10 {
    public static void main(String[] args) {
        String str = "Предложение номер 1. Предложение номер 2! Предложение номер 3?";

        System.out.println("Исходная строка: " + str);
        System.out.println("Количество предложений: " + countSentences(str));
    }

    public static int countSentences(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                count++;
            }
        }

        return count;
    }
}
