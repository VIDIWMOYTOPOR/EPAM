package Decomposition;

public class ex_2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int c = 24;
        int d = 36;

        int gcd = findGreatestCommonDivisor(a, b, c, d);

        System.out.println("Наибольший общий делитель (НОД): " + gcd);
    }

    public static int findGreatestCommonDivisor(int a, int b, int c, int d) {
        return findGreatestCommonDivisor(findGreatestCommonDivisor(a, b), findGreatestCommonDivisor(c, d));
    }

    public static int findGreatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
