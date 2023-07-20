package Decomposition;

public class ex_3 {
    public static void main(String[] args) {
        double length = 5.0;

        System.out.println("Площадь правильного шестиугольника: " + calculateHexagonArea(length));
    }

    public static double calculateHexagonArea(double side) {
        return calculateTriangleArea(side) * 6;
    }

    public static double calculateTriangleArea(double side) {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }
}
