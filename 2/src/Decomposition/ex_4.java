package Decomposition;

public class ex_4 {
    public static void main(String[] args) {
        double[][] points = {{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}, {7.0, 8.0}};

        int[] maxDistancePoints = findMaxDistancePoints(points);

        System.out.println("Между точками с индексами " + maxDistancePoints[0] + " и " + maxDistancePoints[1] + " самое большое расстояние.");
    }

    public static int[] findMaxDistancePoints(double[][] points) {
        int[] maxDistancePoints = new int[2];
        double maxDistance = 0.0;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = calculateDistance(points[i], points[j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    maxDistancePoints[0] = i;
                    maxDistancePoints[1] = j;
                }
            }
        }

        return maxDistancePoints;
    }

    public static double calculateDistance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
    }
}
