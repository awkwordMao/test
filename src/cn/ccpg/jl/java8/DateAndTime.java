package cn.ccpg.jl.java8;

import java.time.Clock;
import java.time.LocalDateTime;

public class DateAndTime {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
