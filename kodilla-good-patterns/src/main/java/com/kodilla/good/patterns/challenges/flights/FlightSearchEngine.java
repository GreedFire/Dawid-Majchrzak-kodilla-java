package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.data.Flight;
import com.kodilla.good.patterns.challenges.flights.data.FlightDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class FlightSearchEngine {
    private FlightDatabase flightDatabase;

    public FlightSearchEngine(FlightDatabase flightDatabase) {
        this.flightDatabase = flightDatabase;
    }

    public void findDeparturesFrom(String city){
        System.out.println("Flights from " + city + ":  \n");
        flightDatabase.getCopyOfFlightList().stream()
                .filter(n -> n.getFrom().equals(city))
                .forEach(System.out::println);
        System.out.print("\n");
    }

    public void findDirectDeparturesTo(String city){
        System.out.println("Direct flights to " + city + ": \n");
        flightDatabase.getCopyOfFlightList().stream()
                .filter(n -> n.getTo().equals(city))
                .forEach(System.out::println);
        System.out.print("\n");
    }

    public void findPassByDeparturesTo(String departureCity, String arrivalCity){

        System.out.println("Flights from " + departureCity + " to " + arrivalCity + ": ");
        Set<Flight> arrivalCityList = flightDatabase.getCopyOfFlightList().stream()
                .filter(n -> n.getTo().equals(arrivalCity))
                .collect(Collectors.toSet());

        Set<Flight> departureCityList = flightDatabase.getCopyOfFlightList().stream()
                .filter(n -> n.getFrom().equals(departureCity))
                .filter(n -> arrivalCityList.stream().map(Flight::getFrom).anyMatch(city -> city.equals(n.getTo())) )
                .collect(Collectors.toSet());

        int i = 1;

        for(Flight flight : departureCityList){
            System.out.println("\n Flight " + i + ": \n" + flight);
            for(Flight flight2 : arrivalCityList){
                if(flight.getTo().equals(flight2.getFrom()))
                    System.out.println(flight2 + " \n");
            }
            i++;
        }
    }
}
