package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {

        String artist = "Tankcsapda";
        LocalDate date = LocalDate.of(2021, 12, 21);
        LocalTime startTime = LocalTime.of(20,0);
        LocalTime endTime = LocalTime.of(22, 0);

        Performance performance = new Performance(artist, date, startTime, endTime);
        System.out.println(performance.getInfo());
    }
}