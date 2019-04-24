package com.kodilla.rps;

import java.util.Scanner;

class GameControl {
    private boolean stopGame = false;
    private boolean roundEnd = false;
    private int roundCount = 0;
    private int pointsToWin;
    private Player playerOne;
    private Player playerTwo;

    void addPlayers(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private String write(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    void setAILevel(){
        AI player = (AI) playerTwo;
        String result = write();

        while(!(result.equals("easy") || result.equals("medium") || result.equals("hard"))) {

            System.out.println("Wrong value! Set again: ");
            result = write();
        }
        player.setAILevel(result);
    }

    void setPointsToWin(){
        String x = write();

        while(!(x.matches("-?\\d+(\\.\\d+)?") && (Integer.parseInt(x) >= 1 && Integer.parseInt(x) <= 10)) ) {

            System.out.println("Wrong value!");
            x = write();

        }
        this.pointsToWin = Integer.parseInt(x);
    }

    String setName(){
        String name = write();
        while(name.length() < 1 || name.length() > 16) {
            System.out.println("Wrong value");
            name = write();
        }
        return name;
    }

    boolean isStopGame() {
        return stopGame;
    }

    boolean isRoundEnd() {
        return roundEnd;
    }

    private void resetGame(){
        playerOne.resetPoints();
        playerTwo.resetPoints();
        roundCount = 0;
    }

    private String isString(String result){
        if(result.length() == 1)
            return result;
        else
            return "0";
    }

    void showPoints(){
        System.out.println("\nRound: " + roundCount + "   To win: " + pointsToWin + "   " +
                playerOne.getName() + ": " + playerOne.getPointsInRound() + "   " +
                playerTwo.getName() + ": " + playerTwo.getPointsInRound());
    }

    void checkPoints(){
        if(playerOne.getPointsInRound() == pointsToWin) {
            System.out.println("You won the game");
            roundEnd = true;
        }
        else if(playerTwo.getPointsInRound() == pointsToWin) {
            System.out.println("You lost the game");
            roundEnd = true;
        }
    }

    void playAgain() {
        System.out.println("\nDo you want to play again? y/n");
        String x;

        while (!(stopGame == true || roundEnd == false)) {
            x = write();
            switch (x) {
                case "y":
                    resetGame();
                    roundEnd = false;
                    break;
                case "n":
                    stopGame = true;
                    break;
                default:
                    System.out.println("Wrong key");
                    break;
            }
        }
    }


    void gameFlow(){
        String humanPicked = playerOne.pickHand(isString(write()));
        String AIPicked = playerTwo.pickHand(humanPicked);

        switch(humanPicked){
            case "rock":
                    if(AIPicked.equals("rock")) {
                        System.out.println("rock vs rock = " + "Round Draw");
                    }
                    else if(AIPicked.equals("paper")) {
                        System.out.println("rock vs paper = " + "Round Lost");
                        playerTwo.addPoint();
                    }
                    else if(AIPicked.equals("scissors")) {
                        System.out.println("rock vs scissors = " + "Round Won");
                        playerOne.addPoint();
                    }
                    break;

            case "paper":
                if(AIPicked.equals("rock")) {
                    System.out.println("paper vs rock = " + "Round Won");
                    playerOne.addPoint();
                }
                else if(AIPicked.equals("paper")) {
                    System.out.println("paper vs paper = " + "Round Draw");
                }
                else if(AIPicked.equals("scissors")) {
                    System.out.println("paper vs scissors = " + "Round Lost");
                    playerTwo.addPoint();
                }
            break;

            case "scissors":
                if(AIPicked.equals("rock")) {
                    System.out.println("scissors vs rock = " + "Round Lost");
                    playerTwo.addPoint();
                }
                else if(AIPicked.equals("paper")) {
                    System.out.println("scissors vs paper = " + "Round Won");
                    playerOne.addPoint();
                }
                else if (AIPicked.equals("scissors")) {
                    System.out.println("scissors vs scissors = " + "Round Draw");
                }
            break;

            case "quit":
                    System.out.println("Quit");
                    roundEnd = true;
            break;

            case "start again":
                    System.out.println("Started again");
                    resetGame();
            break;

            default: System.out.println("Wrong key");
                     roundCount--;
            break;
        }
        roundCount++;
    }
}
