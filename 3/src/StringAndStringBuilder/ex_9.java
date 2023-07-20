package StringAndStringBuilder;

public class ex_9 {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Исходная строка: " + str);
        System.out.println("Количество строчных букв: " + countLowercaseLetters(str));
        System.out.println("Количество прописных букв: " + countUppercaseLetters(str));
    }

    public static int countLowercaseLetters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c) && isEnglishLetter(c)) {
                count++;
            }
        }

        return count;
    }

    public static int countUppercaseLetters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c) && isEnglishLetter(c)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isEnglishLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
