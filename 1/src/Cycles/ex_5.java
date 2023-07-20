package Cycles;

public class ex_5 {
    public static void main(String[] args) {
        double e = 0.1;
        double sum = 0;
        for (int i = 1; i < 100; i++) {
            double a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

            if (Math.abs(a) >= e) {
                sum += a;
                System.out.printf("sum", a, sum);
            }
        }
    }
}
