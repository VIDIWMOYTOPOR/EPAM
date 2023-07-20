package LinearPrograms;

import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();

        System.out.println(String.format("Do the coordinates (%d, %d) belong to the graph? Answer: %b ", x, y, isBelong(x, y)));
        scanner.close();
    }

    public static boolean isBelong(int x, int y) {
        int firstFigureCoordinateXMin = -2;
        int firstFigureCoordinateXMax = 2;
        int firstFigureCoordinateYMax = 4;

        int secondFigureCoordinateXMin = -4;
        int secondFigureCoordinateXMax = 4;
        int secondFigureCoordinateYMin = -3;

        if(y >= 0){
            return y <= firstFigureCoordinateYMax && (x <= firstFigureCoordinateXMin || x <= firstFigureCoordinateXMax);
        }
        else{
            return y >= secondFigureCoordinateYMin && (x <= secondFigureCoordinateXMin || x <= secondFigureCoordinateXMax);
        }
    }
}
