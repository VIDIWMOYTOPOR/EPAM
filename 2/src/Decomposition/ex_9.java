package Decomposition;

public class ex_9 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 7.0;
        double z = 6.0;
        double t = 8.0;

        System.out.println("Площадь четырехугольника: " + calculateQuadrilateralArea(x, y, z, t));
    }

    public static double calculateQuadrilateralArea(double x, double y, double z, double t) {
        return (0.5 * x * y) + (calculateTriangleArea(z, t, Math.sqrt(x * x + y * y)));
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
