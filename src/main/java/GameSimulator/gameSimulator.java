package main.java.GameSimulator;

import main.java.controllers.GameController;
import main.java.models.*;
import main.java.strategies.gamewinningstrategies.GameWinningStrategy;
import main.java.strategies.gamewinningstrategies.OrderOneGameWinningStrategy;

import java.util.Arrays;

public class gameSimulator {
    public static void main(String[] args) {
        int dimension = 3;
        Player p1 = new HumanPlayer(new Symbol('X') , new User("User1" , 24 , "user@gmail.com"));
        Player p2 = new Bot(new Symbol('O') , BotDifficultyLevel.EASY);

        GameWinningStrategy strategy = new OrderOneGameWinningStrategy();
        GameController gameController = new GameController();
        Game game = gameController.createGame(dimension , Arrays.asList(p1 , p2) , Arrays.asList(strategy));
        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS))
        {
            System.out.println("Please make the next move. This is the current status");
            gameController.display(game);
            gameController.makeMove(game);
        }
        if(gameController.getGameStatus(game).equals(GameStatus.ENDED))
        {
            System.out.println("The winner is " +  gameController.getWinner(game).getUser().getName());
            gameController.display(game);
        }

        if(gameController.getGameStatus(game).equals(GameStatus.DRAW))
        {
            System.out.println("Draw");
            gameController.display(game);
        }


    }
}
