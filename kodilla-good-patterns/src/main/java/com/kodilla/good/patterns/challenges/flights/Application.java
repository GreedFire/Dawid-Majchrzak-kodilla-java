package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.data.DailyFlightDataGiver;
import com.kodilla.good.patterns.challenges.flights.data.FlightDatabase;

public class Application {

    public static void main(String[] args){

        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.setFlightList(DailyFlightDataGiver.giveFlightData());

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightDatabase);

        flightSearchEngine.findDeparturesFrom("Gdańsk");
        flightSearchEngine.findDirectDeparturesTo("Kraków");
        flightSearchEngine.findPassByDeparturesTo("Warszawa", "Gdańsk");


    }
}
