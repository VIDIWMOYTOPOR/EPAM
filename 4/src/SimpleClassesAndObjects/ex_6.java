package SimpleClassesAndObjects;

public class ex_6 {
    public static void main(String[] args) {
        class Time {
            private int hour;
            private int minute;
            private int second;

            public Time() {
                hour = 0;
                minute = 0;
                second = 0;
            }

            public Time(int hour, int minute, int second) {
                setTime(hour, minute, second);
            }

            public void setTime(int hour, int minute, int second) {
                setHour(hour);
                setMinute(minute);
                setSecond(second);
            }

            public void setHour(int hour) {
                if (hour >= 0 && hour < 24) {
                    this.hour = hour;
                } else {
                    this.hour = 0;
                }
            }

            public void setMinute(int minute) {
                if (minute >= 0 && minute < 60) {
                    this.minute = minute;
                } else {
                    this.minute = 0;
                }
            }

            public void setSecond(int second) {
                if (second >= 0 && second < 60) {
                    this.second = second;
                } else {
                    this.second = 0;
                }
            }

            public void addHours(int hours) {
                hour = (hour + hours) % 24;
            }

            public void addMinutes(int minutes) {
                int totalMinutes = hour * 60 + minute + minutes;
                hour = (totalMinutes / 60) % 24;
                minute = totalMinutes % 60;
            }

            public void addSeconds(int seconds) {
                int totalSeconds = hour * 3600 + minute * 60 + second + seconds;
                hour = (totalSeconds / 3600) % 24;
                minute = (totalSeconds / 60) % 60;
                second = totalSeconds % 60;
            }

            public String getTime() {
                return String.format("%02d:%02d:%02d", hour, minute, second);
            }
        }

        Time time = new Time();
        System.out.println("Текущее время: " + time.getTime());

        time.setHour(10);
        time.setMinute(30);
        time.setSecond(45);
        System.out.println("Измененное время: " + time.getTime());

        time.addHours(2);
        time.addMinutes(15);
        time.addSeconds(30);
        System.out.println("Время после изменений: " + time.getTime());
    }
}
