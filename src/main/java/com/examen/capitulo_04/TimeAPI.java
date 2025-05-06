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



        //------------------
        var dateNow = LocalDate.now();
        var timeNow = LocalTime.now();
        var dateTimeNow =LocalDateTime.now();
        var zoneIdNow = ZoneId.systemDefault();
        var zoneDateTimeNow= ZonedDateTime.of(dateTimeNow,zoneIdNow);
        Instant instantNow = Instant.now();

        System.out.println("Now: " + instantNow);
        String[] test = instantNow.toString().split("T");
        System.out.println(test[0].toString());
        System.out.println(test[1].toString());

        Instant instantLater = Instant.now();

        var tiempoConsumido = Duration.between(instantNow, instantLater);

        System.out.println(tiempoConsumido.toMillis());


    }
}
