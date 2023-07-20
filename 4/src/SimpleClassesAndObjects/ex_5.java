package SimpleClassesAndObjects;

public class ex_5 {
    public static void main(String[] args) {
        class Counter {
            private int minValue;
            private int maxValue;
            private int value;

            public Counter() {
                minValue = 0;
                maxValue = 10;
                value = minValue;
            }

            public Counter(int minValue, int maxValue) {
                this.minValue = minValue;
                this.maxValue = maxValue;
                value = minValue;
            }

            public void increment() {
                if (value < maxValue) {
                    value++;
                } else {
                    System.out.println("Достигнуто максимальное значение счетчика.");
                }
            }

            public void decrement() {
                if (value > minValue) {
                    value--;
                } else {
                    System.out.println("Достигнуто минимальное значение счетчика.");
                }
            }

            public int getValue() {
                return value;
            }
        }

        Counter counter1 = new Counter();
        Counter counter2 = new Counter(5, 15);

        System.out.println("Значение счетчика counter1: " + counter1.getValue());
        counter1.increment();
        counter1.increment();
        counter1.decrement();
        System.out.println("Текущее значение счетчика counter1: " + counter1.getValue());

        System.out.println();

        System.out.println("Значение счетчика counter2: " + counter2.getValue());
        counter2.increment();
        counter2.decrement();
        counter2.decrement();
        System.out.println("Текущее значение счетчика counter2: " + counter2.getValue());
    }
}
