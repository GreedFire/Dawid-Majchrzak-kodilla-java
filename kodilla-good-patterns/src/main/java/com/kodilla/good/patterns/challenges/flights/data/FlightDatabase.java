package com.kodilla.good.patterns.challenges.flights.data;

import java.util.HashSet;

public class FlightDatabase {
    private HashSet<Flight> flightList;

    public void setFlightList(HashSet<Flight> receiveFlights) {
        this.flightList = new HashSet<>(receiveFlights);
    }

    public HashSet<Flight> getCopyOfFlightList() {
        return flightList;
    }
}