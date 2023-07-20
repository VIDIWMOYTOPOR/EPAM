package StringAndStringBuilder;

public class ex_6 {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Исходная строка: " + str);
        System.out.println("Результат: " + repeatCharacters(str));
    }

    public static String repeatCharacters(String str) {
        StringBuilder repeatedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            repeatedStr.append(c).append(c);
        }

        return repeatedStr.toString();
    }
}
