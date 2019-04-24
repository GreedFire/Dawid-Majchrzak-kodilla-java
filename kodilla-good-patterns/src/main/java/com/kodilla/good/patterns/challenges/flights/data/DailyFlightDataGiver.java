package com.kodilla.good.patterns.challenges.flights.data;

import java.time.LocalDateTime;
import java.util.HashSet;

public class DailyFlightDataGiver {
    public static HashSet<Flight> giveFlightData(){
        HashSet<Flight> flightList = new HashSet<>();

        LocalDateTime date1 = LocalDateTime.of(2019, 2, 22, 8, 0);
        LocalDateTime date2 = LocalDateTime.of(2019, 2, 22, 10, 55);
        LocalDateTime date3 = LocalDateTime.of(2019, 2, 22, 12, 0);
        LocalDateTime date4 = LocalDateTime.of(2019, 2, 22, 15, 10);
        LocalDateTime date5 = LocalDateTime.of(2019, 2, 22, 15, 55);
        LocalDateTime date6 = LocalDateTime.of(2019, 2, 22, 17, 0);
        LocalDateTime date7 = LocalDateTime.of(2019, 2, 22, 18, 0);
        LocalDateTime date8 = LocalDateTime.of(2019, 2, 22, 19, 0);

        flightList.add(new Flight("Warszawa", "Kraków", date1, date2, 500));
        flightList.add(new Flight("Warszawa", "Wrocław", date1, date2, 500));
        flightList.add(new Flight("Warszawa", "Toruń", date1, date2, 900));
        flightList.add(new Flight("Warszawa", "Poznań", date1, date2, 900));
        flightList.add(new Flight("Kraków", "Gdańsk", date3, date4, 700));
        flightList.add(new Flight("Gdańsk", "Warszawa", date5, date6, 650));
        flightList.add(new Flight("Gdańsk", "Kraków", date5, date6, 800));
        flightList.add(new Flight("Wrocław", "Kraków", date3, date4, 650));
        flightList.add(new Flight("Wrocław", "Gdańsk", date7, date8, 900));
        flightList.add(new Flight("Toruń", "Poznań", date7, date8, 900));

        return new HashSet<>(flightList);
    }
}
