package SimpleClassesAndObjects;

public class ex_1 {
    public static void main(String[] args) {
        class Test {
            private int first;
            private int second;

            public void setFirst(int value) {
                first = value;
            }

            public void setSecond(int value) {
                second = value;
            }

            public void displayVariables() {
                System.out.println("1: " + first);
                System.out.println("2: " + second);
            }

            public int getSum() {
                return first + second;
            }

            public int getMaxValue() {
                return Math.max(first, second);
            }
        }

        Test test = new Test();

        test.setFirst(10);
        test.setSecond(5);

        test.displayVariables();

        int sum = test.getSum();
        System.out.println("сумма: " + sum);

        int maxValue = test.getMaxValue();
        System.out.println("максимальное значение: " + maxValue);
    }
}
