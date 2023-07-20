package StringsAsArraySymbols;

public class ex_2 {
    public static void main(String[] args) {
        System.out.println(replaceWordWithLetter("This is a word. Another word."));
    }

    public static String replaceWordWithLetter(String str) {
        return str.replace("word", "letter");
    }
}
