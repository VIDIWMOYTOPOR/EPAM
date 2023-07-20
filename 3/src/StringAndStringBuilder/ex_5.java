package StringAndStringBuilder;

public class ex_5 {
    public static void main(String[] args) {
        String str = "Заявление об этом выпустила пресс-служба " +
                "национального парка. Бортничество было вытеснено рамочным пчеловодством в конце ХIХ века.";

        System.out.println("Количество вхождений буквы 'а': " + countLetterA(str));
    }

    public static int countLetterA(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'а' || str.charAt(i) == 'А') {
                count++;
            }
        }

        return count;
    }
}
