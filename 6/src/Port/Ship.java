package Port;


class Ship {
    private int capacity;
    private int containersCount;

    public Ship(int capacity) {
        this.capacity = capacity;
        this.containersCount = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getContainersCount() {
        return containersCount;
    }

    public void loadContainers(int containers) {
        containersCount += containers;
    }

    public void unloadContainers(int containers) {
        containersCount -= containers;
    }
}

