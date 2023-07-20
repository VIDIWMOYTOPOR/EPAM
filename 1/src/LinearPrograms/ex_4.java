package LinearPrograms;

public class ex_4 {
    public static void main(String[] args) {
        double r = 111.222;
        System.out.println(r);
        String st = String.valueOf(r);
        String[] parts = st.split("\\.");
        double z = Double.parseDouble(parts[1] + '.' + parts[0]);
        System.out.println(z);
    }
}
