package Cycles;

public class ex_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
