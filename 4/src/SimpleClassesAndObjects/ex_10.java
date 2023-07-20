package SimpleClassesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class ex_10 {
    public static void main(String[] args) {
        class Airline {
            private String destination;
            private String flightNumber;
            private String aircraftType;
            private String departureTime;
            private List<String> daysOfWeek;

            public Airline(String destination,
                           String flightNumber,
                           String aircraftType,
                           String departureTime,
                           List<String> daysOfWeek) {
                this.destination = destination;
                this.flightNumber = flightNumber;
                this.aircraftType = aircraftType;
                this.departureTime = departureTime;
                this.daysOfWeek = daysOfWeek;
            }

            public String getDestination() {
                return destination;
            }

            public void setDestination(String destination) {
                this.destination = destination;
            }

            public String getFlightNumber() {
                return flightNumber;
            }

            public void setFlightNumber(String flightNumber) {
                this.flightNumber = flightNumber;
            }

            public String getAircraftType() {
                return aircraftType;
            }

            public void setAircraftType(String aircraftType) {
                this.aircraftType = aircraftType;
            }

            public String getDepartureTime() {
                return departureTime;
            }

            public void setDepartureTime(String departureTime) {
                this.departureTime = departureTime;
            }

            public List<String> getDaysOfWeek() {
                return daysOfWeek;
            }

            public void setDaysOfWeek(List<String> daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
            }

            @Override
            public String toString() {
                return "Airline{" +
                        "destination='" + destination + '\'' +
                        ", flightNumber='" + flightNumber + '\'' +
                        ", aircraftType='" + aircraftType + '\'' +
                        ", departureTime='" + departureTime + '\'' +
                        ", daysOfWeek=" + daysOfWeek +
                        '}';
            }
        }

        class FlightManager {
            private List<Airline> airlines;

            public FlightManager() {
                airlines = new ArrayList<>();
            }

            public void addAirline(Airline airline) {
                airlines.add(airline);
            }

            public List<Airline> getFlightsByDestination(String destination) {
                List<Airline> result = new ArrayList<>();
                for (Airline airline : airlines) {
                    if (airline.getDestination().equals(destination)) {
                        result.add(airline);
                    }
                }
                return result;
            }

            public List<Airline> getFlightsByDayOfWeek(String dayOfWeek) {
                List<Airline> result = new ArrayList<>();
                for (Airline airline : airlines) {
                    List<String> daysOfWeek = airline.getDaysOfWeek();
                    if (daysOfWeek.contains(dayOfWeek)) {
                        result.add(airline);
                    }
                }
                return result;
            }

            public List<Airline> getFlightsByDayOfWeekAndDepartureTime(String dayOfWeek, String departureTime) {
                List<Airline> result = new ArrayList<>();
                for (Airline airline : airlines) {
                    List<String> daysOfWeek = airline.getDaysOfWeek();
                    String flightDepartureTime = airline.getDepartureTime();
                    if (daysOfWeek.contains(dayOfWeek) && flightDepartureTime.compareTo(departureTime) > 0) {
                        result.add(airline);
                    }
                }
                return result;
            }
        }

        FlightManager flightManager = new FlightManager();

        // Добавляем несколько авиарейсов в систему
        List<String> daysOfWeek1 = new ArrayList<>();
        daysOfWeek1.add("Monday");
        daysOfWeek1.add("Wednesday");
        daysOfWeek1.add("Friday");
        Airline airline1 = new Airline("Destination1",
                "ABC123",
                "Boeing 747",
                "09:00",
                daysOfWeek1);
        flightManager.addAirline(airline1);

        List<String> daysOfWeek2 = new ArrayList<>();
        daysOfWeek2.add("Tuesday");
        daysOfWeek2.add("Thursday");
        Airline airline2 = new Airline("Destination2",
                "XYZ789",
                "Airbus A320",
                "14:30",
                daysOfWeek2);
        flightManager.addAirline(airline2);

        List<String> daysOfWeek3 = new ArrayList<>();
        daysOfWeek3.add("Monday");
        daysOfWeek3.add("Wednesday");
        daysOfWeek3.add("Friday");
        Airline airline3 = new Airline("Destination3",
                "DEF456",
                "Boeing 737",
                "11:45",
                daysOfWeek3);
        flightManager.addAirline(airline3);

        System.out.println("Список рейсов для пункта назначения 'Destination1':");
        List<Airline> flightsToDestination1 = flightManager.getFlightsByDestination("Destination1");
        for (Airline airline : flightsToDestination1) {
            System.out.println(airline);
        }

        System.out.println("\nСписок рейсов для дня недели 'Monday':");
        List<Airline> flightsOnMonday = flightManager.getFlightsByDayOfWeek("Monday");
        for (Airline airline : flightsOnMonday) {
            System.out.println(airline);
        }

        System.out.println("\nСписок рейсов для дня недели 'Wednesday' с вылетом после '10:00':");
        List<Airline> flightsOnWednesdayAfterTime = flightManager.getFlightsByDayOfWeekAndDepartureTime(
                "Wednesday",
                "10:00");
        for (Airline airline : flightsOnWednesdayAfterTime) {
            System.out.println(airline);
        }
    }
}
