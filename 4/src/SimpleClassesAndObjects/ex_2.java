package SimpleClassesAndObjects;

public class ex_2 {
    public static void main(String[] args) {
         class Test {
            private int first;
            private int second;

            public Test(int first, int second) {
                this.first = first;
                this.second = second;
            }

            public Test() {
                this.first = 0;
                this.second = 0;
            }

            public void setFirst(int value) {
                first = value;
            }

            public void setSecond(int value) {
                second = value;
            }

            public int getFirst() {
                return first;
            }

            public int getSecond() {
                return second;
            }
        }
        Test test1 = new Test(10, 5);
        System.out.println("1: " + test1.getFirst());
        System.out.println("2: " + test1.getSecond());

        Test test2 = new Test();
        test2.setFirst(20);
        test2.setSecond(15);
        System.out.println("1: " + test2.getFirst());
        System.out.println("2: " + test2.getSecond());
    }
}
