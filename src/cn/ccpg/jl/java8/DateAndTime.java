package cn.ccpg.jl.java8;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class DateAndTime {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime from = LocalDateTime.of(2018, Month.DECEMBER, 11, 0, 0, 0);
        LocalDateTime end = LocalDateTime.of(2018, Month.DECEMBER, 12, 1, 11, 11);
        Duration duration = Duration.between(from, end);
        System.out.println(duration.toDays() + "-" +duration.toHours() + "-" + duration.toMinutes() + "-" + duration.toMillis());
    }
}
