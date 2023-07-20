package StringAndStringBuilder;

public class ex_1 {
    public static void main(String[] args) {
        String text = "This   is   a  test   string   with multiple spaces.";

        System.out.println("Исходный текст: " + text);
        System.out.println("Наибольшее количество подряд идущих пробелов: " + findMaxConsecutiveSpaces(text));
    }

    public static int findMaxConsecutiveSpaces(String text) {
        int maxConsecutiveSpaces = 0;
        int consecutiveSpaces = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                consecutiveSpaces++;

                if (consecutiveSpaces > maxConsecutiveSpaces) {
                    maxConsecutiveSpaces = consecutiveSpaces;
                }
            } else {
                consecutiveSpaces = 0;
            }
        }

        return maxConsecutiveSpaces;
    }
}
