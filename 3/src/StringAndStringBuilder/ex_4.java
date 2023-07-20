package StringAndStringBuilder;

public class ex_4 {
    public static void main(String[] args) {
        String word = "информатика";

        System.out.println("Исходное слово: " + word);
        System.out.println("Составленное слово: " + createCake(word));
    }

    public static String createCake(String word) {
        String part1 = word.substring(7, 8);
        String part2 = word.substring(3, 5);
        String part3 = word.substring(7, 8);

        return part1 + part2 + part3;
    }
}
