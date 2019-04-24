package com.kodilla.rps;

public class Human implements Player{
    private String name;
    private int pointsInRound = 0;

    Human(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getPointsInRound(){
        return pointsInRound;
    }
    public void addPoint(){
        pointsInRound++;
    }
    public void resetPoints(){
        pointsInRound = 0;
    }

    public String pickHand(String write){
        switch(write){
            case "1": return "rock";
            case "2": return "paper";
            case "3": return "scissors";
            case "x": return "quit";
            case "n": return "start again";
            default:  return "wrong key";
        }
    }
}
