package Branching;

public class ex_3 {
    public static void main(String[] args) {
        int x_1 = 1;
        int y_1 = 1;
        int x_2 = 2;
        int y_2 = 2;
        int x_3 = 3;
        int y_3 = 3;

        if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)){
            System.out.println("Points lie on the same line");
        }else{
            System.out.println("Points don't lie on the same line");
        }
    }
}
