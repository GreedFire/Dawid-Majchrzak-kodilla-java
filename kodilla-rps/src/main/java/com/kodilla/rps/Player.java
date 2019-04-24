package com.kodilla.rps;

public interface Player {
    String getName();
    int getPointsInRound();
    void addPoint();
    void resetPoints();
    String pickHand(String write);
}
