package Branching;

public class ex_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int firstMin = Math.min(a, b);
        int secondMin = Math.min(c, d);

        int result = Math.max(firstMin, secondMin);

        System.out.println("Result: " + result);
    }
}
