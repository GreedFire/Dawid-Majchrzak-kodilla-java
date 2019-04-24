package com.kodilla.rps;

import java.util.Random;

public class AI implements Player {
    private String name;
    private int pointsInRound = 0;
    private String level = "easy";

    AI(String name){
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
    void setAILevel(String level){
        this.level = level;
    }

    private int counterHuman(String humanPicked){
        if (humanPicked.equals("rock"))
            return 2;
        else if (humanPicked.equals("paper"))
            return 3;
        else
            return 1;
    }

    public String pickHand(String humanPicked) {
        Random generator = new Random();
        int result = generator.nextInt(3) + 1;
        int chance = generator.nextInt(100) + 1;

        switch (level) {

            case "medium":
                if (chance > 85) {
                    result = counterHuman(humanPicked);
                }
                break;

            case "hard":
                if (chance > 70){
                    result = counterHuman(humanPicked);
                }
                break;
        }

        switch (result) {
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scissors";
            default: return null;
        }
    }

}
