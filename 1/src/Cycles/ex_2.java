package Cycles;

public class ex_2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double h = 0.5;

        for (double x = a; x <= b; x += h) {
            double y;
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}
