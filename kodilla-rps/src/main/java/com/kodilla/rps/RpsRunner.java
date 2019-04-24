package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {
        /*
        Deleted multiply scanners, added interface, Player interface pick hands now,
        added AI levels
        fixed bug when nothing happend after picking hand
        test 1.0.1
        */
        
        GameControl game = new GameControl();

        System.out.print("Give your name: ");
            Player me = new Human(game.setName());
            Player enemy = new AI("AI");
                game.addPlayers(me, enemy);

        System.out.println(
                "Key 1: Play rock\n" +
                        "Key 2: Play paper\n" +
                        "Key 3: Play scissors\n" +
                        "Key x: Finish the game\n" +
                        "Key n: Start again");

        while (!(game.isStopGame())) {
            System.out.print("Set AI level(easy, medium, hard): ");
            game.setAILevel();
            System.out.print("\nRounds to win(1-10): ");
            game.setPointsToWin();

            while (!(game.isRoundEnd())) {
                game.showPoints();
                System.out.print("Press key: ");
                game.gameFlow();
                game.checkPoints();
            }
            game.playAgain();
        }

    }
}
