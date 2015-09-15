package joda.time;

import org.joda.time.DateTime;
import org.joda.time.format.*;


/**
 * Created by zwshao on 9/15/15.
 */
public class MainJodaTime {

    public static void main(String[] args) {

        DateTimeParser dp = new DateTimeFormatterBuilder()
                .appendLiteral("[")
                .appendLiteral(".")
                .appendFractionOfSecond(3, 9)
                .appendLiteral("]")
                .toParser();


//        System.out.println(dateTimeFormatter.estimateParsedLength());

//        DateTimeFormatter df = DateTimeFormat.forPattern("MMMM D, YYYY");

        DateTime dt = new DateTime();

        DateTimeFormatter df = DateTimeFormat.forPattern("yyyyMMdd");

        System.out.println(df.print(dt));

        DateTimeFormatter df1 = new DateTimeFormatterBuilder()
                .appendDayOfMonth(2)
                .appendLiteral("-")
                .appendFractionOfDay(1, 3)
                .appendLiteral("-")
                .appendMonthOfYear(1)
                .appendLiteral("=")
                .appendTwoDigitYear(-49, true)
                .toFormatter();

        System.out.println(df1.print(dt));

        DateTime dt1 = df1.parseDateTime("15-896-9=15");

        System.out.println(dt1);

        DateTimeFormatter df2 = new DateTimeFormatterBuilder()
                .append(DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ").getParser())
                .toFormatter();

        System.out.println(df2.parseDateTime("2012-11-10T11:11:22Z"));

        DateTimeFormatter df3 = new DateTimeFormatterBuilder()
                .append(DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ").getPrinter())
                .toFormatter();

        DateTime dt2 = df2.parseDateTime("2012-11-10T11:11:22Z");

        System.out.println(df3.print(dt2));


        DateTimeFormatter df4 = new DateTimeFormatterBuilder()
                .appendOptional(DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss").getParser())
//                .append(DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ").getPrinter())
                .toFormatter();

//        System.out.println(df4.print(dt));
        System.out.println("909090");
        System.out.println(df4.parseDateTime(""));
    }
}
