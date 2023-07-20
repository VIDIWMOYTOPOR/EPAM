package AggregationAndComposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex_5 {
    public static void main(String[] args) {
        class TourPackage {
            private String type;
            private String transportation;
            private String accommodation;
            private int duration;

            public TourPackage(String type, String transportation, String accommodation, int duration) {
                this.type = type;
                this.transportation = transportation;
                this.accommodation = accommodation;
                this.duration = duration;
            }

            public String getType() {
                return type;
            }

            public String getTransportation() {
                return transportation;
            }

            public String getAccommodation() {
                return accommodation;
            }

            public int getDuration() {
                return duration;
            }

            @Override
            public String toString() {
                return "TourPackage{" +
                        "type='" + type + '\'' +
                        ", transportation='" + transportation + '\'' +
                        ", accommodation='" + accommodation + '\'' +
                        ", duration=" + duration +
                        '}';
            }
        }
        class TourAgency {
            private List<TourPackage> tourPackages;

            public TourAgency() {
                this.tourPackages = new ArrayList<>();
            }

            public void addTourPackage(TourPackage tourPackage) {
                tourPackages.add(tourPackage);
            }

            public List<TourPackage> getTourPackages() {
                return tourPackages;
            }

            public List<TourPackage> chooseTourPackages(String type,
                                                        String transportation,
                                                        String accommodation,
                                                        int duration) {
                List<TourPackage> chosenPackages = new ArrayList<>();
                for (TourPackage tourPackage : tourPackages) {
                    if (tourPackage.getType().equals(type) &&
                            tourPackage.getTransportation().equals(transportation) &&
                            tourPackage.getAccommodation().equals(accommodation) &&
                            tourPackage.getDuration() >= duration) {
                        chosenPackages.add(tourPackage);
                    }
                }
                return chosenPackages;
            }

            public void sortTourPackages(Comparator<TourPackage> comparator) {
                Collections.sort(tourPackages, comparator);
            }
        }

        TourAgency tourAgency = new TourAgency();

        tourAgency.addTourPackage(
                new TourPackage("Отдых",
                        "Авиаперелет",
                        "Отель",
                        7));
        tourAgency.addTourPackage(
                new TourPackage("Экскурсии",
                        "Автобус",
                        "Гостиница",
                        5));
        tourAgency.addTourPackage(
                new TourPackage("Лечение",
                        "Самолет",
                        "Санаторий",
                        14));
        tourAgency.addTourPackage(
                new TourPackage("Шопинг",
                        "Поезд",
                        "Апартаменты",
                        3));

        String chosenType = "Отдых";
        String chosenTransportation = "Авиаперелет";
        String chosenAccommodation = "Отель";
        int chosenDuration = 7;

        List<TourPackage> chosenPackages = tourAgency.chooseTourPackages(chosenType, chosenTransportation,
                chosenAccommodation, chosenDuration);

        System.out.println("Выбранные путевки:");
        for (TourPackage tourPackage : chosenPackages) {
            System.out.println(tourPackage);
        }

        tourAgency.sortTourPackages(Comparator.comparingInt(TourPackage::getDuration));
        System.out.println("\nОтсортированные путевки по продолжительности:");
        for (TourPackage tourPackage : tourAgency.getTourPackages()) {
            System.out.println(tourPackage);
        }
    }
}
