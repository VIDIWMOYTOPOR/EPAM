package OneDimensionalArrays;

public class ex_9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 2, 3, 3};

        int count = 0;
        int inc = 0;
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count >= inc) {
                if (count == inc) {
                    if (array[i] < num) {
                        num = array[i];
                    }
                } else {
                    num = array[i];
                }

                inc = count;
            }
            count = 0;
        }
        System.out.println("Кол-во" + inc + " минимальное число " + num);
    }
}
