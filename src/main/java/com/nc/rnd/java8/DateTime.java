package com.nc.rnd.java8;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTime {

    public static void main(String[] args) throws ParseException {
        ZonedDateTime parse = ZonedDateTime.parse("2018-01-02T16:11:00+00:00");
        System.out.println(parse);

        //	Wed Jun 13 21:04:15 IST 2018
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        Date parse2 = sdf.parse("Wed Jun 13 21:04:15 IST 2018");
        System.out.println(parse2);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy");
        LocalDateTime ldt = LocalDateTime.parse("Wed Jun 13 21:04:15 IST 2018", dateTimeFormatter);
        ZonedDateTime zdt = ZonedDateTime.parse("Wed Jul 18 09:10:18 IST 2018", dateTimeFormatter);
        System.out.println("LDT: " + ldt.toString());
        System.out.println("ZDT: " + zdt.toString());

        String format1 = zdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        String format2 = zdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ"));

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
        ZonedDateTime parseZoned = ZonedDateTime.parse("2018-06-13T21:04:15+0300", dtf1);
        LocalDateTime parseLocal = LocalDateTime.parse("2018-06-13T21:04:15+0300", dtf1);
        System.out.println("Parsed Zoned : " + parseZoned);
        System.out.println("Parsed Local: "+ parseLocal);


        System.out.println("Formatted 1: " + format1);
        System.out.println("Formatted 2: " + format2);

        String a;
        if(StringUtils.isEmpty(a = "Nirav"))
        {
            System.out.println(a);
        }
        else{
            System.out.println("Wrong " +a);
        }

 /*       DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.appendValue(ChronoField.DAY_OF_WEEK).appendLiteral(" ").appendValue(ChronoField.MONTH_OF_YEAR).appendLiteral(" ").
                appendValue(ChronoField.DAY_OF_MONTH).appendLiteral(" ").appendValue(ChronoField.HOUR_OF_DAY).appendLiteral(" ").appendValue(ChronoField.MINUTE_OF_HOUR).appendLiteral(":")
                .appendValue(ChronoField.SECOND_OF_MINUTE).appendLiteral(" ").appendValue(ChronoZon);

        ChronoZonedDateTime

        System.out.println(ldt.toString());
     */

        System.out.println( Calendar.getInstance().getTimeInMillis());
    }

}
