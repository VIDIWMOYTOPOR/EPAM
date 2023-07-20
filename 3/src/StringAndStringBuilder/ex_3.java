package StringAndStringBuilder;

public class ex_3 {
    public static void main(String[] args) {
        String word = "level";

        System.out.println("Слово " + word + " является палиндромом: " + checkPalindrome(word));
    }

    public static boolean checkPalindrome(String word) {
        word = word.toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
