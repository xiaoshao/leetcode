package com.java8.newfeatures;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

/**
 * Created by zwshao on 9/28/15.
 */
public class JavaTime {

    public static void localTime() {
        System.out.println("...In duration");
        LocalTime lt = LocalTime.now();

        System.out.println(lt);

        Period period = Period.of(1, 2, 1);
        System.out.println(period);

        Duration duration = Duration.between(LocalTime.now(), LocalTime.now().minusHours(24));
        System.out.println(duration);

        System.out.println("...Out duration");
    }

    public static void DateTimeFormat() {
        System.out.println("in date time format");

        DateTimeFormatter df = new DateTimeFormatterBuilder()
                .appendLiteral("[")
                .appendValue(ChronoField.HOUR_OF_DAY)
                .appendLiteral("-")
                .appendValue(ChronoField.MINUTE_OF_HOUR)
                .appendLiteral("-")
                .appendValue(ChronoField.SECOND_OF_MINUTE)
                .appendLiteral("]")
                .toFormatter();

        System.out.println(df.format(LocalTime.now()));

        StringBuilder sb = new StringBuilder("sec");
        df.formatTo(LocalDateTime.now(), sb);

        System.out.println(sb.toString());
        System.out.println("out date time format");
    }
}
