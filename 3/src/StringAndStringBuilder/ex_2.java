package StringAndStringBuilder;

public class ex_2 {
    public static void main(String[] args) {
        String text = "This is a test string.";

        System.out.println("Исходная строка: " + text);
        System.out.println("Модифицированная строка: " + insertCharacterAfterA(text));
    }

    public static String insertCharacterAfterA(String text) {
        StringBuilder modifiedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            modifiedText.append(c);

            if (c == 'a') {
                modifiedText.append('b');
            }
        }

        return modifiedText.toString();
    }
}
