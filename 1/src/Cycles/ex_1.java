package Cycles;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter positive number");
        int x = scanner.nextInt();

        int result = 0;
        if(x > 0){
            for(int i = 0; i <= x; i++){
                result += i;
            }
            System.out.println("Result: " + result);
        }
    }
}
