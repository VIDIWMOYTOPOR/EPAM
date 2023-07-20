package LinearPrograms;

public class ex_5 {
    public static void main(String[] args) {
        int t = 3663;

        int hours = t / 3600;
        int minutes = (t % 3600) / 60;
        int seconds = (t % 3600) % 60;

        System.out.println(String.format("%dч-%dмин-%dс", hours, minutes, seconds));
    }
}
