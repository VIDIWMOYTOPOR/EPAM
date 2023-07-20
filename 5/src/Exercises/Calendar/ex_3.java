package Exercises.Calendar;

import java.util.ArrayList;
import java.util.List;

public class ex_3 {
    public static void main(String[] args) {
        class Calendar {
            private List<Holiday> holidays;

            public Calendar() {
                this.holidays = new ArrayList<>();
            }

            public void add(String date, String name) {
                Holiday holiday = new Holiday(date, name);
                holidays.add(holiday);
            }

            public void print() {
                System.out.println("Holidays:");
                for (Holiday holiday : holidays) {
                    System.out.println(holiday);
                }
            }

            class Holiday {
                private String date;
                private String name;

                public Holiday(String date, String name) {
                    this.date = date;
                    this.name = name;
                }

                public String getDate() {
                    return date;
                }

                public String getName() {
                    return name;
                }

                @Override
                public String toString() {
                    return "Holiday{" +
                            "date='" + date + '\'' +
                            ", name='" + name + '\'' +
                            '}';
                }
            }
        }

        Calendar calendar = new Calendar();

        calendar.add("2023-07-01", "Independence Day");
        calendar.add("2023-12-25", "Christmas");
        calendar.add("2023-01-01", "New Year");

        calendar.print();
    }
}
