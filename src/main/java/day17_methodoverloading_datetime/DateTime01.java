package day17_methodoverloading_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        //Type code to get current date

        Date currentDate= new Date();
        System.out.println(currentDate);//Thu Jan 26 20:44:23 TRT 2023

        System.out.println(currentDate.getTime());//1674755188515 millisecond from Jan 1 in 1970 to our current date.
        // This structure is used to create unique numeric values

        //Type code to get current time in your local area
        LocalTime myTime= LocalTime.now();
        System.out.println(myTime);//20:50:17.461825800 --<Current time Hours:Minutes:Seconds:NanoSeconds

        //Type code to get current date in your local area

        LocalDate myDate= LocalDate.now();
        System.out.println(myDate);//2023-01-26

        //Type code to get current date and current time in your local area

        LocalDateTime myDateAndTime= LocalDateTime.now();
        System.out.println(myDateAndTime);//2023-01-26T20:54:32.382856500

        //How to get a specific component from date and time

        System.out.println(myDate.getMonthValue());//1

        System.out.println(myDate.getMonth());//JANUARY

        System.out.println(myDateAndTime.getDayOfWeek());//THURSDAY

        //How to get time in another time zone
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); //2023-01-27T03:02:29.044717

        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Istanbul")));//2023-01-26T21:03:59.275245800

        //How to get a future date and time
        System.out.println(myDate.plusYears(3).plusMonths(4).plusDays(12));//2026-06-07

        System.out.println(myTime.minusHours(3).minusMinutes(20));//17:48:34.461871100

        //How to compare two dates

        LocalDate firstKidDob= LocalDate.of(2005, 8, 23);
        LocalDate secondKidDob= LocalDate.of(2011, 3, 11);

        boolean isFirstKidAfter= firstKidDob.isAfter(secondKidDob);
        System.out.println(isFirstKidAfter);//false

        boolean isFirstKidBefore= firstKidDob.isBefore(secondKidDob);
        System.out.println(isFirstKidBefore);//true




    }

}