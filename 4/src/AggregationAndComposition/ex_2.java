package AggregationAndComposition;

public class ex_2 {
    public static void main(String[] args) {
        class Wheel {
            private boolean intact;

            public Wheel(boolean intact) {
                this.intact = intact;
            }

            public boolean isIntact() {
                return intact;
            }
        }

        class Engine {
            private boolean running;

            public Engine() {
                this.running = false;
            }

            public void start() {
                running = true;
                System.out.println("Engine started.");
            }

            public void stop() {
                running = false;
                System.out.println("Engine stopped.");
            }

            public boolean isRunning() {
                return running;
            }
        }

        class Car {
            private String brand;
            private Wheel[] wheels;
            private Engine engine;

            public Car(String brand, int numWheels, Engine engine) {
                this.brand = brand;
                this.wheels = new Wheel[numWheels];
                this.engine = engine;
            }

            public void drive() {
                if (engine.isRunning() && allWheelsIntact()) {
                    System.out.println("The car is driving.");
                } else {
                    System.out.println("Cannot drive. Check the engine and wheels.");
                }
            }

            public void refuel() {
                System.out.println("The car is refueling.");
            }

            public void changeWheel(int wheelIndex, Wheel newWheel) {
                if (wheelIndex >= 0 && wheelIndex < wheels.length) {
                    wheels[wheelIndex] = newWheel;
                    System.out.println("Changed wheel at index " + wheelIndex);
                } else {
                    System.out.println("Invalid wheel index.");
                }
            }

            public void printBrand() {
                System.out.println("Car brand: " + brand);
            }

            private boolean allWheelsIntact() {
                for (Wheel wheel : wheels) {
                    if (wheel == null || !wheel.isIntact()) {
                        return false;
                    }
                }
                return true;
            }
        }

        Engine engine = new Engine();
        engine.start();

        Wheel[] wheels = {new Wheel(true), new Wheel(true), new Wheel(true), new Wheel(true)};

        Car car = new Car("Toyota", 4, engine);
        car.printBrand();

        car.changeWheel(2, new Wheel(false));

        car.drive();

        engine.stop();
    }
}
