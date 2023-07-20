package Port;

public class ex_4 {
    public static void main(String[] args) {
        Port port = new Port(100);
        Ship ship = new Ship(50);

        Thread loadThread = new Thread(() -> {
            port.loadShip(ship, 30);
        });

        Thread unloadThread = new Thread(() -> {
            port.unloadShip(ship, 20);
        });

        loadThread.start();
        unloadThread.start();
    }
}
