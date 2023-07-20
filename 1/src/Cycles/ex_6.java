package Cycles;

public class ex_6 {
    public static void main(String[] args) {
        String str = "Hello World";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int value = (int)c;
            System.out.println("Символ: " + c + ", Численное обозначение: " + value);
        }
    }
}
