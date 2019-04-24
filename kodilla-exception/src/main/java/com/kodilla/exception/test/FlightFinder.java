package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException{

        HashMap<String, Boolean> availableAirports = new HashMap<>();
            availableAirports.put("Chicago", true);
            availableAirports.put("Warsaw", false);
            availableAirports.put("London", true);
            availableAirports.put("Tokyo", false);

            boolean result;

        if(availableAirports.containsKey(flight.getArrivalAirport()))
            result = availableAirports.get(flight.getArrivalAirport());
        else
            throw new RouteNotFoundException("Route do not exist");

        return result;

    }

    public static void main(String args[]){
        Flight firstFlight = new Flight("Warsaw", "London");
        Flight secondFlight = new Flight("Chicago", "Tokyo");
        Flight thirdFlight = new Flight("Warsaw", "Moscow");

        FlightFinder finder = new FlightFinder();

        try {
            System.out.println("Is route from " + firstFlight.getDepartureAirport() + " to " + firstFlight.getArrivalAirport() +
                    " exist: " + finder.findFlight(firstFlight));
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Is route from " + secondFlight.getDepartureAirport() + " to " + secondFlight.getArrivalAirport() +
                    " exist: " + finder.findFlight(secondFlight));
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        try{
            System.out.print("Is route from " + thirdFlight.getDepartureAirport() + " to " + thirdFlight.getArrivalAirport() +
                    " exist: ");
            System.out.print(finder.findFlight(thirdFlight));
        } catch(RouteNotFoundException e){
            System.out.println(e);
        }
    }
}
