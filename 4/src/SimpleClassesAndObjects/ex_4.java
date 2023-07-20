package SimpleClassesAndObjects;

import java.util.Arrays;
import java.util.Comparator;

public class ex_4 {
    public static void main(String[] args) {
        class Train {
            private String destination;
            private int trainNumber;
            private String departureTime;

            public Train(String destination, int trainNumber, String departureTime) {
                this.destination = destination;
                this.trainNumber = trainNumber;
                this.departureTime = departureTime;
            }

            public int getTrainNumber() {
                return trainNumber;
            }

            public String getDestination() {
                return destination;
            }

            public String getDepartureTime() {
                return departureTime;
            }

            public static void sortByTrainNumber(Train[] trains) {
                Arrays.sort(trains, Comparator.comparingInt(Train::getTrainNumber));
            }

            public static void sortByDestinationAndDepartureTime(Train[] trains) {
                Arrays.sort(trains, Comparator.comparing(Train::getDestination)
                        .thenComparing(Train::getDepartureTime));
            }

            public static void printTrainInfoByNumber(Train[] trains, int trainNumber) {
                for (Train train : trains) {
                    if (train.getTrainNumber() == trainNumber) {
                        System.out.println("Поезд с номером " + trainNumber + ":");
                        System.out.println("Пункт назначения: " + train.getDestination());
                        System.out.println("Время отправления: " + train.getDepartureTime());
                        return;
                    }
                }
                System.out.println("Поезд с номером " + trainNumber + " не найден.");
            }
        }

        Train[] trains = new Train[5];

        trains[0] = new Train("Москва", 123, "08:00");
        trains[1] = new Train("Санкт-Петербург", 456, "10:30");
        trains[2] = new Train("Москва", 789, "09:45");
        trains[3] = new Train("Казань", 234, "11:15");
        trains[4] = new Train("Санкт-Петербург", 567, "12:30");

        Train.sortByTrainNumber(trains);

        System.out.println();
        System.out.println("Отсортированный массив по номерам поездов:");
        for (Train train : trains) {
            System.out.println("Номер поезда: " + train.getTrainNumber());
            System.out.println("Пункт назначения: " + train.getDestination());
            System.out.println("Время отправления: " + train.getDepartureTime());
            System.out.println();
        }

        Train.printTrainInfoByNumber(trains, 789);

        Train.sortByDestinationAndDepartureTime(trains);

        System.out.println();
        System.out.println("Отсортированный массив по пункту назначения и времени отправления:");
        for (Train train : trains) {
            System.out.println("Номер поезда: " + train.getTrainNumber());
            System.out.println("Пункт назначения: " + train.getDestination());
            System.out.println("Время отправления: " + train.getDepartureTime());
            System.out.println();
        }
    }
}
