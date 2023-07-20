package Port;

import java.util.concurrent.Semaphore;

class Port {
    private int capacity;
    private int containersCount;
    private Semaphore semaphore;

    public Port(int capacity) {
        this.capacity = capacity;
        this.containersCount = 0;
        this.semaphore = new Semaphore(1);
    }

    public void loadShip(Ship ship, int containers) {
        try {
            semaphore.acquire();
            if (containers <= containersCount && containers <= ship.getCapacity()) {
                containersCount -= containers;
                ship.loadContainers(containers);
                System.out.println("Корабль загружен. Текущее количество контейнеров в порту: " + containersCount);
            } else {
                System.out.println("Недостаточно контейнеров в порту");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public void unloadShip(Ship ship, int containers) {
        try {
            semaphore.acquire();
            if (containers + containersCount <= capacity && containers <= ship.getContainersCount()) {
                containersCount += containers;
                ship.unloadContainers(containers);
                System.out.println("Корабль разгружен. Текущее количество контейнеров в порту: " + containersCount);
            } else {
                System.out.println("Недостаточно свободного места в порту");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}