package com.examen.capitulo_04;

import java.time.*;
public class TimeAPI {

    public static void main(String[] args) {


        var zone = ZoneId.of("US/Eastern");
        var date = LocalDate.of(2024,3,13);
        var time = LocalTime.of(2,15);
        var z = ZonedDateTime.of(date, time, zone);


        // Tiempo actual
        var localDate = LocalDate.now();
        System.out.println(  localDate.getDayOfMonth());
        var localTime = LocalTime.now();
        System.out.println(localTime);


        System.out.println(localDate);
    }
}
