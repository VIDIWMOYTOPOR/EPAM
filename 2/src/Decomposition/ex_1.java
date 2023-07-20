package Decomposition;

public class ex_1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int gcd = findGreatestCommonDivisor(a, b);
        int lcm = findLeastCommonMultiple(a, b);

        System.out.println("Наибольший общий делитель (НОД): " + gcd);
        System.out.println("Наименьшее общее кратное (НОК): " + lcm);
    }

    public static int findGreatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLeastCommonMultiple(int a, int b) {
        int gcd = findGreatestCommonDivisor(a, b);
        return (a * b) / gcd;
    }
}
