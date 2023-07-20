package AggregationAndComposition;

import java.util.ArrayList;
import java.util.List;

public class ex_3 {
    public static void main(String[] args) {
        class District {
            private String name;
        }

        class City {
            private String name;

            public City(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }

         class Region {
            private String name;
            private double area;
            private City regionalCenter;
            private List<District> districts;

            public Region(String name, double area, City regionalCenter) {
                this.name = name;
                this.area = area;
                this.regionalCenter = regionalCenter;
                this.districts = new ArrayList<>();
            }

            public void addDistrict(District district) {
                districts.add(district);
            }

            public String getName() {
                return name;
            }

            public double getArea() {
                return area;
            }

            public City getRegionalCenter() {
                return regionalCenter;
            }
        }

        class Country {
            private String name;
            private City capital;
            private List<Region> regions;

            public Country(String name, City capital) {
                this.name = name;
                this.capital = capital;
                this.regions = new ArrayList<>();
            }

            public void addRegion(Region region) {
                regions.add(region);
            }

            public void printCapital() {
                System.out.println("Capital: " + capital.getName());
            }

            public void printNumRegions() {
                System.out.println("Number of regions: " + regions.size());
            }

            public void printArea() {
                double area = 0;
                for (Region region : regions) {
                    area += region.getArea();
                }
                System.out.println("Total area: " + area);
            }

            public void printRegionalCenters() {
                System.out.println("Regional centers:");
                for (Region region : regions) {
                    City regionalCenter = region.getRegionalCenter();
                    System.out.println(region.getName() + ": " + regionalCenter.getName());
                }
            }
        }

        City kyiv = new City("Kyiv");
        City lviv = new City("Lviv");
        City odessa = new City("Odessa");

        Region kyivRegion = new Region("Kyiv region", 10000, kyiv);
        Region lvivRegion = new Region("Lviv region", 8000, lviv);
        Region odessaRegion = new Region("Odessa region", 9000, odessa);

        Country country = new Country("Ukraine", kyiv);

        country.addRegion(kyivRegion);
        country.addRegion(lvivRegion);
        country.addRegion(odessaRegion);

        country.printCapital();
        country.printNumRegions();
        country.printArea();
        country.printRegionalCenters();
    }
}
