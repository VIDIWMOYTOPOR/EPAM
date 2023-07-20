package SimpleClassesAndObjects;

import java.awt.*;

public class ex_7 {
    public static void main(String[] args) {
        class Triangle {
            private Point pointA;
            private Point pointB;
            private Point pointC;

            public Triangle(Point pointA, Point pointB, Point pointC) {
                this.pointA = pointA;
                this.pointB = pointB;
                this.pointC = pointC;
            }

            public double calculatePerimeter() {
                double sideAB = calculateDistance(pointA, pointB);
                double sideBC = calculateDistance(pointB, pointC);
                double sideCA = calculateDistance(pointC, pointA);

                return sideAB + sideBC + sideCA;
            }

            public double calculateArea() {
                double sideAB = calculateDistance(pointA, pointB);
                double sideBC = calculateDistance(pointB, pointC);
                double sideCA = calculateDistance(pointC, pointA);

                double semiperimeter = calculatePerimeter() / 2;

                return Math.sqrt(semiperimeter * (semiperimeter - sideAB) * (semiperimeter - sideBC) * (semiperimeter - sideCA));
            }

            public Point calculateCentroid() {
                double centroidX = (pointA.getX() + pointB.getX() + pointC.getX()) / 3;
                double centroidY = (pointA.getY() + pointB.getY() + pointC.getY()) / 3;

                return new Point((int) centroidX, (int) centroidY);
            }

            private double calculateDistance(Point point1, Point point2) {
                double xDiff = point2.getX() - point1.getX();
                double yDiff = point2.getY() - point1.getY();

                return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
            }
        }

        Point pointA = new Point(0, 0);
        Point pointB = new Point(4, 0);
        Point pointC = new Point(2, 3);

        Triangle triangle = new Triangle(pointA, pointB, pointC);

        double perimeter = triangle.calculatePerimeter();
        System.out.println("Периметр треугольника: " + perimeter);

        double area = triangle.calculateArea();
        System.out.println("Площадь треугольника: " + area);

        Point centroid = triangle.calculateCentroid();
        System.out.println("Точка пересечения медиан: (" + centroid.getX() + ", " + centroid.getY() + ")");
    }
}
