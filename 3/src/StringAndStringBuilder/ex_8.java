package StringAndStringBuilder;

public class ex_8 {
    public static void main(String[] args) {
        String str = "This is a test string for finding the longest word";

        System.out.println("Исходная строка: " + str);
        System.out.println("Самое длинное слово: " + findLongestWord(str));
    }

    public static String findLongestWord(String str) {
        String[] words = str.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
